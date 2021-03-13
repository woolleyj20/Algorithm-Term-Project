import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

public class Algorithm {

    public static void main(String[] args) {
        //scanner for input checking; arraylist to store names
        Scanner scan = new Scanner(System.in);
        ArrayList<String> namesArray = new ArrayList<String>();
        System.out.println("Welcome to our Small Group Creator!");

        //while loop to ensure given filename is accepted; also stores values in namesArray
        while(true) {
            System.out.print("Please specify a text file [1 to quit]: ");
            String filename = scan.nextLine();
            if(filename.equals("1")){
                System.exit(0);
            }
            try {
                File myFile = new File(filename);
                Scanner fileScan = new Scanner(myFile);
                while (fileScan.hasNextLine()) {
                    String data = fileScan.nextLine();
                    if (data.contains(",")) {
                        data = data.replace(",", " +");
                    }
                    namesArray.add(data.trim());
                }
                fileScan.close();
                break;
            } catch (FileNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }

        //gets the output file name and overwrites the file if it already exists
        String outputFile = "";
        try{
            System.out.print("Please enter a name for your output file [no extension]: ");
            outputFile = scan.nextLine().trim() + ".txt";
            File writeFile = new File(outputFile);
            if(!writeFile.createNewFile()){
                writeFile.delete();
                writeFile = new File(outputFile);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

        //while loop to ensure entered groupSize is an int and is > 2
        int groupSize;
        while(true){
            System.out.print("What size of small groups would you like? ");
            if(scan.hasNextInt()){
                groupSize = scan.nextInt();
                if(groupSize > 2){
                    break;
                }else{
                    System.out.println("Please enter a number greater than 2.");
                }
            }else{
                scan.nextLine();
                System.out.println("Please enter a number.");
            }
        }

        scan.close();

        int totalPeople = 0;

        //Graph constructed from default
        Graph<AdjListMember, DefaultEdge> graph = new SimpleDirectedGraph<>(DefaultEdge.class);

        //Set up the list of verticies as AdjListMembers and add them to graph
        ArrayList<AdjListMember> adjList = new ArrayList<>();
        for (String s : namesArray) {
            if (s.contains("+")) {
                AdjListMember member = new AdjListMember(s, 2);
                adjList.add(member);
                graph.addVertex(member);
                totalPeople += 2;
            } else {
                AdjListMember member = new AdjListMember(s, 1);
                adjList.add(member);
                graph.addVertex(member);
                totalPeople += 1;
            }
        }

        //Loop through all combinations of verticies and make an edge for it
        for (int i = 0; i < adjList.size(); i++) {
            for (int j = 0; j < adjList.size(); j++) {
                if (i != j) {
                    //Construct the edge
                    DefaultEdge edge = graph.addEdge(adjList.get(i), adjList.get(j));
                }
            }
        }

        //Add all outgoing edges into the list of edges for each AdjListMember
        for (AdjListMember adjListMember : adjList) {
            adjListMember.edges.addAll(graph.outgoingEdgesOf(adjListMember));
        }

        //Graph is complete!  YAY!  Now the hard part

        //Keep track of the weeks, mostly for printing nicely
        int weekCounter = 1;
        //In order to make sure extra houses aren't created, calculate a cap on the max houses
        int maxHouses = totalPeople / groupSize;

        //Our goal is to deconstruct from a clique, so the goal is to remove all edges.  As such, we only stop if the edgeSet is empty
        while(!graph.edgeSet().isEmpty()) {
            //The makes sure that houses are filled evenly by limiting in later loops how many elements can go over the capacity of a house.  It is declared as an Integer so that decreasing it in a function carries over
            int extrasCount = totalPeople % groupSize;

            //Calculated to determine how full a house can get
            int maxExtraCapacity = (extrasCount / maxHouses);

            if (maxExtraCapacity == 0 && extrasCount > 0) {
                maxExtraCapacity = 1;
            }

            //Declare houses for keeping track of weekly assignment
            ArrayList<House> weeklyHouses = new ArrayList<>();

            //The basic structure of the initial loop.  The loop goes through each member of the list and attempts to assign it the first edge that allows a house assignment, either by creating a new house or joining an existing but not full one.
            for (AdjListMember member : adjList) {
                if (!member.isVisitor && !member.getHostStatus()) {
                    //The if statements checks if the assign method return true or false, depending on if the member was assigned or not
                    if (!assign(member, graph, weeklyHouses, groupSize, maxHouses)) {
                        //If it was not assigned, it then attempts to assign it as an extra
                        if (assignForExtras(member, graph, weeklyHouses, groupSize + maxExtraCapacity, maxHouses, extrasCount)) {
                            extrasCount--;
                        }
                    }
                }
            }

            //Arbitrary assignment of remaining repeat visits

            for (AdjListMember member : adjList) {
                if (!member.isVisitor && !member.getHostStatus()) {
                    for (House house : weeklyHouses) {
                        if (extrasCount > 0 && (house.currentCapacity + member.peopleCount) <= groupSize + maxExtraCapacity) {
                            addToHouse(member, house);
                            if (house.currentCapacity > groupSize) {
                                extrasCount--;
                            }
                            break;
                        }
                        else if (house.currentCapacity + member.peopleCount <= groupSize) {
                            addToHouse(member, house);
                            break;
                        }
                    }
                    if (!member.isVisitor && !member.getHostStatus() && weeklyHouses.size() < maxHouses) {
                        createNewHouseAsHost(member, weeklyHouses);
                    }
                }
            }

            //Resetting all of the host and visitor variables
            for (AdjListMember member : adjList) {
                member.hostHouse = null;
                member.isVisitor = false;
            }
            System.out.println(printWeeklyHouses(weeklyHouses, weekCounter));

            //Writes to file each iteration, appending to the existing file each time
            try{
                FileWriter outWriter = new FileWriter(outputFile, true);
                outWriter.write(printWeeklyHouses(weeklyHouses, weekCounter) + "\n");
                outWriter.close();
            } catch (IOException e){
                System.err.println(e.getMessage());
            }

            weekCounter++;
        }
        System.out.println("Your Small Group assignments have been saved to: " + outputFile);
    }

    public static boolean assign(AdjListMember member, Graph<AdjListMember, DefaultEdge> graph, ArrayList<House> weeklyHouses, int groupSizeCheck, int maxHouses) {
        ArrayList<DefaultEdge> edges = member.edges;
        //Initializing a variable to track the edges left for a member
        for (int i = 0, edgesSize = edges.size(); i < edgesSize; i++) {
            DefaultEdge edge = edges.get(i);
            //This variable stores the edge target so we don't have to repeatedly call getEdgeTarget (which I did at first... it was a bad idea...)
            AdjListMember target = graph.getEdgeTarget(edge);
            //First, it checks if the current target is completely free (not a host and not a visitor)
            if (!target.getHostStatus() && !target.isVisitor) {
                //If true, it then checks if houses are at max capacity and that creating a new house with the current member and target won't go over capacity (only really happens if it's two couples)
                if (weeklyHouses.size() < maxHouses && (member.peopleCount + target.peopleCount) <= groupSizeCheck) {

                    createNewHouse(member, target, weeklyHouses);

                    //After making the house assignments, it's important to first remove the edge from the member so there are no null references, and then remove the edge completely from the graph
                    member.edges.remove(i);
                    graph.removeEdge(edge);

                    return true;
                }
            }
            //If the target is not free, it then checks for a host with a potential house
            else if (target.getHostStatus()) {
                //If the house has space for the member, then add them
                if ((target.hostHouse.getCurrentCapacity() + member.peopleCount) <= groupSizeCheck) {

                    addToHouse(member, target);

                    member.edges.remove(i);
                    graph.removeEdge(edge);

                    return true;
                }
            }
        }
        return false;
    }

    public static boolean assignForExtras(AdjListMember member, Graph<AdjListMember, DefaultEdge> graph, ArrayList<House> weeklyHouses, int groupSizeCheck, int maxHouses, int extrasCount) {
        //This function is only entered if a member wasn't able to be assigned to any new houses or current houses at capacity.  The reason why this is necessary is because of a specific check for a rare case later on.  It also has to compare the new groupSizeCheck
        //against the extrasCount to make sure too many extras aren't assigned

        ArrayList<DefaultEdge> edges = member.edges;
        //Loop through the edges again
        for (int i = 0, edgesSize = edges.size(); i < edgesSize; i++) {
            DefaultEdge edge = edges.get(i);
            //This variable stores the edge target so we don't have to repeatedly call getEdgeTarget (which I did at first... it was a bad idea...)
            AdjListMember target = graph.getEdgeTarget(edge);
            //A very specific case where the groupSizeCheck is less than 4 but two couples need to be assigned to each other.  Under the structure they would never be able to be assigned, so this case takes care of that.
            if (member.peopleCount == 2 && target.peopleCount == 2 && !target.getHostStatus() && extrasCount == 0 && groupSizeCheck < 4) {
                if (!target.getHostStatus() && !target.isVisitor) {

                    createNewHouse(member, target, weeklyHouses);

                    member.edges.remove(i);
                    graph.removeEdge(edge);

                    return false;
                }
                else if (target.getHostStatus()) {
                    addToHouse(member, target);

                    member.edges.remove(i);
                    graph.removeEdge(edge);

                    return false;
                }
            }
            //Same as assign but with an increased groupSizeCheck that also checks
            else if (!target.getHostStatus() && !target.isVisitor && extrasCount > 0) {
                if (weeklyHouses.size() < maxHouses && (member.peopleCount + target.peopleCount) <= groupSizeCheck) {

                    createNewHouse(member, target, weeklyHouses);

                    member.edges.remove(i);
                    graph.removeEdge(edge);

                    return true;
                }
            }
            else if (target.getHostStatus() && extrasCount > 0) {
                if ((target.hostHouse.getCurrentCapacity() + member.peopleCount) <= groupSizeCheck) {

                    addToHouse(member, target);

                    member.edges.remove(i);
                    graph.removeEdge(edge);

                    return true;
                }
            }
        }
        return false;
    }

    public static void createNewHouse(AdjListMember member, AdjListMember target, ArrayList<House> weeklyHouses) {
        House house = new House();
        weeklyHouses.add(house);
        house.assignHost(target);
        house.currentCapacity += target.peopleCount;
        target.hostHouse = house;
        house.addVisitor(member);
        house.currentCapacity += member.peopleCount;
        member.isVisitor = true;
    }

    public static void createNewHouseAsHost(AdjListMember member, ArrayList<House> weeklyHouses) {
        House house = new House();
        weeklyHouses.add(house);
        house.assignHost(member);
        house.currentCapacity += member.peopleCount;
        member.hostHouse = house;
    }

    public static void addToHouse(AdjListMember member, AdjListMember target) {
        target.hostHouse.addVisitor(member);
        target.hostHouse.currentCapacity += member.peopleCount;
        member.isVisitor = true;
    }

    public static void addToHouse(AdjListMember member, House house) {
        house.addVisitor(member);
        house.currentCapacity += member.peopleCount;
        member.isVisitor = true;
    }

    public static String printWeeklyHouses(ArrayList<House> houseList, int weekNumber) {
        StringBuilder retval = new StringBuilder();
        retval.append("Week ").append(weekNumber).append(":\n");
        for (int i = 0; i < houseList.size(); i++) {
            retval.append("House ").append(i).append(": ").append(houseList.get(i).toString()).append("\n");
        }
        return retval.toString();
    }
}


//Inputs: List of names/group size
//
//List<String> names = List from the file
//
//Graph<V, E>() graph = new Graph;
//for (i = 0; i < names.length; i++) {
//    graph.addVertex(names at i)
//}
//
//for (i = 0; i < names.length; i++) {
//    for (j = 0; j < names.length; j++) {
//        if (i != j) {
//            graph.addEdge(names[i], names[j]);
//        }
//    }
//}
//
//List<AdjListMember> adjList
//
//for (i = 0; i < names.length; i++) {
//    Make AdjListMemeber member from names[i];
//    member.edges = outgoing edges of member from graph
//    add member to adjList
//}
//
////Setup complete
//
//while (graph contains edges) {
//    Create list of houses
//    int assignmentTrack = number of members
//    foreach (AdjListMemeber in adjList) {
//        if (not host and not visitor) {
//            for (edge in member.edge) {
//                if (edgeDestination is not host and is not visitor) {
//                    Create house with host as edge.destination and origin as visitor
//                    Mark members as needed (host/visitor);
//                    member.edges remove edge
//                    graph.removeEdge(edge)
//                    assignmentTrack -= 2
//                    break;
//                }
//                elseif (edgeDestination is host) {
//                    if (house has space){
//                        add as visitor
//                        mark as visitor
//                        member.edges remove edge
//                        graph.removeEdge(edge)
//                        assignmentTrack--
//                        break;
//                    }
//                }
//            }
//        }
//    }
//
//    if (assignmentTrack > 0) {
//       for (AdjListMember in adjList) {
//           if (not assigned) {
//               if (edges is empty)
//                   for (house in houses) {
//                       if (house is available) {
//                           add as visitor
//                            mark as visitor
//                            assignmentTrack--
//                            break;
//                        }
//                       else {
//                           if (assignmentTrack > 1) {
//                               create house with member as host
//                                mark mosting
//                                assignmentTrack--
//                                break;
//                            }
//                           else {
//                               assign to the first house
//                            }
//                        }
//                    }
//            }
//        }
//    }
//
//    print list of houses
//    reset isHost and isVisitor variables
//    //Maybe clear houses?  idk
//}
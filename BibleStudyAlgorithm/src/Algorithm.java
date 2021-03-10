import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import java.util.ArrayList;

public class Algorithm {


    public static void main(String[] args) {
        //Temporary hard coded inputs
        int totalPeople = 0;
        String[] namesArray = {"Claude", "Lorenz", "Raphael", "Ignatz", "Lysithea", "Marianne", "Hilda", "Leonie", "Dimitri", "Dedue", "Felix", "Ashe", "Sylvain", "Mercedes", "Annette", "Ingrid", "Edelgard", "Hubert", "Ferdinand", "Linhardt", "Caspar", "Bernadetta", "Dorothea", "Petra"};

        ArrayList<AdjListMember> adjList = new ArrayList<>();
        for (String s : namesArray) {
            if (s.contains("+")) {
                adjList.add(new AdjListMember(s, 2));
                totalPeople += 2;
            } else {
                adjList.add(new AdjListMember(s, 1));
                totalPeople += 1;
            }
        }

        int groupSize = 12;

        //Graph constructed from default
        Graph<AdjListMember, DefaultWeightedEdge> graph = new SimpleDirectedWeightedGraph<>(DefaultWeightedEdge.class);

        //Loop through the AdjListMembers and make them verticies
        for (AdjListMember adjListMember : adjList) {
            graph.addVertex(adjListMember);
        }

        //Loop through all combinations of verticies and make an edge for it
        for (int i = 0; i < adjList.size(); i++) {
            for (int j = 0; j < adjList.size(); j++) {
                if (i != j) {
                    //Construct the edge and set the weight
                    //NOTE: Later this will have to take into account married couples
                    DefaultWeightedEdge edge = graph.addEdge(adjList.get(i), adjList.get(j));
                    if (adjList.get(i).name.contains("+")) {
                        graph.setEdgeWeight(edge, 2);
                    }
                    else {
                        graph.setEdgeWeight(edge, 1);
                    }

                }
            }
        }

        //Add all outgoing edges into the list of edges for each AdjListMember
        for (AdjListMember adjListMember : adjList) {
            adjListMember.edges.addAll(graph.outgoingEdgesOf(adjListMember));
        }

        //Graph is complete!  YAY!  Now the hard part

        int weekCounter = 1;
        int maxHouses = totalPeople / groupSize;

        //Our goal is to deconstruct from a clique, so the goal is to remove all edges.  As such, we only stop if the edgeSet is empty
        while(!graph.edgeSet().isEmpty()) {
            int extrasCount = totalPeople % groupSize;
            int maxExtraCapacity = (extrasCount / maxHouses);
            if (extrasCount > 0 && maxExtraCapacity == 0) {
                maxExtraCapacity = 1;
            }
            ArrayList<House> weeklyHouses = new ArrayList<>();
            for (AdjListMember member : adjList) {
                if (!member.isVisitor && !member.getHostStatus()) {
                    if (!assign(member, graph, weeklyHouses, groupSize, maxHouses)) {
                        assignForExtras(member, graph, weeklyHouses, groupSize + maxExtraCapacity, maxHouses, extrasCount);
                    }
                }
            }

            //Arbitrary assignment of remaining repeat visits

            for (AdjListMember member : adjList) {
                int distributeHouseIndex = 0;
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
                    else if (!member.isVisitor && !member.getHostStatus()){
                        if (distributeHouseIndex < maxHouses) {
                            addToHouse(member, weeklyHouses.get(distributeHouseIndex));
                            distributeHouseIndex++;
                        }
                        else {
                            distributeHouseIndex = 0;
                            addToHouse(member, weeklyHouses.get(distributeHouseIndex));
                            distributeHouseIndex++;
                        }
                    }
                }
            }

            //Resetting all of the host and visitor variables
            for (AdjListMember member : adjList) {
                member.hostHouse = null;
                member.isVisitor = false;
            }
            System.out.println(printWeeklyHouses(weeklyHouses, weekCounter));
            weekCounter++;
        }



    }

    public static boolean assign(AdjListMember member, Graph<AdjListMember, DefaultWeightedEdge> graph, ArrayList<House> weeklyHouses, int groupSizeCheck, int maxHouses) {
        ArrayList<DefaultWeightedEdge> edges = member.edges;
        for (int i = 0, edgesSize = edges.size(); i < edgesSize; i++) {
            DefaultWeightedEdge edge = edges.get(i);
            //This variable stores the edge target so we don't have to repeatedly call getEdgeTarget (which I did at first... it was a bad idea...)
            AdjListMember target = graph.getEdgeTarget(edge);
            if (!target.getHostStatus() && !target.isVisitor) {
                if (weeklyHouses.size() < maxHouses && (member.peopleCount + target.peopleCount) <= groupSizeCheck) {

                    createNewHouse(member, target, weeklyHouses);

                    member.edges.remove(i);
                    graph.removeEdge(edge);

                    return true;
                }
            }
            else if (target.getHostStatus()) {
                //This will need to change slightly when we account for married couples
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

    public static void assignForExtras(AdjListMember member, Graph<AdjListMember, DefaultWeightedEdge> graph, ArrayList<House> weeklyHouses, int groupSizeCheck, int maxHouses, int extrasCount) {
        ArrayList<DefaultWeightedEdge> edges = member.edges;
        for (int i = 0, edgesSize = edges.size(); i < edgesSize; i++) {
            DefaultWeightedEdge edge = edges.get(i);
            //This variable stores the edge target so we don't have to repeatedly call getEdgeTarget (which I did at first... it was a bad idea...)
            AdjListMember target = graph.getEdgeTarget(edge);
            if (member.peopleCount == 2 && target.peopleCount == 2 && extrasCount == 0 && groupSizeCheck < 4) {
                if (!target.getHostStatus() && !target.isVisitor) {
                    createNewHouse(member, target, weeklyHouses);

                    member.edges.remove(i);
                    graph.removeEdge(edge);

                    return;
                }
                else if (target.getHostStatus()) {
                    addToHouse(member, target);

                    member.edges.remove(i);
                    graph.removeEdge(edge);

                    return;
                }
            }
            else if (!target.getHostStatus() && !target.isVisitor) {
                if (weeklyHouses.size() < maxHouses && (member.peopleCount + target.peopleCount) <= groupSizeCheck) {

                    createNewHouse(member, target, weeklyHouses);

                    member.edges.remove(i);
                    graph.removeEdge(edge);

                    extrasCount--;
                    return;
                }
            }
            else if (target.getHostStatus()) {
                if ((target.hostHouse.getCurrentCapacity() + member.peopleCount) <= groupSizeCheck) {

                    addToHouse(member, target);

                    member.edges.remove(i);
                    graph.removeEdge(edge);

                    extrasCount--;
                    return;
                }
            }
        }
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
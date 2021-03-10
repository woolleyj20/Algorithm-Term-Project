import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import java.util.ArrayList;

public class Algorithm {


    public static void main(String[] args) {
        //Temporary hard coded inputs
        String[] namesArray = {"A", "B", "C", "D", "E", "F", "G", "H"};
        ArrayList<AdjListMember> adjList = new ArrayList<AdjListMember>();
        for (int i = 0; i < namesArray.length; i++) {
            adjList.add(new AdjListMember(namesArray[i]));
        }

        int groupSize = 3;

        //Graph constructed from default
        Graph<AdjListMember, DefaultWeightedEdge> graph = new SimpleDirectedWeightedGraph<AdjListMember, DefaultWeightedEdge>(DefaultWeightedEdge.class);

        //Loop through the AdjListMembers and make them verticies
        for (int i = 0; i < adjList.size(); i++) {
            graph.addVertex(adjList.get(i));
        }

        //Loop through all combinations of verticies and make an edge for it
        for (int i = 0; i < adjList.size(); i++) {
            for (int j = 0; j < adjList.size(); j++) {
                if (i != j) {
                    //Construct the edge and set the weight
                    //NOTE: Later this will have to take into account married couples
                    DefaultWeightedEdge edge = graph.addEdge(adjList.get(i), adjList.get(j));
                    graph.setEdgeWeight(edge, 1);
                }
            }
        }

        //Add all outgoing edges into the list of edges for each AdjListMember
        for (int i = 0; i < adjList.size(); i++) {
            adjList.get(i).edges.addAll(graph.outgoingEdgesOf(adjList.get(i)));
        }

        //Graph is complete!  YAY!  Now the hard part

        //Our goal is to deconstruct from a clique, so the goal is to remove all edges.  As such, we only stop if the edgeSet is empty
        while(!graph.edgeSet().isEmpty()) {
            ArrayList<House> weeklyHouses = new ArrayList<House>();
            int assignmentTrack = adjList.size();
            for (AdjListMember member : adjList) {
                if (!member.isVisitor && !member.getHostStatus()) {
                    ArrayList<DefaultWeightedEdge> edges = member.edges;
                    for (int i = 0, edgesSize = edges.size(); i < edgesSize; i++) {
                        DefaultWeightedEdge edge = edges.get(i);
                        //This variable stores the edge target so we don't have to repeatedly call getEdgeTarget (which I did at first... it was a bad idea...)
                        AdjListMember target = graph.getEdgeTarget(edge);
                        if (!target.getHostStatus() && !target.isVisitor) {
                            House house = new House();
                            weeklyHouses.add(house);
                            house.assignHost(target);
                            target.hostHouse = house;
                            house.addVisitor(member);
                            member.isVisitor = true;

                            member.edges.remove(i);
                            graph.removeEdge(edge);

                            assignmentTrack -= 2;
                            break;
                        } else if (target.getHostStatus()) {
                            //This will need to change slightly when we account for married couples
                            if (target.hostHouse.getCurrentCapacity() < groupSize) {
                                target.hostHouse.addVisitor(member);
                                member.isVisitor = true;
                                member.edges.remove(i);
                                graph.removeEdge(edge);
                                assignmentTrack--;
                                break;
                            }
                        }
                    }
                }
            }
        }

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
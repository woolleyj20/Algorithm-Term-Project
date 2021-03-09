public class Algorithm {
}

class AdjListMemeber {
    public String name;
    public List<Edge> edges;
    public bool isHost;
    public bool isVisitor;
}

class House {
    public String host;
    public List<String> visitor;
}


Inputs: List of names/group size

List<String> names = List from the file

Graph<V, E>() graph = new Graph;
for (i = 0; i < names.length; i++) {
    graph.addVertex(names at i)
}

for (i = 0; i < names.length; i++) {
    for (j = 0; j < names.length; j++) {
        if (i != j) {
            graph.addEdge(i, j);
        }
    }
}

List<AdjListMemeber> adjList

for (i = 0; i < names.length; i++) {
    Make AdjListMemeber member from names[i];
    member.edges = outgoint edges of member from graph
    add member to adjList
}

//Setup complete

while (graph contains edges) {
    Create list of houses
    int assignmentTrack = number of members
    foreach (AdjListMemeber in adjList) {
        for (edge in member.edge) {
            if (edgeDestination is not host and is not visitor) {
                Create house with host as edge.destination and origin as visitor
                Mark members as needed (host/visitor);
                graph.removeEdge(edge)
                assignmentTrack--
                break;
            }
            elseif (edgeDestination is host) {
                if (house has space){
                    add as visitor
                    mark as visitor
                    graph.removeEdge(edge)
                    assignmentTrack--
                    break;
                }
            }
        }
    }

    if (assignmentTrack > 0) {
       for (AdjListMember in adjList) {
           if (not assigned) {
               for (house in houses) {
                   if (house is available) {
                       add as visitor
                        mark as visitor
                        assignmentTrack--
                        break;
                    }
                   else {
                       if (assignmentTrack > 1) {
                           create house with member as host
                            mark mosting
                            assignmentTrack--
                            break;
                        }
                       else {
                           assign to the first house
                        }
                    }
                }
            }
        }
    }

    print list of houses
    //Maybe clear houses?  idk
}
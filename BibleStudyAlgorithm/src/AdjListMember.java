import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;

import java.util.ArrayList;

public class AdjListMember {
    public String name;
    public ArrayList<DefaultWeightedEdge> edges;
    public House hostHouse;
    public boolean isVisitor;

    public AdjListMember(String name) {
        this.name = name;
        edges = new ArrayList<DefaultWeightedEdge>();
        hostHouse = null;
        isVisitor = false;
    }

    public boolean getHostStatus() {
        return !(hostHouse == null);
    }

    @Override
    public String toString() {
        return name;
    }
}

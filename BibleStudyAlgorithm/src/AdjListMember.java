import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;

import java.util.ArrayList;

public class AdjListMember {
    public String name;
    public int peopleCount;
    public ArrayList<DefaultEdge> edges;
    public House hostHouse;
    public boolean isVisitor;

    public AdjListMember(String name, int peopleCount) {
        this.name = name;
        this.peopleCount = peopleCount;
        edges = new ArrayList<DefaultEdge>();
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

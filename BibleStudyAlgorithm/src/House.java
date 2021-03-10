import java.util.ArrayList;

public class House {
    public AdjListMember host;
    public ArrayList<AdjListMember> visitors;

    public House() {
        visitors = new ArrayList<AdjListMember>();
    }

    public void assignHost(AdjListMember member) {
        host = member;
    }

    public void addVisitor(AdjListMember visitor) {
        visitors.add(visitor);
    }

    public int getCurrentCapacity() {
        return 1 + visitors.size();
    }

    @Override
    public String toString() {
        String retval = "";
        retval += host.name + "(host) | " + visitors.toString();
        return retval;
    }
}

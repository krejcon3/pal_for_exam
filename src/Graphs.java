import nodes.ChildsNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Graphs {

    /**
     * @author Ondřej Krejčíř
     */
    public static void dfs(ChildsNode start) {
        Stack<ChildsNode> toVisit = new Stack<ChildsNode>();
        HashSet<ChildsNode> visited = new HashSet<ChildsNode>();
        toVisit.push(start);
        ChildsNode n;
        while (!toVisit.empty()) {
            n = toVisit.pop();
            if (!visited.contains(n)) {
                visited.add(n);
                for (ChildsNode c : n.childs) {
                    toVisit.push(c);
                }
            }
        }
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static void bfs(ChildsNode start) {
        LinkedList<ChildsNode> toVisit = new LinkedList<ChildsNode>(); // it's a queve
        HashSet<ChildsNode> visited = new HashSet<ChildsNode>();
        toVisit.add(start);
        ChildsNode n;
        while (toVisit.size() > 0) {
            n = toVisit.poll();
            if (!visited.contains(n)) {
                visited.add(n);
                for (ChildsNode c : n.childs) {
                    toVisit.add(c);
                }
            }
        }
    }

    public static void rdfs() {}

    public static void rbfs() {}

    public static void kosarajuSharir() {}

    public static void tarjan() {}

    public static void eulerTrail() {}

    public static void hamiltonianPath() {}

    public static void union() {}

    public static void find() {}

    public static void jarnik() {}

    public static void boruvka() {}

    public static void kruskal() {}
}

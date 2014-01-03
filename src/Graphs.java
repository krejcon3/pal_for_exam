import nodes.ChildsNode;
import nodes.ParentNode;

import java.util.HashMap;
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

    /**
     * @author Ondřej Krejčíř
     */
    public static HashMap<Object, ParentNode> parentNodeHashMap = new HashMap<Object, ParentNode>();

    /**
     * @author Ondřej Krejčíř
     */
    public static boolean union(Object o1, Object o2) {
        ParentNode a = find(o1);
        ParentNode b = find(o2);

        if (!a.content.equals(b.content)) {
            a.parent = b;
            return true;
        }
        return false;
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static ParentNode find(Object o) {
        ParentNode n;
        if (parentNodeHashMap.containsKey(o)) {
            n = parentNodeHashMap.get(o);
            while (n.parent != null) {
                n = n.parent;
            }
        } else {
            n = new ParentNode(o);
            parentNodeHashMap.put(o, n);
        }
        return n;
    }

    public static void jarnik() {}

    public static void boruvka() {}

    public static void kruskal() {}
}

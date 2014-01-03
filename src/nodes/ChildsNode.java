package nodes;

import java.util.ArrayList;

/**
 * @author Ondřej Krejčíř
 */
public class ChildsNode extends Node {

    public ArrayList<ChildsNode> childs = new ArrayList<ChildsNode>();

    public ChildsNode() {
        super();
    }

    public ChildsNode(Object o) {
        super(o);
    }
}

package nodes;

import java.util.ArrayList;

/**
 * @author Ondřej Krejčíř
 */
public class Component {
    public ArrayList<Node> nodes;
    public ArrayList<Node> inputs;
    public ArrayList<Node> outputs;
    public ArrayList<Node> towns;
    public int count;

    public Component() {
        this.nodes = new ArrayList<Node>();
        this.inputs = new ArrayList<Node>();
        this.outputs  = new ArrayList<Node>();
        this.towns = new ArrayList<Node>();
        this.count = 0;
    }

    public void addNode(Node node) {
        this.nodes.add(node);
        this.count++;
    }
}

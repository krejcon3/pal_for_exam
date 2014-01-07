package nodes;

import java.util.ArrayList;

/**
 * @author Ondřej Krejčíř
 */
public class TarjanNode extends Node {

    public int index = -1;
    public int lowlink = -1;
    public boolean instack = false;
    public TarjanNode prev = null;
    public ArrayList<TarjanNode> childs;

}

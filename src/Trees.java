import nodes.BinaryNode;

public class Trees {

    public static void binaryTreeInsert() {}

    public static void binaryTreeRoot() {}

    public static void binaryTreeDeleteRoot() {}

    public static void binaryTreeDeleteNode() {}


    /**
     * @author Ondřej Krejčíř
     */
    public static BinaryNode binaryTreeBalanceLeftRotation(BinaryNode root) {
        if (root == null) {
            return root;
        }
        BinaryNode p1 = root.right;
        if (p1 == null) {
            return root;
        }
        root.right = p1;
        p1.left = root;
        return p1;
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static BinaryNode binaryTreeBalanceRightRotation(BinaryNode root) {
        if (root == null) {
            return root;
        }
        BinaryNode p1 = root.right;
        if (p1 == null) {
            return root;
        }
        root.left = p1.right;
        p1.right = root;
        return p1;
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static BinaryNode binaryTreeBalanceLeftRightRotation(BinaryNode root) {
        BinaryNode p1 = root.left;
        BinaryNode p2 = p1.right;
        p2.right = root;
        p1.right = p2.left;
        p2.left = p1;
        return p2;
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static BinaryNode binaryTreeBalanceRightLeftRotation(BinaryNode root) {
        BinaryNode p1 = root.right;
        BinaryNode p2 = root.left;
        p2.left = root;
        p1.left = p2.right;
        p2.right = p1;
        return p2;
    }


    public static void avlTreeInsert() {}

    public static void avlTreeRoot() {}

    public static void avlTreeDeleteRoot() {}

    public static void avlTreeDeleteNode() {}

    /**
     * @author Ondřej Krejčíř
     */
    public static int avlTreeHeight(BinaryNode n) {
        if (n != null) {
            return 1 + Math.max(avlTreeHeight(n.left), avlTreeHeight(n.right));
        }
        return -1;
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static int avlTreeBAL(BinaryNode n) {
        return avlTreeHeight(n.left) - avlTreeHeight(n.right);
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static BinaryNode avlTreeBalanceLeftRotation(BinaryNode root) {
        return binaryTreeBalanceLeftRotation(root);
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static BinaryNode avlTreeBalanceRightRotation(BinaryNode root) {
        return binaryTreeBalanceRightRotation(root);
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static BinaryNode avlTreeBalanceLeftRightRotation(BinaryNode root) {
        return binaryTreeBalanceLeftRightRotation(root);
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static BinaryNode avlTreeBalanceRightLeftRotation(BinaryNode root) {
        return binaryTreeBalanceRightLeftRotation(root);
    }


    public static void weightedTreeInsert() {}

    public static void weightedTreeRoot() {}

    public static void weightedTreeDeleteRoot() {}

    public static void weightedTreeDeleteNode() {}

    public static void weightedTreeBalanceLeftRotation() {}

    public static void weightedTreeBalanceRightRotation() {}

    public static void weightedTreeBalanceLeftRightRotation() {}

    public static void weightedTreeBalanceRightLeftRotation() {}


    public static void redBlackTreeInsert() {}

    public static void redBlackTreeDelete() {}

    public static void redBlackTreeSearch() {}


    public static void bTreeInsert() {}

    public static void bTreeDelete() {}

    public static void bTreeSearch() {}


    public static void twoThreeFourTreeInsert() {}

    public static void twoThreeFourTreeDelete() {}

    public static void twoThreeFourTreeSearch() {}


    public static void bPlusTreeInsert() {}

    public static void bPlusTreeDelete() {}

    public static void bPlusTreeSearch() {}


    public static void splayTreeInsert() {}

    public static void splayTreeRotation() {}


    public static void kdPlusTreeInsert() {}

    public static void kdPlusTreeDelete() {}

    public static void kdPlusTreeNearestNeighborSearch() {}


    public static void binaryTrieInsert() {}

    public static void binaryTrieDelete() {}

    public static void binaryTrieSearch() {}


    public static void PatriciaTrieInsert() {}

    public static void PatriciaTrieDelete() {}

    public static void PatriciaTrieSearch() {}
}

public class Main {

    public static void main(String[] args) {
        System.out.println("List of classes:");
        System.out.println(" - Automata.java");
        System.out.println(" - Combinatorics.java");
        System.out.println(" - Graphs.java");
        System.out.println(" - Heaps.java");
        System.out.println(" - Isomorphism.java");
        System.out.println(" - Trees.java");
        System.out.println();
        System.out.println("All algorithms will be as static functions for more generalization.");
        System.out.println("Please write your name up to function which you wrote.");
        System.out.println("/**");
        System.out.println(" * @author Jack Smith");
        System.out.println(" */");

        Heaps.BinaryHeapInsert(0);
        Heaps.BinaryHeapInsert(3);
        Heaps.BinaryHeapInsert(5);
        Heaps.BinaryHeapInsert(1);
        Heaps.BinaryHeapInsert(2);
        Heaps.BinaryHeapInsert(0);
        Heaps.BinaryHeapInsert(6);
        Heaps.BinaryHeapInsert(0);
        for (int i = 0; i < Heaps.binaryNextIndex; i++) {
            System.out.print(Heaps.binaryHeap[i] + " ");
        }
        System.out.println();
        Heaps.BinaryHeapDeleteMin();
        for (int i = 0; i < Heaps.binaryNextIndex; i++) {
            System.out.print(Heaps.binaryHeap[i] + " ");
        }
        System.out.println();
        Heaps.BinaryHeapDeleteMin();
        for (int i = 0; i < Heaps.binaryNextIndex; i++) {
            System.out.print(Heaps.binaryHeap[i] + " ");
        }
        System.out.println();
        Heaps.BinaryHeapDeleteMin();
        for (int i = 0; i < Heaps.binaryNextIndex; i++) {
            System.out.print(Heaps.binaryHeap[i] + " ");
        }
        System.out.println();
        Heaps.BinaryHeapDeleteMin();
        for (int i = 0; i < Heaps.binaryNextIndex; i++) {
            System.out.print(Heaps.binaryHeap[i] + " ");
        }
        System.out.println();
        Heaps.BinaryHeapDeleteMin();
        for (int i = 0; i < Heaps.binaryNextIndex; i++) {
            System.out.print(Heaps.binaryHeap[i] + " ");
        }
        System.out.println();
        Heaps.BinaryHeapDeleteMin();
        for (int i = 0; i < Heaps.binaryNextIndex; i++) {
            System.out.print(Heaps.binaryHeap[i] + " ");
        }
        System.out.println();
        Heaps.BinaryHeapDeleteMin();
        for (int i = 0; i < Heaps.binaryNextIndex; i++) {
            System.out.print(Heaps.binaryHeap[i] + " ");
        }
        System.out.println();
        Heaps.BinaryHeapDeleteMin();
        for (int i = 0; i < Heaps.binaryNextIndex; i++) {
            System.out.print(Heaps.binaryHeap[i] + " ");
        }
        System.out.println();
    }
}

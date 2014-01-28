public class Heaps {

    public static int[] binaryHeap = new int[100];
    public static int binaryNextIndex = 0;

    /**
     * @author Ondřej Krejčíř
     */
    public static int binaryGetParentIndex(int index) {
        if (index == 0) {
            return -1;
        }
        return (int)Math.floor((index - 1) / 2);
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static int binaryGetLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static int binaryGetRightChildIndex(int index) {
        return 2 * index + 2;
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static void BinaryHeapInsert(int n) {
        if (binaryNextIndex == 0) {
            binaryHeap[binaryNextIndex++] = n;
        } else {
            int actualIndex = binaryNextIndex;
            binaryHeap[binaryNextIndex++] = n;
            int parentIndex = binaryGetParentIndex(actualIndex);
            while(binaryHeap[parentIndex] > binaryHeap[actualIndex] && parentIndex >= 0 && actualIndex >= 0) {
                swapIntArray(binaryHeap, actualIndex, parentIndex);
                actualIndex = parentIndex;
                parentIndex = binaryGetParentIndex(actualIndex);
            }
        }
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static int BinaryHeapAccessMin() {
        return binaryHeap[0];
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static int BinaryHeapDeleteMin() {
        binaryNextIndex--;
        int temp = binaryHeap[binaryNextIndex];
        swapIntArray(binaryHeap, binaryNextIndex, 0);
        heapify(0);
        return temp;
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static void heapify(int index) {
        if (index < 0) {
            return;
        }
        int left = binaryGetLeftChildIndex(index);
        int right = binaryGetRightChildIndex((index));
        if (left >= binaryNextIndex) {
            binaryHeap[left] = Integer.MAX_VALUE;
        }
        if (right >= binaryNextIndex) {
            binaryHeap[right] = Integer.MAX_VALUE;
        }
        if (binaryHeap[left] > binaryHeap[right]) {
            if (binaryHeap[index] > binaryHeap[right]) {
                swapIntArray(binaryHeap, right, index);
                heapify(right);
            }
        } else {
            if (binaryHeap[index] > binaryHeap[left]) {
                swapIntArray(binaryHeap, left, index);
                heapify(left);
            }
        }
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static void BinaryHeapDecreaseKey(int index) {
        binaryHeap[index]--;
        int parentIndex = binaryGetParentIndex(index);
        while(binaryHeap[parentIndex] > binaryHeap[index] && parentIndex >= 0 && index >= 0) {
            swapIntArray(binaryHeap, index, parentIndex);
            index = parentIndex;
            parentIndex = binaryGetParentIndex(index);
        }
    }

    public static void BinaryHeapMergeHeaps() {}

    public static void BinaryHeapDeleteKey() {}


    public static void BinomialHeapInsert() {}

    public static void BinomialHeapAccessMin() {}

    public static void BinomialHeapDeleteMin() {}

    public static void BinomialHeapDecreaseKey() {}

    public static void BinomialHeapMergeHeaps() {}

    public static void BinomialHeapDeleteKey() {}


    public static void FibonacciHeapInsert() {}

    public static void FibonacciHeapConsolidate() {}

    public static void FibonacciHeapDeleteMin() {}

    public static void FibonacciHeapDecreaseKey() {}

    public static void FibonacciHeapMergeHeaps() {}

    public static void FibonacciHeapDeleteKey() {}

    public static int[] swapIntArray(int[] array, int s, int d) {
        int temp = array[s];
        array[s] = array[d];
        array[d] = temp;
        return array;
    }
}

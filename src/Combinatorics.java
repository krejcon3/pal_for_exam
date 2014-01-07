import java.util.HashSet;

public class Combinatorics {

    /**
     * @author Ondřej Krejčíř
     */
    public static int subsetLexRank(int size, HashSet<Integer> T) {
        int r = 0;
        for (int i = 1; i <= size; i++) {
            if (T.contains(i)) {
                r = r + ((int)Math.pow(2, size - i));
            }
        }
        return r;
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static HashSet<Integer> subsetLexUnRank(int size, int rank) {
        HashSet<Integer> T = new HashSet<Integer>();
        for (int i = size; i > 0; i--) {
            if (rank % 2 == 1) {
                T.add(i);
            }
            rank = (int)Math.floor(rank / 2);
        }
        return T;
    }

    public static byte binaryToGray(byte b) {
        return 0;
    }

    public static byte grayToBinary(byte gray) {
        return 0;
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static void grayCodeRank(int size, HashSet<Integer> T) {
        int r = 0;
        int b = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (T.contains(size - i)) {
                b = 1 - b;
            }
            if (b == 1) {
                r = r + (int)Math.pow(2, i);
            }
        }
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static HashSet<Integer> grayCodeUnrank(int size, int rank) {
        HashSet<Integer> T = new HashSet<Integer>();
        int c = 0;
        int b = 0;
        int r = 0;
        for (int i = size - 1; i >= 0; i--) {
            b = (int)Math.floor(rank / Math.pow(2, i));
            if (b != c) {
                T.add(size - i);
            }
            c = b;
            r = r - b * (int)Math.pow(2, i);
        }
        return T;
    }

    public static void kSubsetLexSuccesor() {}

    public static void kSubsetLexRank() {}

    public static void kSubsetLexUnrank() {}

    public static void permLexRank() {}

    public static void permLexUnrank() {}

    /**
     * @author Ondřej Krejčíř
     */
    public static int[] getNextPermutation(int[] permutation) {
        int minIndex = permutation.length - 1;
        for (int i = permutation.length - 1; i > 0; i--) {
            if (permutation[i] > permutation[i - 1]) {
                for (int j = permutation.length - 1; j > i - 1; j--) {
                    if (permutation[j] < permutation[minIndex]) {
                        minIndex = j;
                    }
                }
                permutation = swapOnArray(permutation, minIndex, i);
                int start = i;
                int end = permutation.length - 1;
                while (start < end) {
                    permutation = swapOnArray(permutation, start++, end--);
                }
                return permutation;
            }
        }
        return null;
    }

    /**
     * @author Ondřej Krejčíř
     */
    public static int[] swapOnArray(int[] array, int from, int to) {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
        return array;
    }
}

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5, 4, 6, 8, 7, 9, 1, 3, 2};
        for (int i = 0; i < a.length; i++) {
            int minIdx = findMinIndex(a, i);
            if (i != minIdx) swap(a, i, minIdx);
        }
        System.out.println(Arrays.toString(a));
    }

    /*
    * This method finds the index of min element between the starting index and end of
    * the array
    * */
    static int findMinIndex(int[] a, int start) {
        int minIdx = start;
        for (int i = start; i < a.length; i++) {
            if (a[i] < a[minIdx]) minIdx = i;
        }
        return minIdx;
    }

    static void swap(int[] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }
}

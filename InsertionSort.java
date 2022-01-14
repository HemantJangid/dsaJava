import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {5, 4, 6, 8, 7, 9, 1, 3, 2};
        int n = a.length;
        int i, j, temp;
        for (i = 1; i < n; i++) {
            for (j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5, 4, 6, 8, 7, 9, 1, 3, 2};
        int n = a.length;
        boolean isSwapped;
        int i, j, temp;
        for (i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
        System.out.println(Arrays.toString(a));
    }
}

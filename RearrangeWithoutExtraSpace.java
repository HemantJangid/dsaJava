//https://practice.geeksforgeeks.org/problems/rearrange-an-array-with-o1-extra-space3142/1/

import java.util.Arrays;

public class RearrangeWithoutExtraSpace {
    public static void main(String[] args) {
//        long[] a = {4, 0, 2, 1, 3};
        long[] a = {1, 0};
        int n = a.length;

        for (int i = 0; i < n; i++) {
            long remainder = a[i] % n;
            long dividend = a[(int) a[i]] % n;
            a[i] = dividend * n + remainder;
        }

        for (int i = 0; i < n; i++) {
            a[i] = a[i] / n;
        }

        System.out.println(Arrays.toString(a));
    }
}

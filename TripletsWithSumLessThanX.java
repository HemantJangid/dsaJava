//https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1

import java.util.Arrays;

public class TripletsWithSumLessThanX {
    public static void main(String[] args) {
        long[] a = {-2, 0, 1, 3};
        int n = a.length;
        int sum = 2;

        long count = 0;
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {
            int l = i + 1;
            int r = n - 1;
            long num = sum - a[i];

            while (l < r) {
                if (a[l] + a[r] < num) {
                    count += r - l;
                    l++;
                } else r--;
            }
        }
        System.out.println(count);
    }
}

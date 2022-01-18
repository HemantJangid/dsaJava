//https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KLargestElements {
    public static void main(String[] args) {
        int[] a = {12, 5, 787, 1, 23};
        int n = a.length;
        int k = 2;

        int[] ans = new int[k];
        kLargestElements(a, n, k, ans);
        System.out.println(Arrays.toString(ans));
    }

    static void kLargestElements(int[] a, int n, int k, int[] ans) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int i = l - 1, j = l, p = r;
            while (i <= r && j <= r) {
                if (a[j] <= a[p]) {
                    i++;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    if (j == p) p = i;
                }
                j++;
            }
            if (p == n - k) {
                int idx = 0;
                for (int m = p; m < n; m++) {
                    ans[idx++] = a[m];
                }
                break;
            } else if (p < n - k)
                l = p + 1;
            else
                r = p - 1;
        }
    }
}

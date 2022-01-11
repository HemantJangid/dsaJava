//https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1

import java.util.Arrays;

public class GivenDiffPair {
    public static void main(String[] args) {
//        int[] a = {5, 20, 3, 2, 5, 80};
        int[] a = {90, 70, 20, 80, 50};
        int target = 78;

        boolean ans = false;
        Arrays.sort(a);
        for (int j : a) {
            int total = j + target;
            ans = ifElementExists(a, total);
            if (ans) break;
        }

        System.out.println(ans);
    }

    static boolean ifElementExists(int[] a, int n) {
        int start = 0;
        int end = a.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] == n) return true;
            else if (a[mid] < n) start = mid + 1;
            else end = end - 1;
        }

        return false;
    }
}

//https://practice.geeksforgeeks.org/problems/searching-in-an-array-where-adjacent-differ-by-at-most-k0456/1#

public class SearchInArrAdjDiffOne {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 6};
        int n = a.length;
        int x = 6;
        int k = 1;

        int ans = -1;
        int i = 0;
        while (i < n) {
            if (a[i] == x) {
                ans = i;
                break;
            }
            int y = Math.max(1, Math.abs((x - a[i]) / k));
            i = i + y;
        }
        System.out.println(ans);
    }
}

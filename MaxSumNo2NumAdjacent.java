//https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1

public class MaxSumNo2NumAdjacent {
    public static void main(String[] args) {
        int[] a = {5, 5, 10, 100, 10, 5};
        int n = a.length;
        int ans = solve(a, n-1);
        System.out.println(ans);
    }

    static int solve(int[] a,int n) {
        if(n<0) return 0;
        int ans1 = a[n] + solve(a, n-2);
        int ans2 = solve(a, n-1);
        return Math.max(ans1, ans2);
    }
}

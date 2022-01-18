//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1/

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = a.length;

        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum=0;
            }
        }
        System.out.println(maxSum);
    }
}

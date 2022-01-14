//https://practice.geeksforgeeks.org/problems/product-array-puzzle4525/1

import java.util.Arrays;

public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int[] nums = {10, 3, 5, 6, 0, 2};
        int n = nums.length;

        int count = 0;
        long[] ans;
        ans = new long[n];
        long total = 1;
        for (int num : nums) {
            if (num != 0) total *= num;
            else count++;
        }
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] == 0 && count == 1) ans[i] = total;
            else if(nums[i] == 0 && count > 1) ans[i] = 0;
            else if(nums[i] != 0 && count >= 1) ans[i] = 0;
            else ans[i] = total / nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}

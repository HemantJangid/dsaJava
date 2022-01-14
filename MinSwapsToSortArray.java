//https://practice.geeksforgeeks.org/problems/minimum-swaps/1

import java.util.Arrays;
import java.util.HashMap;

public class MinSwapsToSortArray {
    public static void main(String[] args) {
        int[] nums = {10, 19, 6, 3, 5};

        /*
         * if we sort it now then we won't have access to the original array
         * so instead of sorting now what we can do is store the position of
         * elements in current array and then after sorting the array we return
         * to the same array
         * */
        HashMap<Integer, Integer> elePosition = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            elePosition.put(nums[i], i);
        }
        Arrays.sort(nums);
        int i = 0, count = 0;
        while (i < nums.length) {
            boolean pos = (i == elePosition.get(nums[i]));
            if (pos) i++;
            else {
                int temp = nums[elePosition.get(nums[i])];
                nums[elePosition.get(nums[i])] = nums[i];
                nums[i] = temp;
                count++;
            }
        }

        System.out.println(count);
    }
}

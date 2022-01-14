//https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1

import java.util.HashMap;

public class KSumSubarrays {
    public static void main(String[] args) {
        long[] a = {3,4,7,2,-3,1,7,2};
        int k = 7;

        HashMap<Integer, Integer> freArr = new HashMap<>();
        int sum = 0;
        int count = 0;
        for (long l : a) {
            sum += l;
            if (sum == k) count++;
            if (freArr.containsKey(sum - k)) {
                count += freArr.get(sum - k);
            }
            if (freArr.containsKey(sum)) freArr.replace(sum, freArr.get(sum) + 1);
            else freArr.put(sum, 1);
        }
        System.out.println(count);
    }
}

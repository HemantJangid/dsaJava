//https://practice.geeksforgeeks.org/problems/relative-sorting4323/1

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class SortWithRespToOtherArray {
    public static void main(String[] args) {
        int[] a1 = {45, 15, 23, 8, 5, 12, 26, 444, 888, 151, 12, 23, 45, 15, 56};
        int[] a2 = {15, 888, 444, 5, 8, 12, 23};
        int n = a1.length;

        TreeMap<Integer, Integer> freqMap = new TreeMap<>();
        for (int value : a1) {
            if (freqMap.containsKey(value)) freqMap.replace(value, freqMap.get(value) + 1);
            else freqMap.put(value, 1);
        }

        int[] ans = new int[n];
        int j = 0;
        for (int value : a2) {
            int freq = freqMap.get(value) != null ? freqMap.get(value) : 0;
            for (int k = 0; k < freq; k++) {
                ans[j] = value;
                j++;
            }
            freqMap.remove(value);
        }

        for(int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            for (int k = 0; k < freq; k++) {
                ans[j] = key;
                j++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}

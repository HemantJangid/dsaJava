//https://practice.geeksforgeeks.org/problems/sort-by-set-bit-count1153/1

import java.util.Arrays;

public class SortBySetBit {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 3, 9, 4, 6, 7, 15, 32};

        Arrays.sort(arr, (a, b) -> Integer.bitCount(b) - Integer.bitCount(a));
        System.out.println(Arrays.toString(arr));
    }
}

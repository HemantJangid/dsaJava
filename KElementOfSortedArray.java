//https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1

public class KElementOfSortedArray {
    public static void main(String[] args) {
        int[] a1 = {100, 112, 256, 349, 770};
        int[] a2 = {72, 86, 113, 119, 265, 445, 892};
        int n = a1.length;
        int m = a2.length;
        int k = 7;

        int i = 0, j = 0, count = 0, ans = -1;
        while (i < n && j < m) {
            count++;
            if (a1[i] <= a2[j]) {
                if (count == k) ans = a1[i];
                i++;
            } else {
                if (count == k) ans = a2[j];
                j++;
            }
        }
        System.out.println(ans);

    }
}

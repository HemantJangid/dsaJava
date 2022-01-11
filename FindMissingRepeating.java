//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1

import java.util.Arrays;

public class FindMissingRepeating {
    public static void main(String[] args) {
        int n = 3;
        int[] a = {1, 3, 3};
        int[] ans = new int[2];

        for (int i = 0; i < n; i++) {
            if (a[Math.abs(a[i])-1] < 0) ans[0]=Math.abs(a[i]);
            else {
                a[Math.abs(a[i])-1] = -a[Math.abs(a[i])-1];
            }
        }

        for (int i = 0; i < n; i++) {
            if(a[i]>0) {
                ans[1] = i+1;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}

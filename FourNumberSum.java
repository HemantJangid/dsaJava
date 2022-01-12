//https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1

import java.util.ArrayList;
import java.util.Arrays;

public class FourNumberSum {
    public static void main(String[] args) {
        /*
        * int[] a = {10, 2, 3, 4, 5, 7, 8};
        * int target = 23;
        * */

        int[] a = {0,0,2,1,1};
        int target = 3;

        int n = a.length;
        ArrayList<ArrayList<Integer>> finalAnswer = new ArrayList<>();
        Arrays.sort(a);
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int l = j + 1;
                int r = n - 1;
                int num = target - (a[i] + a[j]);

                while (l < r) {
                    if (a[l] + a[r] == num) {
                        ArrayList<Integer> quadruples = new ArrayList<>(Arrays.asList(a[i], a[j], a[l], a[r]));
                        if(!finalAnswer.contains((quadruples))) finalAnswer.add(quadruples);
                        l = l+1;
                    } else if (a[l] + a[r] < num) l = l + 1;
                    else r = r - 1;
                }
            }
        }

        System.out.println(finalAnswer);
    }
}

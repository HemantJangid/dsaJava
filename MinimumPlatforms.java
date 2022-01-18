//https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1

import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] a = {900, 940, 950, 1100, 1500, 1800};
        int[] d = {910, 1200, 1120, 1130, 1900, 2000};
        int n = a.length;

        Arrays.sort(a);
        Arrays.sort(d);
        int minPlatforms = 1, neededPlatforms = 1;
        int i = 1, j = 0;

        while(i < n && j < n) {
           if(d[j] < a[i]) {
               minPlatforms--;
               j++;
           } else {
               minPlatforms++;
               neededPlatforms = Math.max(neededPlatforms, minPlatforms);
               i++;
           }
        }
        System.out.println(neededPlatforms);
    }
}

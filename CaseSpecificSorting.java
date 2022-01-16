//https://practice.geeksforgeeks.org/problems/case-specific-sorting-of-strings4845/1/

import java.util.Arrays;

public class CaseSpecificSorting {
    public static void main(String[] args) {
        String str = "defRTSersUXI";

        int nl = 0, nc = 0;
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') nc++;
            else nl++;
        }
        char[] lc = new char[nl];
        char[] cc = new char[nc];
        int m = 0, n = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                cc[m] = c;
                m++;
            } else {
                lc[n] = c;
                n++;
            }
        }

        Arrays.sort(lc);
        Arrays.sort(cc);
        m=0;
        n=0;

        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                ans += cc[m];
                m++;
            } else {
                ans += lc[n];
                n++;
            }
        }

        System.out.println(ans);


    }
}

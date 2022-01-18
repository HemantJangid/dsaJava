//https://practice.geeksforgeeks.org/problems/find-all-possible-palindromic-partitions-of-a-string/1

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindromicPartitionsOfAString {
    public static void main(String[] args) {
        String s = "geeks";

        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        allPalindromicPartitions(s, 0, ans, temp);

        System.out.println(Arrays.toString(ans.toArray()));
    }

    static void allPalindromicPartitions(String s, int idx, ArrayList<ArrayList<String>> ans, ArrayList<String> temp) {
        if(idx == s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            if(isPalindrome(s, idx, i)) {
                temp.add(s.substring(idx, i+1));
                allPalindromicPartitions(s, i+1, ans, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s, int start, int end) {
        while(start <= end) {
            if(s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}

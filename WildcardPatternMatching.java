//https://practice.geeksforgeeks.org/problems/wildcard-pattern-matching/1

public class WildcardPatternMatching {
    public static void main(String[] args) {
        String pattern = "ba*a?";
        String str = "baaabab";

        boolean ans = wildcard(pattern, str);
        System.out.println(ans);
    }

    static boolean wildcard(String pattern, String str) {
        char[] s = str.toCharArray();
        char[] p = pattern.toCharArray();
        int sl = s.length;
        int pl = p.length;
        boolean[][] dp = new boolean[pl + 1][sl + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) dp[i][j] = true;
                else if (i == 0) dp[i][j] = false;
                else if (j == 0) dp[i][j] = p[i-1] == '*' && dp[i-1][j];
                else {
                    if(p[i-1] == '*') dp[i][j] = dp[i][j-1] || dp[i-1][j];
                    else if (p[i-1] == s[j-1] || p[i-1] == '?') dp[i][j] = dp[i-1][j-1];
                    else dp[i][j] = false;
                }
            }
        }
        return dp[p.length][s.length];
    }
}

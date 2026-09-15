class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i + len <= n; i++) {
                int j = i + len - 1;
                if (len == 1) {
                    dp[i][j] = true;
                } 
                else if (len == 2) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } 
                else {
                    dp[i][j] = s.charAt(i) == s.charAt(j)
                            && dp[i + 1][j - 1];
                }
            }
        }
        int[] dp2 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp2[i] = dp2[i - 1];
            for (int j = 0; j < i; j++) {
                if (i - j >= k && dp[j][i - 1]) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + 1);
                }
            }
        }
        return dp2[n];
    }
}
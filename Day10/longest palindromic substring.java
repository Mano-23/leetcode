class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        String res = "";
        boolean[][] dp = new boolean[len][len];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len - i; j++) {
                dp[j][j+i] = i + 1 <= 2 ? s.charAt(j) == s.charAt(j+i) : dp[j + 1][j + i - 1] && s.charAt(j) == s.charAt(j + i);
                if(dp[j][j+i]) {
                    if(i + 1 > res.length()) {
                        res = s.substring(j, j + i + 1);
                    }   
                }
            }
        }
        return res;
    }
}

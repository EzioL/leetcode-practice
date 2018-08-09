package com.ezio.leetcodepractice.stringinterleave;

import lombok.Data;

/**
 * Here be dragons
 * Created by haotian on 2018/8/9 下午3:31
 */
@Data
public class StringInterleaveProblem {

    private String s1;

    private String s2;

    private String s3;

    private boolean isInterleave = false;

    public StringInterleaveProblem(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;

        solve();
    }

    private void solve() {
        // 长度不一致
        int n = s1.length();
        int m = s2.length();
        int s = s3.length();

        if (n + m != s) {
            isInterleave = false;
            return;
        }

        boolean[][] dp = new boolean[n + 1][m + 1];

        dp[0][0] = true;

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                boolean b = dp[i][j];
                boolean b1 = i - 1 >= 0 && dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i - 1 + j);
                boolean b2 = j - 1 >= 0 && dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1);

                dp[i][j] = b || b1 || b2;
            }
        }
        isInterleave = dp[n][m];

        System.err.println(dp);
    }
}

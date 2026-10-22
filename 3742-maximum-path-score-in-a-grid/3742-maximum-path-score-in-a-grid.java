
class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int[][][] dp = new int[m][n][k + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                java.util.Arrays.fill(dp[i][j], -1);
            }
        }

        dp[0][0][0] = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int c = 0; c <= k; c++) {
                    if (dp[i][j][c] == -1) {
                        continue;
                    }

                    if (i + 1 < m) {
                        int cost = Math.min(grid[i + 1][j], 1);
                        int newCost = c + cost;

                        if (newCost <= k) {
                            dp[i + 1][j][newCost] = Math.max(
                                dp[i + 1][j][newCost],
                                dp[i][j][c] + grid[i + 1][j]
                            );
                        }
                    }

                    if (j + 1 < n) {
                        int cost = Math.min(grid[i][j + 1], 1);
                        int newCost = c + cost;

                        if (newCost <= k) {
                            dp[i][j + 1][newCost] = Math.max(
                                dp[i][j + 1][newCost],
                                dp[i][j][c] + grid[i][j + 1]
                            );
                        }
                    }
                }
            }
        }

        int ans = -1;

        for (int c = 0; c <= k; c++) {
            ans = Math.max(ans, dp[m - 1][n - 1][c]);
        }

        return ans;
    }
}

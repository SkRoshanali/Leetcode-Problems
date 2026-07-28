import java.util.Arrays;

class Solution {

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        int ans = solve(n - 1, coins, amount, dp);

        return ans >= (int)1e9 ? -1 : ans;
    }

    private int solve(int ind, int[] coins, int amount, int[][] dp) {

        if (ind == 0) {
            if (amount % coins[0] == 0)
                return amount / coins[0];
            return (int)1e9;
        }

        if (dp[ind][amount] != -1)
            return dp[ind][amount];

        int notTake = solve(ind - 1, coins, amount, dp);

        int take = (int)1e9;
        if (coins[ind] <= amount)
            take = 1 + solve(ind, coins, amount - coins[ind], dp);

        return dp[ind][amount] = Math.min(take, notTake);
    }
}
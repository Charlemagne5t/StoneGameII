package org.example;


import java.util.Arrays;

public class Solution {
    public int stoneGameII(int[] piles) {
        int[][][] dp = new int[2][piles.length][piles.length];
        return dfs(piles, 1, 0, 1, dp);
    }
    private int dfs(int[] piles, int isAlice, int i, int M, int[][][] dp){
        if(i == piles.length) {
            return 0;
        }
        if(dp[isAlice][i][M] != 0){
            return dp[isAlice][i][M];
        }

        int result = 0;
        if(isAlice == 0){
            result = Integer.MAX_VALUE;
        }

        int sum = 0;
        for (int j = 1; j <= 2 * M; j++) {
            if( i + j > piles.length)
                break;
            sum += piles[i + j - 1];
            if(isAlice == 1){
                result = Math.max(result, sum +  dfs(piles, 1 - isAlice , i + j, Math.max(M, j), dp));
            }else{
                result = Math.min(result, dfs(piles, 1 - isAlice,i + j, Math.max(M, j), dp));
            }
        }
           dp[isAlice][i][M] = result;
        return result;
    }
}

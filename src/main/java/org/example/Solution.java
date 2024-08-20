package org.example;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int stoneGameII(int[] piles) {
        Map<String, Integer> memo = new HashMap<>();
        int res = dfs(piles , 0, 1, true, memo);

        return res;
    }

    int dfs(int[] piles, int i, int m, boolean alice, Map<String, Integer> memo) {
        if(i == piles.length) {
            return 0;
        }
        if(memo.containsKey(i + " " + m  + " " + (alice ? 1 : 0))) {
            return memo.get(i + " " + m + " " + (alice ? 1 : 0));

        }
        int res = 0;
        if(alice) {
            int take = 0;
            int limit = 2 * m;
            for(int j = i; j < i + limit; j++) {
                if(j >= piles.length) {
                    break;
                }
                take += piles[j];
                res = Math.max(res, take + dfs(piles, j + 1, Math.max(m, j - i + 1), false, memo));
            }
        }else {
            res = Integer.MAX_VALUE;
            int limit = 2 * m;
            for(int j = i; j < i + limit; j++) {
                if(j >= piles.length) {
                    break;
                }
                res = Math.min(res, dfs(piles, j + 1, Math.max(m, j - i + 1), true, memo));
            }
        }

        memo.put(i + " " + m +  " " + (alice ? 1 : 0), res);
        return res;

    }
}
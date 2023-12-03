class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int minCost = cost.length;

        for(int i =2; i < minCost; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }

        return Math.min(cost[minCost - 1], cost[minCost - 2]);   
    }
}
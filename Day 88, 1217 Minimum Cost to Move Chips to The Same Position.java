class Solution {
    public int minCostToMoveChips(int[] position) {
        int[] ans = new int[2];

        for(int p : position) {
            ++ans[p % 2];
        }

        return Math.min(ans[0], ans[1]);
    }
}
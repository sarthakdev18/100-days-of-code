class Solution {
    public int maxProfit(int[] prices) {
        int s = 0;
        int h = Integer.MIN_VALUE;

        for(int p : prices) {
            s = Math.max(s, h + p);
            h = Math.max(h, -p);
        }

        return s;
    }
}
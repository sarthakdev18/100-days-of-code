class Solution {
    public int hammingDistance(int x, int y) {
        int dist = 0;

        while(x > 0 || y > 0) {
            dist += (x & 1) ^ (y & 1);
            x >>= 1;
            y >>= 1;
        }

        return dist;
    }
}
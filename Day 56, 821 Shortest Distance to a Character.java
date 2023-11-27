class Solution {
    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] dist = new int[len];
        dist[0] = s.charAt(0) == c ? 0 : 10001;

        for(int i = 1; i < len; i++) {
            dist[i] = s.charAt(i) == c ? 0 : dist[i - 1] + 1;
        }

        for(int i = len - 2; i >= 0; i--) {
            dist[i] = Math.min(dist[i], dist[i + 1] + 1);
        }

        return dist;
    }
}
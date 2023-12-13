class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] match = new int[n + 1];
        int min = 0;
        int max = n;

        for(int i = 0; i < n; i++) {
            match[i] = s.charAt(i) == 'I' ? min++ : max--;
        }

        match[n] = min;
        return match;
    }
}
class Solution {
    public int firstUniqChar(String s) {
        int[] a = new int[123];

        for(char c : s.toCharArray()) {
            ++a[c];
        }

        for(int i = 0; i < s.length(); i++) {
            if(a[s.charAt(i)] == 1) {
                return i;
            }
        }

        return -1;
    }
}
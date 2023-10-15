class Solution {
    public int titleToNumber(String columnTitle) {
        int a = 0;

        for(char c : columnTitle.toCharArray()) {
            a = a * 26 + c - '@';
        }

        return a;
    }
}
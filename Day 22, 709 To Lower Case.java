class Solution {
    public String toLowerCase(String s) {
        int lower = 'A' - 'a';
        char[] c = s.toCharArray();

        for(int i = 0; i < c.length; i++) {
            if(c[i] >= 'A' && c[i] <= 'Z') {
                c[i] -= lower;
            }
        }

        return new String(c);
    }
}
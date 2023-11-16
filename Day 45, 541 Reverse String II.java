class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < sb.length(); i += 2 * k) {
            int a = i;
            int b = Math.min(i + k - 1, sb.length() - 1);

            while(a < b) {
                sb.setCharAt(a, s.charAt(b));
                sb.setCharAt(b, s.charAt(a));
                a++;
                b--;
            }
        } 

        return sb.toString();
    }
}
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int add = 0;
        int a = num1.length() - 1;
        int b = num2.length() - 1;

        while(a >= 0 || b >= 0 || add > 0) {
            if(a >= 0) {
                add += num1.charAt(a--) - '0';
            }

            if(b >= 0) {
                add += num2.charAt(b--) - '0';
            }

            sb.append(add % 10);
            add /= 10;
        }

        return sb.reverse().toString();    
    }
}
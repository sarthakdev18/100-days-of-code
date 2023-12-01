class Solution {
    public boolean judgeCircle(String moves) {
        int right = 0;
        int up = 0;

        for(char m : moves.toCharArray()) {
            switch(m) {
                case 'R':
                  right++;
                break;

                case 'L':
                  right--;
                break;

                case 'U':
                  up++;
                break;

                case 'D':
                  up--;
                break;
            }
        }

        return right == 0 && up == 0;
    }
}
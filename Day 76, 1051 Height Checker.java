class Solution {
    public int heightChecker(int[] heights) {
        int height = 0;
        int currentHeight = 1;
        int[] count = new int[101];

        for(int h : heights) {
            ++count[h];
        }

        for(int h : heights) {
            while(count[currentHeight] == 0) {
                ++currentHeight;
            }

            if(h != currentHeight) {
                ++height;
            }

            --count[currentHeight];
        }

        return height;
    }
}
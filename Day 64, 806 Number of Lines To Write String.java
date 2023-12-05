class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int numLines = 1;
        int runningWidth = 0;

        for(char c : s.toCharArray()) {
            int w = widths[c - 'a'];

            if(runningWidth + w <= 100) {
                runningWidth += w;
            } else {
                numLines++;
                runningWidth = w;
            }
        }

        return new int[] {numLines, runningWidth};
    }
}
class Solution {
    public int minDeletionSize(String[] strs) {
        int sort = 0;

        for(int i = 0; i < strs[0].length(); i++) {
            for(int j = 0; j + 1 < strs.length; j++) {
                if(strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    sort++;
                    break;
                }
            }
        }

        return sort;
    }
}
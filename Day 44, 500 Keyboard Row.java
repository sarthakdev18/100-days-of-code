class Solution {
    public String[] findWords(String[] words) {
        List<String> key = new ArrayList<>();
        int[] rows = {2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
        
        for(String w : words) {
            String lowerWord = w.toLowerCase();
            int r = rows[lowerWord.charAt(0) - 'a'];
            boolean isValid = lowerWord.chars().allMatch(c -> rows[c - 'a'] == r);

            if(isValid) {
                key.add(w);
            }
        }

        return key.toArray(new String[0]);
    }
}
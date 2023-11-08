class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a = new int[123];

        for(char c : magazine.toCharArray()) {
            ++a[c];
        }

        for(char c : ransomNote.toCharArray()) {
            if(--a[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                          "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                          "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> convert = new HashSet<>();

        for(String w : words) {
            StringBuilder sb = new StringBuilder();

            for(char c : w.toCharArray()) {
                sb.append(morse[c - 'a']);
            }

            convert.add(sb.toString());
        }

        return convert.size();
    }
}
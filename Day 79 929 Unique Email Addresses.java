class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> ans = new HashSet<>();

        for(String e : emails) {
            String[] a = e.split("@");
            String[] b = a[0].split("\\+");
            ans.add(b[0].replace(".", "") + "@" + a[1]);
        }

        return ans.size();
    }
}
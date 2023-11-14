class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> greaterElement = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for(int n : nums2) {
            while(!stack.isEmpty() && stack.peek() < n) {
                greaterElement.put(stack.pop(), n);
            }

            stack.push(n);
        }

        for(int n : nums1) {
            if(greaterElement.containsKey(n)) {
                result.add(greaterElement.get(n));
            } else {
                result.add(-1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
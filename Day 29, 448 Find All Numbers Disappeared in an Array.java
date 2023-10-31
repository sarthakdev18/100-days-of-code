class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> num = new ArrayList<>();

        for(int n : nums) {
            int x = Math.abs(n) - 1;
            nums[x] = -Math.abs(nums[x]);
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                num.add(i + 1);
            }
        }

        return num;
    }
}
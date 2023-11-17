class Solution {
    public int arrayPairSum(int[] nums) {
        int partition = 0;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i += 2) {
            partition += nums[i];
        }

        return partition;
    }
}
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a = 0;
        int b = nums.length - 1;

        while(a < b) {
            if(nums[a] % 2 == 1 && nums[b] % 2 == 0) {
                int c = nums[a];
                nums[a] = nums[b];
                nums[b] = c;
            }

            if(nums[a] % 2 == 0) {
                a++;
            }

            if(nums[b] % 2 == 1) {
                b--;   
            }
        }

        return nums;
    }
}
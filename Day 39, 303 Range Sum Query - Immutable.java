class NumArray {

    public NumArray(int[] nums) {
        rsq = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++) {
            rsq[i + 1] = nums[i] + rsq[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return rsq[right + 1] - rsq[left];
    }

    private int[] rsq;
}

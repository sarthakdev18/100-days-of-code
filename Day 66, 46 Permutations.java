class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perm = new ArrayList<>();
        permutations(nums, new boolean[nums.length], new ArrayList<>(), perm);
        return perm;
    }

    private void permutations(int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> perm) {
        if(path.size() == nums.length) {
            perm.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(used[i]) {
                continue;
            }

            used[i] = true;
            path.add(nums[i]);
            permutations(nums, used, path, perm);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
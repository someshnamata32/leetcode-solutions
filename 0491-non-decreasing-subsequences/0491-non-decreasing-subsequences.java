class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    void solve(int[] nums, int index, List<Integer> curr) {
        if (curr.size() >= 2)
            ans.add(new ArrayList<>(curr));

        HashSet<Integer> used = new HashSet<>();

        for (int i = index; i < nums.length; i++) {
            if (used.contains(nums[i]))
                continue;

            if (!curr.isEmpty() && nums[i] < curr.get(curr.size() - 1))
                continue;

            used.add(nums[i]);
            curr.add(nums[i]);
            solve(nums, i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        solve(nums, 0, curr);
        return ans;
    }
}
class Solution {

    static void solve(int k, int target, int index, List<List<Integer>> ans, List<Integer> temp) {
        if (target == 0 && temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (target < 0 || temp.size() > k)
            return;

        for (int i = index; i <= 9; i++) {
            temp.add(i);
            solve(k, target - i, i + 1, ans, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(k, n, 1, ans, temp);

        return ans;
    }
}
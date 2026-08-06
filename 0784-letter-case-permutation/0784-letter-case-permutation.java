class Solution {

    static void solve(char[] arr, int index, List<String> ans) {

        if (index == arr.length) {
            ans.add(new String(arr));
            return;
        }

        if (Character.isDigit(arr[index])) {
            solve(arr, index + 1, ans);
            return;
        }

        arr[index] = Character.toLowerCase(arr[index]);
        solve(arr, index + 1, ans);

        arr[index] = Character.toUpperCase(arr[index]);
        solve(arr, index + 1, ans);
    }

    public List<String> letterCasePermutation(String s) {
        
        List<String> ans = new ArrayList<>();
        solve(s.toCharArray(), 0, ans);
        return ans;
    }
}
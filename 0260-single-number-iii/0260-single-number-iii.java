class Solution {
    public int[] singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int count = 0;

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int n : map.keySet()) {
            if (map.get(n) == 1)
                count++;
        }

        int[] ans = new int[count];
        for (int n : map.keySet()) {
            if (map.get(n) == 1) {
                ans[i] = n;
                i++;
            }
        }
        return ans;
    }
}
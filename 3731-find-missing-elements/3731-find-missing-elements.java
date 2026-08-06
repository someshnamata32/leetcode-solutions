// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {

//         List<Integer> ans = new ArrayList<>();

//         int n = nums.length;
//         int start = nums[0];
//         int end = nums[n - 1];

//         Set<Integer> set = new HashSet<>();
//         for (int num : nums)
//             set.add(num);

//         for (int i = start; i < end; i++)
//             if (!set.contains(i))
//                 ans.add(i);

//         return ans;
//     }
// }

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i))
                ans.add(i);
        }

        return ans;
    }
}
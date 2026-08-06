class Solution {
    public int maximumProduct(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);

        int optn1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int optn2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(optn1, optn2);

    }
}
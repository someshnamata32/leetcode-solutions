class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length - 1; 
        for(int i = 1; i <= n; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
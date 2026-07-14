class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int option1 = helper(nums,0,n-2);
        int option2 = helper(nums,1,n-1);

        return Math.max(option1,option2);
    }

    private int helper(int[] nums, int start, int end){

        int size = end - start + 1;
        if(size == 1) return nums[start];
        int[] dp = new int[size];
        
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start],nums[start+1]);

        for(int i=2; i<size; i++)
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[start+i]);
        
        return dp[size - 1];
    }
}
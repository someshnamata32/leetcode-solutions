class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum = 0;
        for(int i=0; i<k; i++) sum += nums[i];

        int maxLen = sum;

        for(int i=k; i<nums.length; i++){
            sum += nums[i];
            sum -= nums[i-k];
            maxLen = Math.max(maxLen, sum);
        }
        return (double)maxLen/k;
    }
}
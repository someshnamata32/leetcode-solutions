class Solution {
    public int maxProduct(int[] nums) {
        // int n = nums.length;
        // int max = -1;
        // for(int i=0; i<n; i++){
        //     int j = i+1;
        //     if( j < n){
        //         int prod =  nums[i]*nums[j];
        //         if(prod > max) max = prod;
        //         j++;
        //     }
        // }
        // return max;

        int n = nums.length;
        int currMax = nums[0];
        int currMin = nums[0];
        int maxAns  = nums[0];
        for(int i=1; i<n; i++){
            int temp = currMax;
            currMax = 
            Math.max(nums[i] , Math.max(nums[i]*currMax, nums[i]*currMin));

            currMin = 
            Math.min(nums[i], Math.min(nums[i]*temp, nums[i]*currMin));

            maxAns = Math.max(currMax,maxAns);
        }
        return maxAns;
    }
}
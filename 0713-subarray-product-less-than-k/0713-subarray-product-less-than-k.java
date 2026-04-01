class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // int temp = nums[0];
        // int count=0;
        // int max[] = new int [nums.length];
        // max[0] = nums[0];
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i-1]<k) count++;
        //     max[i] = nums[i-1]*nums[i];
        //     if(max[i]<k) count++;
        // }
        // return count;

        int left = 0;
        int prod = 1;
        int count = 0;
        for(int right = 0; right < nums.length; right++){
            prod *=  nums[right];
            while(prod >= k && left <= right){
                prod = prod/nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
}
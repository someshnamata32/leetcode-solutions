class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1,max=1;
        int j=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[j]){
                count++;
                j++;
                if(max<count) max=count;
            }
            else {
                count=1; 
                j++;
            }
        }
        return max;
    }
}
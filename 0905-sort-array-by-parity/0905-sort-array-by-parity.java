class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] temp = new int[nums.length];
        int left = 0, right = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0) 
            {
                temp[left] = nums[i];
                left++;
            }
            else{ temp[right] = nums[i];
            right--;
            }
        }
        return temp;
    }
}
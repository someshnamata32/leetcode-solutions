class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n];
        int j=0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                temp[j] = nums[i];
                j++;
            }
        }
        while(j<n) {
            temp[j] = 0;
            j++;
        }
        for(int t=0; t<n; t++){
            nums[t] = temp[t];
        }
    }
}
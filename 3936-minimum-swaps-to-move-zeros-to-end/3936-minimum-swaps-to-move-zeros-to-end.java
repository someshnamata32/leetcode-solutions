class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        // int count=0,l=n-1;
        // for(int i = 0; i<n; i++){
        //     // if(nums[l] == 0){
        //     //     l--;
        //     // }
        //     if(nums[i] == 0){
        //         int j = nums[l];
        //         nums[l] = nums[i];
        //         nums[i] = j;
        //         l--;
        //         n--;
        //         count++;
        //     }else
        //     n--;
        // }
        // return count;
        int count = 0;
        int j = n - 1;
        int i = 0;
        while(i < j){
            if(nums[i] == 0 && nums[j] != 0 && j > 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
                count++;
            }else if(nums[i] != 0){
                i++;
            }else{
                j--;
            }
        }
        return count;
    }
}
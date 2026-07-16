class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k) - helper(nums,k-1);
    }
    private int helper(int[] nums, int k){
        int left = 0;
        int odd = 0;
        int ans = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int right=0; right < nums.length; right++){
            if(nums[right]%2 == 1)
                odd++;
            
            while(odd > k){
                if(nums[left]%2 == 1)
                    odd--;
                left++;
                
            } 
            ans += right-left+1;
        }
        return ans;
    }
}
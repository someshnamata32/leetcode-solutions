class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = -1;
        int missing  = -1;
        int n = nums.length;
        int[] freq = new int[n+1];

        for(int i=0; i<n; i++) freq[nums[i]]++;

        for(int i=1; i<=nums.length; i++){
                if(freq[i] == 2) duplicate = i;
                if(freq[i] == 0) missing = i;
        }
            return new int[]{duplicate,missing};
    }
}
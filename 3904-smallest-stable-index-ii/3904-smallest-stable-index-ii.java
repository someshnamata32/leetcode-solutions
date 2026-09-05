class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = nums[0];
        int n = nums.length;

        int[] rightMin = new int[n];
        rightMin[n-1] = nums[n-1];

        for(int i=n-2; i>=0; i--){
            rightMin[i] = Math.min(rightMin[i+1],nums[i]);
        }

        for (int i = 0; i < n; i++) {
            max = Math.max(max,nums[i]);
            int min = rightMin[i];

            if ((max - min) <= k)
                return i;

        }
        return -1;
    }
}
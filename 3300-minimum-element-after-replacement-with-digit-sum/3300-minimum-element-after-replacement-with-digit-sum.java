class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            int sum = 0;
            while(i!=0){
                int digit = i%10;
                i/=10;
                sum+=digit;
            }
            min = Math.min(sum,min);
        }
        return min;
    }
}
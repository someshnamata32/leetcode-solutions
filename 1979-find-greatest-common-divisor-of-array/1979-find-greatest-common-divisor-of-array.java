class Solution {
    public int findGCD(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        int gcd = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>largest) largest = nums[i];
            else if(nums[i] < smallest) smallest = nums[i];
        }
        while(largest % smallest != 0){
            int temp = largest % smallest;
            largest = smallest;
            smallest = temp;
        }
        return smallest;
    }
}
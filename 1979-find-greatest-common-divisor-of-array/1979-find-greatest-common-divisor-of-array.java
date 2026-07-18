class Solution {
    public int findGCD(int[] nums) {
       int smallest = nums[0];
       int largest = nums[0];
       for(int num : nums){
        smallest = Math.min(smallest,num);
        largest = Math.max(largest,num);
       }
        return gcd(smallest,largest);
    }

    private int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }   
}
class Solution {
    public long gcdSum(int[] nums) {
        
        int n = nums.length;
        int max = 0;
        int[] prefixGcd = new int[n];

        for(int i=0; i<n; i++){
            max = Math.max(nums[i],max);
            prefixGcd[i] = gcd(nums[i],max);
        }

        Arrays.sort(prefixGcd);

        long ans = 0;

        for(int i=0; i<n/2; i++)
            ans += gcd(prefixGcd[i], prefixGcd[n-1-i]);
        
        return ans;
    }

    private int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
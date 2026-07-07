class Solution {
    public long sumAndMultiply(int n) {
        long output = 0;
        long mul = 1;
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            if(digit!=0){
                output += digit*mul;
                mul*=10;
                sum+=digit;
            }
            n/=10;
        }
        return output*sum;
    }
}
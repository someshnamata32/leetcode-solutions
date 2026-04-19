class Solution {
    public int mySqrt(int x) {
       // return (int)Math.sqrt(x);

        int ans=0;
       for(int i =1; i<=x; i++){
        if(i <= x/i) ans = i;
        else break;
       }
       return ans;
    }
}
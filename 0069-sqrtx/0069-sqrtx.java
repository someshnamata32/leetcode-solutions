class Solution {
    public int mySqrt(int x) {
       // return (int)Math.sqrt(x);

    //     int ans=0;
    //    for(int i =1; i<=x; i++){
    //     if(i <= x/i) ans = i;
    //     else break;
    //    }
    //    return ans;

    int left=1,right=x,ans=0;
    if(x<2) return x;
    while(left <= right){
        int mid = left +(right-left)/2;
        if(mid <= x/mid) {
            ans = mid; left = mid+1;
        }else right = mid-1;
    }
    return right;

    }
}
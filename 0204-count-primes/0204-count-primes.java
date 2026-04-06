class Solution {
    public int countPrimes(int n) {
        int[] isPrime = new int[n];
        for(int i=2; i<n; i++) isPrime[i] = 0;
        for(int i=2; i*i<n; i++){
            if(isPrime[i] == 0){
                for(int j=i*i; j<n; j+=i) if(isPrime[j] == 0) isPrime[j] = 1;
            }
        }
        int count = 0;
        for(int i=2; i<n; i++) if(isPrime[i] == 0) count++;
        return count;
    }
}
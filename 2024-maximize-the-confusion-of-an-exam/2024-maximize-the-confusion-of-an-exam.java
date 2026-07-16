class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        return Math.max(helper(answerKey , k , 'T'),helper(answerKey, k, 'F'));
    }

    private int helper(String answerKey, int k, char ch){
        int count = 0;
        int maxLen = 0;
        int left = 0;

        for(int right=0; right<answerKey.length(); right++){
            if(answerKey.charAt(right) != ch)
                count++;

            while(count > k){
                if(answerKey.charAt(left) != ch)
                count--;
                left++;
            }
        maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
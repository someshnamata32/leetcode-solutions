class Solution {
    public boolean areNumbersAscending(String s) {
        int num = 0;
        int prev = 0;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
               num = num * 10 + (s.charAt(i) - '0');
            }
            else if(num != 0){
                if(num <= prev) return false;
                prev = num;
                num =0;
            }
        }
        if(num != 0 && num <= prev) return false;
        return true;
    }
}
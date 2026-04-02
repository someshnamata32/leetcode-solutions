class Solution {
    public String largestOddNumber(String num) {


        // String str = "123";
        // int num = Integer.parseInt(str);
        // System.out.println(num);  // 123 ye primitive int return karta hai.

        // String str = "456";
        // int num = Integer.valueOf(str);
        // System.out.println(num);  // 456 ye integer object return karta hai.

        //int nums = Integer.parseInt(num);


        for(int i=num.length()-1; i>=0; i--){
            int n = num.charAt(i) - '0';
            if(n%2 != 0 ){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
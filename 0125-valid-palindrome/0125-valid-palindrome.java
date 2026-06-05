// class Solution {
//     public boolean isPalindrome(String s) {
//         String str = "";

//         for(int i = 0; i<s.length(); i++){
//             char ch = s.charAt(i);
//             if(Character.isLetterOrDigit(ch))
//             str += Character.toLowerCase(ch);
//         }

//         int l=0;
//         int r = str.length()-1;
//         while(l<r){
//             if(str.charAt(l)!=str.charAt(r)) return false;
//             l++;
//             r--;
//         }
//         return true;
//     }
// }


class Solution {
    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            if (Character.toLowerCase(s.charAt(l))
                != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}
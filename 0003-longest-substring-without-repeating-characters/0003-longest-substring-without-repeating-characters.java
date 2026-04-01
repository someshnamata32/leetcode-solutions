class Solution {
    public int lengthOfLongestSubstring(String s) {
//         int count = 0;
//         for(int i=0; i<s.length(); i++){
//             count =0;
//             for(int j=i; j<s.length(); j++){
//                 char temp = s.charAt(j);
//                 if(j+1 < s.length()){
//                     if(temp != s.charAt(j+1)) count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

int left = 0;
int maxCount = 0;
Set<Character> set = new HashSet<>();
for(int right = 0; right < s.length(); right++){
        char ch = s.charAt(right);
        while(set.contains(ch)){
            set.remove(s.charAt(left));
            left++;
        }// a:0, b : 0, c : 0
        set.add(ch);
        maxCount = Math.max(maxCount, right - left + 1);
    }
    return maxCount;
}
}
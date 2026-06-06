class Solution {
    public String longestCommonPrefix(String[] strs) {
    //   if(strs == null || strs.length == 0) return "";
    //   String prefix = strs[0];
    //   for(int i=1; i<strs.length; i++){
    //     while(!strs[i].startsWith(prefix)){
    //         prefix = prefix.substring(0,prefix.length()-1);
    //         if(prefix.isEmpty()) return "";
    //         }
    //     }
    //     return prefix;
        Arrays.sort(strs);
        String str ="";
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int len1 = str1.length();
        int len2 = str2.length();
        int i = 0;
        int j = 0;
        while(i < len1 && j < len2){
            if(str1.charAt(i)==str2.charAt(j)){
                str+=str1.charAt(i);
            }
            else if(str1.charAt(i) != str2.charAt(j)){
                break;
            }
            i++;j++;
        }
        return str;
    }
}
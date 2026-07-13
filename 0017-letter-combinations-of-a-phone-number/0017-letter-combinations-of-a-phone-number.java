class Solution {

    String[] map = { "", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz" };

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;

        backTrack(digits,0,new StringBuilder(),ans);
        return ans;
    }

    private void backTrack(String digits,int idx, StringBuilder curr, List<String> ans){
        
        if(idx == digits.length()){
            ans.add(curr.toString());
            return;
        }

        String letter = map[digits.charAt(idx)-'0'];

        for(char ch : letter.toCharArray()){
            curr.append(ch);
            backTrack(digits,idx+1,curr,ans);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
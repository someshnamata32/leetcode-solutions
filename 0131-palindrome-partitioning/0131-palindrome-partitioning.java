class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> ans = new ArrayList<>();
        
        backTrack(s,0 ,new ArrayList<>(),ans);
        return ans;
    }

    private void backTrack(String s, int start ,List<String> curr, List<List<String>> ans){

        if(start == s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }  

        for(int end = start; end < s.length(); end++){

            if(isPalindrom(s,start,end)){
                curr.add(s.substring(start,end + 1));
                backTrack(s,end + 1,curr,ans);
                curr.remove(curr.size() - 1);
            }
        }
    }

    private boolean isPalindrom(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }
}
class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        for(int i=0; i<n; i++){
            char last = s.charAt(n-1);
            s = last + s.substring(0,n-1);
            if(s.equals(goal)) return true;
        }
        return false;
    }
}
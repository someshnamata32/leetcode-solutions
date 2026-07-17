class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");
        if(pattern.length() != words.length)
            return false;
        
        Map<Character, String> cTw = new HashMap<>();
        Map<String, Character> wTc = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){

            char ch = pattern.charAt(i);
            String word = words[i];

            if(cTw.containsKey(ch)){
                if(!cTw.get(ch).equals(word))
                    return false;
            }
            else cTw.put(ch,word);

             if(wTc.containsKey(word)){
                if(!wTc.get(word).equals(ch))
                    return false;
            }
            else wTc.put(word,ch);
        }
        return true;
    }
}
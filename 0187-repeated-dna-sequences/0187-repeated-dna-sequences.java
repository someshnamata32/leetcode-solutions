class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        Set<String> seen = new HashSet<>();
        Set<String> reapeted = new HashSet<>();

        for(int i=0; i<=s.length()-10; i++){
            String sub = s.substring(i,i+10);
            if(seen.contains(sub))
                reapeted.add(sub);
            else seen.add(sub);
        }
        return new ArrayList<>(reapeted);
    }
}
class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer ,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i : nums){
            if(i%2 == 0)
            map.put(i, map.getOrDefault(i,0)+1);
        }

        int maxfreq = 0;
        int result = -1;
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq > maxfreq || (freq == maxfreq && key < result)){
                maxfreq = freq;
                result = key;
            }
        }
        return result;    
    }
}
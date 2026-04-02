class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
            map.put(i , map.getOrDefault(i,0)+1);
        for(int key : map.keySet()){
            if(map.get(key) == 1) return key;
        }
        return 0;
    }
}
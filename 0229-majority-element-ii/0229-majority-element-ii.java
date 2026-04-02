class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }  

        for(int key : map.keySet()){
            if(map.get(key) > n/3) result.add(key);
        }
        return result;
    }
}
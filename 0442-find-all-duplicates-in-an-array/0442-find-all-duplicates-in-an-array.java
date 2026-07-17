class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            set.add(num);
        }

        List<Integer> ans = new ArrayList<>();
        for(int num : set){
            if(map.get(num) > 1)
                ans.add(num);
        }
        return ans;
    }
}
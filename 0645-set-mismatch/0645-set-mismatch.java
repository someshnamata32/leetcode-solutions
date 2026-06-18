class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = -1;
        int missing  = -1;
        for(int n : nums)
            if(set.contains(n)) duplicate = n;
            else set.add(n);

            for(int i=1; i<=nums.length; i++){
                if(!set.contains(i)) {
                    missing = i;
                    break;
                }
            }
            return new int[]{duplicate,missing};
    }
}
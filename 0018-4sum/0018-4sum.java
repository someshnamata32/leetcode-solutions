class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
            int p = j+1;
            int q = n-1;
            while(p < q){
            long sum = (long)nums[i] + nums[j] + nums[p] + nums[q];
            if(sum == target){
                List<Integer> trip = 
                Arrays.asList(nums[i] ,nums[j],nums[p] , nums[q]);
                Collections.sort(trip);
                result.add(trip);
                p++; q--;
            }
            else if(sum < target) p++;
            else  q--;
            }
        }
        }
        return new ArrayList<>(result);

    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        
    //     Set<List<Integer>> set = new HashSet<>();
    //     int n = nums.length;
    //     for(int i=0; i<n; i++){
    //         for(int j=i+1; j<n; j++){
    //             for(int k=j+1; k<n; k++){
    //                 if(nums[i]+nums[j]+nums[k] == 0){
    //                     List<Integer> trip = Arrays.asList(nums[i],nums[j],nums[k]);
    //                     Collections.sort(trip);
    //                     set.add(trip);
    //                 }
    //             }
    //         }  
    //    }
    //    return new ArrayList<>(set);

        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0; i<n; i++){
            int j = i+1;
            int k = n-1;
            while(j < k){
            int sum = nums[i] + nums[j] + nums[k];
            if(sum == 0){
                List<Integer> trip = 
                Arrays.asList(nums[i] ,nums[j] , nums[k]);
                Collections.sort(trip);
                result.add(trip);
                j++; k--;
            }
            else if(sum < 0) j++;
            else  k--;
            }
        }
        return new ArrayList<>(result);

    }
}
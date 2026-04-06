class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),result);
        return result;
    }


public void backtrack(int nums[], int i, List<Integer> temp,List<List<Integer>> result)
    {
        if(i == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        backtrack(nums,i+1,temp,result);
        temp.remove(temp.size()-1);
        backtrack(nums,i+1,temp,result);
    }
}
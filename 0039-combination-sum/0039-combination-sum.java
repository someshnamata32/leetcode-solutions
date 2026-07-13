class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        backTrack(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
    private void backTrack(int[] candidates, int target,int idx,List<Integer> curr, List<List<Integer>> ans){

        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        
        if(target < 0) return;

        for(int i=idx; i<candidates.length; i++){

            curr.add(candidates[i]);
            backTrack(candidates,target - candidates[i],i,curr,ans);
            curr.remove(curr.size()-1);

        }
    }
}
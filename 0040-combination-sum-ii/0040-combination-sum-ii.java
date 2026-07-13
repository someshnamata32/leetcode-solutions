class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates,target,0,new ArrayList<>(), ans);
        return ans;
    }

    private void backTrack(int[] candidates, int target,int idx, List<Integer> curr, List<List<Integer>> ans){

        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0) return;

        for(int i=idx; i<candidates.length; i++){

            if(i>idx && candidates[i] == candidates[i-1]) continue;

            curr.add(candidates[i]);

            backTrack(candidates,target-candidates[i],i+1,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}
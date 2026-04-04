class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int n=1; n<=numRows; n++){
            List<Integer> row = new ArrayList<>();
            long ans = 1;
            for(int c=1; c<=n; c++){
                row.add((int)ans);
                ans = ans*(n-c)/c;
            }
            result.add(row);
        }
        return result;
    }
}
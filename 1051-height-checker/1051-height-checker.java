class Solution {
    public int heightChecker(int[] heights) {
        int temp[] = heights.clone();
        Arrays.sort(temp);
        int n = heights.length,count = 0;
        for(int i=0; i<n; i++){
                if(heights[i] != temp[i]){
                    count++;
                }
        }
        return count;
    }
}

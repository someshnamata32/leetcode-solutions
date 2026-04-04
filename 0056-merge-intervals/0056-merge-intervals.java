class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int n     = intervals.length;
        int start = intervals[0][0];
        int end   = intervals[0][1];
        for(int i=1; i<n; i++){
            int currStart = intervals[i][0];
            int currEnd   = intervals[i][1];
            if(currStart <= end) end = Math.max(currEnd ,end);
            else{
                result.add(new int[]{start,end});
                start = currStart;
                end   = currEnd;
            }
        }
        result.add(new int[]{start,end});
        
        return result.toArray(new int[result.size()][]);
    }
}
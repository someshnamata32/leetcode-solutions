class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
//      frequency count
        for(int n : nums)
            map.put(n, map.getOrDefault(n,0)+1);
// max heap 
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b)->map.get(b)-map.get(a));

        for(int key : map.keySet())
            pq.add(key);

        int[] ans = new int[k];
        int i=0;
        while(k>0){
            ans[i] = pq.poll();
            k--;
            i++;
        }
        return ans;
    }
}
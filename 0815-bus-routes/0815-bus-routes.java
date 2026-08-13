class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        
        if(source == target)
            return 0;

        int n = routes.length;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int bus=0; bus<n; bus++){
            for(int stop : routes[bus]){
                if(!map.containsKey(stop))
                    map.put(stop,new ArrayList<>());
                
                map.get(stop).add(bus);
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] vis = new boolean[n];

        for(int bus : map.getOrDefault(source, new ArrayList<>())){
            queue.add(bus);
            vis[bus] = true;
        }

        int busTaken = 1;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                int bus = queue.poll();

                for(int stop : routes[bus]){
                    if(stop == target)
                        return busTaken;

                for(int nextBus : map.get(stop)){

                        if(!vis[nextBus]){
                            vis[nextBus] = true;
                            queue.add(nextBus);
                        }
                    }
                }
            }
            busTaken++;
        }
        return -1;
    }
}
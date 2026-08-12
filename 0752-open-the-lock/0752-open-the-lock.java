class Solution {

    String turn(String current, int index, int change){
        char[] arr = current.toCharArray();

        if(change == 1){
            if(arr[index] == '9')
                arr[index] = '0';
            else arr[index]++;
        }
        else{
            if(arr[index] == '0')
                arr[index] = '9';
            else arr[index]--;
        }
        return new String(arr);
    }

    public int openLock(String[] deadends, String target) {
        
        Set<String> dead = new HashSet<>();
        for(String s : deadends)
            dead.add(s);

        if(dead.contains("0000"))
            return -1;
        
        if(target.equals("0000"))
            return 0;

        Queue<String> queue = new LinkedList<>();
        Set<String> vis = new HashSet<>();

        queue.add("0000");
        vis.add("0000");

        int moves = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                String curr = queue.poll();

                if(curr.equals(target))
                    return moves;
                
                for(int j=0;j<4; j++){
                    String next = turn(curr,j,1);
                    if(!dead.contains(next) && !vis.contains(next)){
                        vis.add(next);
                        queue.add(next);
                    }

                    next = turn(curr,j,-1);
                    if(!dead.contains(next) && !vis.contains(next)){
                        vis.add(next);
                        queue.add(next);
                    }
                }
            }
            moves++;
        }
        return -1;
    }
}
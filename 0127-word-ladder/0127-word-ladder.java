class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set<String> words = new HashSet<>(wordList);

        if(!words.contains(endWord))
            return 0;
        
        Queue<String> queue = new LinkedList<>();
        Set<String> vis = new HashSet<>();

        queue.add(beginWord);
        vis.add(beginWord);

        int level = 1;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                String curr = queue.poll();

                if(curr.equals(endWord))
                    return level;
                
                char[] arr = curr.toCharArray();

                for(int j=0; j<arr.length; j++){
                    char original = arr[j];

                    for(char ch='a'; ch<='z'; ch++){
                        arr[j] = ch;
                        String next = new String(arr);

                        if(words.contains(next) && !vis.contains(next)){
                            vis.add(next);
                            queue.add(next);
                        }
                    }
                    arr[j] = original;
                }
            }
            level++;
        }
        return 0;
    }
}
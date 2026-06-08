class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> more = new ArrayList<>();

        for(int num : nums){
            if(num < pivot){
                less.add(num);
            }
            
            if(num == pivot){
                equal.add(num);
            }
            
            if(num > pivot){
                more.add(num);
            }
        }

        int ans[] = new int[nums.length];
        int i = 0;

        for(int num : less){
            ans[i++] = num;
        }

        
        for(int num : equal){
            ans[i++] = num;
        }

        
        for(int num : more){
            ans[i++] = num;
        }

        return ans;
    }
}
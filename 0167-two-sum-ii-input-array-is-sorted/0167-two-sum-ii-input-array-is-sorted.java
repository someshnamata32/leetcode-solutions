// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         for(int i=0; i<numbers.length; i++){
//             for(int j=i+1; j<numbers.length; j++){
//                 if(numbers[i]+numbers[j]==target)
//                 return new int[]{i+1,j+1};
//             }
//         }
//         return new int[]{};
//     }
// }


class Solution{
    public int[] twoSum(int[] numbers,int target){
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if(sum == target) return new int[]{l+1,r+1};
            else if(sum < target) l++;
            else r--;
        }
        return new int[]{};
    }
}

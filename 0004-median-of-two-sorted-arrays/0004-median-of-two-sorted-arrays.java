class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[m+n];
        for(int i = 0; i<n; i++){
            arr[i] = nums1[i];
        }
        for(int i = 0; i<m; i++){
            arr[n+i] = nums2[i];
        }

        Arrays.sort(arr);
        int size = m + n;

        if(size % 2 == 0){
            return (arr[size/2-1] + arr[size/2])/2.0;
        }
        else 
        return arr[size/2];
    }
}
class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[n + m];
        for (int i = 0; i < n; ++i) {
            merged[i] = arr1[i];
        }
        for (int j = 0; j < m; ++j) {
            merged[n + j] = arr2[j];
        }
        Arrays.sort(merged);

        if(merged.length%2==0) return ((double) merged[merged.length/2]+ (double)merged[(merged.length/2)-1])/2;
        return merged[merged.length/2];
    }
}
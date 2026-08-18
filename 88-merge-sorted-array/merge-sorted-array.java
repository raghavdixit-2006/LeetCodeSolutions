class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++){
            if(nums1[i]==0 && nums1[0] >0) continue;
            list.add(nums1[i]);
        }
        for(int i = 0; i < n; i++){
            if(nums2[i]==0 && nums1[0] > 0) continue;
            list.add(nums2[i]);
        }
        list.sort(null);
        for(int i = 0; i < list.size(); i++){
            nums1[i] = list.get(i);
        }
    }
}
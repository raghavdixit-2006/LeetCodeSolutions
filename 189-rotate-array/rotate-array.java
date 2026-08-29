class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(k>len) k = k%len;
        int idx = len-k;
        int j=0;
        int[] arr = new int[len];
        for(int i=idx; i < len; i++){
            arr[j++] = nums[i];
        }
        for(int i = 0; i < idx; i++){
            arr[j++] = nums[i];
        }
        for(int i = 0; i < len; i++){
            nums[i] = arr[i];
        }
    }
}
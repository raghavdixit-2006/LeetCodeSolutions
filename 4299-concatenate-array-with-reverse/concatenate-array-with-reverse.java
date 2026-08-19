class Solution {
    public int[] concatWithReverse(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];
        for(int i = 0; i < len; i++){
            ans[i] = nums[i];
        }
        int j = nums.length-1;
        int k = nums.length;
        while(j != -1){
            ans[k] = nums[j];
            j--;
            k++;
        }
        return ans;
    }
}
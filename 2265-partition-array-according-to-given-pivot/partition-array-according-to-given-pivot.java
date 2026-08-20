class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int one = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                ans[one] = nums[i];
                one++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                ans[one] = nums[i];
                one++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                ans[one] = nums[i];
                one++;
            }
        }
        return ans;
    }
}
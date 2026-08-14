class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int min = 5000;
        while(i<=j){
            if(min>nums[i]) min = Math.min(min, nums[i]);
            if(min>nums[j]) min = Math.min(min, nums[j]);
            i++;
            j--;            
        }
        return min;
    }
}
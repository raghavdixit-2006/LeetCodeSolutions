class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=nums.length-1; i>=0 ; i--){
            for(int j=0; j<i; j++){
                ans[i] = nums[j]+ans[i];
            }
        }
        
        for(int i=0; i<nums.length; i++){
            int temp=0;
            for(int j=i+1; j<nums.length; j++){
                temp = nums[j]+temp;
            }
            ans[i] = Math.abs(ans[i]-temp);
        }
        return ans;
    }
}
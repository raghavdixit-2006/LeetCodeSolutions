class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int product=1;
        // int idx=0;
        if(nums.length==3){
            for(int i = 0; i<3; i++){
                product *= nums[i];
            }
            return product;
        }
        Arrays.sort(nums);
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[n - 1] * nums[0] * nums[1]);
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int a = 0;
        for(int i=0; i<len; i++){
            if(nums[a] != nums[i]){
                a++;
                nums[a] = nums[i];
                // a++;
            }
        }
        return a+1;
    }
}
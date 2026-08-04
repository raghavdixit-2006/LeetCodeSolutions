class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums[0];
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; n++, i++){
            if(n < nums[i]){
                ans.add(n);
                i--;
            }
        }
        return ans;

    }
}
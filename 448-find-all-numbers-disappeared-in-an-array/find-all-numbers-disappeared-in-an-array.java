class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; i < nums.length+1; i++){
            set.add(nums[i-1]);
        }
        for(int i = 1; i < nums.length+1; i++){
            if(!set.contains(i)) list.add(i);
        }
        return list;
    }
}
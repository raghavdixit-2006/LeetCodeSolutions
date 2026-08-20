class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int[] ans = new int[nums.length];       
        for(int i = 0; i<nums.length; i++){
            if(arr1.isEmpty()){
                arr1.add(nums[i]);
                continue;
            }
            if(arr2.isEmpty()){
                arr2.add(nums[i]);
                continue;
            }
            if(arr1.get(arr1.size()-1) > arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }
            else arr2.add(nums[i]);
        }
        int n = 0;
        for(int i = 0; i<arr1.size(); i++){
            ans[i] = arr1.get(i);
            n++;
        }
        for(int i = 0; i<arr2.size(); i++){
            ans[n] = arr2.get(i);
            n++;
        }
        return ans;
    }
}
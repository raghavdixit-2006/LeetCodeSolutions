class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int[] ans = new int[nums.length];
        int one=0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<pivot) {arr1.add(nums[i]);}
            if(nums[i]==pivot) {p.add(nums[i]);}
            if(nums[i]>pivot) {arr2.add(nums[i]);}
        }
        for(int i=0; i<arr1.size(); i++){
            ans[i] = arr1.get(i);
            one++;
        }
        for(int i=0; i<p.size(); i++){
            ans[one] = p.get(i);
            one++;
        }
        for(int i=0; i<arr2.size(); i++){
            ans[one] = arr2.get(i);
            one++;
        }
        return ans;
    }
}
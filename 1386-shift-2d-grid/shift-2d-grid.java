class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int arr[] = new int[m * n];
        int j = 0;
        for (int i = 0; i < m; i++) { //loop to convert 2d mat into 1d arr
            for (int z = 0; z < n; z++) {
                arr[j] = grid[i][z];
                j++;

            }

        }
        int r = arr.length;
        k = k % r; 
//using logic of que 189 which is rotate arr to rotate k elements of arr
        reverse(arr, 0, r - 1); 
        reverse(arr, 0, k - 1);
        reverse(arr, k, r - 1);

//again converting 1d arr to 2d mat
        j = 0;
        for (int i = 0; i < m; i++) {
            for (int z = 0; z < n; z++){
                grid[i][z] = arr[j];
                j++;
                
            }
                

        }

//acc to quetion moving 2d arr to list
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            List<Integer> l = new ArrayList<>();

            for (int z = 0; z < n; z++) {
                l.add(grid[i][z]);
            }

            ans.add(l);
        }

        return ans;

    }

//function to reverse arr using 2 pointer

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int len1 = grid.length;
        int len2 = grid[0].length;
        List<List<Integer>> list = new ArrayList<>();

        int idx1 = 0;
        int idx2 = 0;
        k = k%(len1*len2);
        int n = k;

        for(int i = len1-1; i >= 0; i--){
            list.add(new ArrayList<>());
            for(int j = len2-1; j >= 0; j--){
                if(n==0) break;
                n--;
                idx1=i;
                idx2=j;
            }
        }

        for(int i = 0; i<len1; i++){
            for(int j = 0; j<len2; j++){
                if(idx2 >= len2){
                    idx1++;
                    idx2 = 0;
                }
                if(idx1 >= len1){
                    idx1 = 0;
                    idx2 = 0;
                }
                list.get(i).add(grid[idx1][idx2]);
                idx2++;
            }
        }
        // System.out.println(grid[idx1][idx2]);
        return list;
    }
}
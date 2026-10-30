class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0;
        for(int i=cost.length-1; i>=0; i-=3){
            // if(i<0) return sum;
            sum+=cost[i];
            if(i-1>=0){
                sum+=cost[i-1];
            }
            
        }
        // while(i>=0){

        // }
        return sum;
    }
}
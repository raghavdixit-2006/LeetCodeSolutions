class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int fi = fruits.length-1;
        int bi = baskets.length-1;
        int count = 0;
        for(int i = 0; i < fi+1; i++){
            for(int j = 0; j<fi+1; j++){
                if(baskets[j]!=-1 && fruits[i] != -1 && fruits[i] <= baskets[j]){
                    baskets[j] = -1;
                    fruits[i] = -1;
                }
            }
        }
        for(int i = 0; i<fi+1; i++){
            if(fruits[i]!=-1) count++;
        }
        return count;
    }
}
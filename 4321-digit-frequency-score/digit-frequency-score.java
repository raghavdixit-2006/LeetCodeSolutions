class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while(n!=0){
            int x = n%10;
            if(map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }
            else map.put(x, 1);
            n /= 10;
        }
        int ans = 0;
        for(int key : map.keySet()){
            ans += key * map.get(key);
        }
        return ans;
    }
}
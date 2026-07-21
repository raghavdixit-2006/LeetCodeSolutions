class Solution {

    public int helper(int n){
        int num=0;
        while(n!=0){
            num+=(n%10)*(n%10);
            n=n/10;
        }
        return num;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }

            set.add(n);
            n = helper(n);
        }

        return true;
    }
}
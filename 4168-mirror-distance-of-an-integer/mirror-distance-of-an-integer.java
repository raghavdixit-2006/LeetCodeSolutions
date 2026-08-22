class Solution {
    public int mirrorDistance(int n) {
        int temp = n;
        int num = 0;
        while(temp!=0){
            int x = temp%10;
            num *= 10;
            num += x;
            temp/=10;
        }
        return Math.abs(num-n);
    }
}
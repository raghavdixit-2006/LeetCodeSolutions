class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l=new ArrayList<>();
        int i=0;

        for(int nums : target){
            while(i<nums-1){
                l.add("Push");
                l.add("Pop");
                i++;
            }
            l.add("Push");
            i++;
        }
        return l;
    }
}
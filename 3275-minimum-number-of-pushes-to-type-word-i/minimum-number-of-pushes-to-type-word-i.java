class Solution {
    public int minimumPushes(String word) {
        System.out.println(word.length());
        if(word.length()<=8) return word.length();
        if(word.length()<=16)return 8+(word.length()-8)*(1*2);
        if(word.length()<=24)return (word.length()-8)*(1*3);
        return (word.length()*2)+((word.length()-24)*2);
    }
}
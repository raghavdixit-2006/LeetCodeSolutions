class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8) return word.length();
        else if(word.length()<=16)return 8+(word.length()-8)*(1*2);
        else if(word.length()<=24)return (word.length()-8)*(1*3);
        return (word.length()*2)+((word.length()-24)*2);
    }
}
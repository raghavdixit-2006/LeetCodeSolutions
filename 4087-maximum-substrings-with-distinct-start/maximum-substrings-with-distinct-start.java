class Solution {
    public int maxDistinct(String s) {
        char[] ch = new char[26];
        for(int i = 0; i < s.length(); i++){
            int x = s.charAt(i);
            int temp = x-'a';
            if(ch[temp] == 1) continue;
            else ch[temp]++;
        }
        int sum = 0;
        for(int i = 0; i < 26; i++){
            sum+=ch[i];
        }
        return sum;
    }
}
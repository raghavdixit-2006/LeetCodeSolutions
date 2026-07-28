class Solution {
    public String smallestPalindrome(String s) {
        int[] arr = new int[26];
        int idx=-1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            arr[ch-'a'] += 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if(arr[i]%2 != 0){
                idx=i;
                arr[i]--;
            }
            if(arr[i]==0) continue;
            char ch = (char) ('a' + i);

            if(arr[i]%2 == 0){for(int j=0; j < arr[i]/2; j++){
                sb.append(ch);
            }}
            
        }

        if(idx!=-1){for (int i = 0; i <1; i++) {
            char ch = (char) ('a' + idx);
            sb.append(ch);
        }}
        
        for (int i = 25; i >= 0; i--) {
            if(arr[i]==0) continue;
            if(arr[i]%2 != 0) continue;
            char ch = (char) ('a' + i);
            for(int j=0; j < arr[i]/2; j++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
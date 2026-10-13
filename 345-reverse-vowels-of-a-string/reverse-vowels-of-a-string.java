class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U'){
                list.add(s.charAt(i));
            }
        }
        Collections.reverse(list);
        int x = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U'){
                sb.append(String.valueOf(list.get(x++)));
            }
            else{
                sb.append(String.valueOf(s.charAt(i)));
            }
        }
        return sb.toString();

    }
}
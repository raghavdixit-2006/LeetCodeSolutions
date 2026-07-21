class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // String ransomNote = "aacbbd";
        // String magazine = "cccaaabbb";
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i<ransomNote.length(); i++){
            if(!map1.containsKey(ransomNote.charAt(i))){
                map1.put(ransomNote.charAt(i), 1);
            }
            else{
                map1.put(ransomNote.charAt(i), map1.get(ransomNote.charAt(i))+1);
            }
        }
        for(int i = 0; i<magazine.length(); i++){
            if(map2.containsKey(magazine.charAt(i))){
                map2.put(magazine.charAt(i), map2.get(magazine.charAt(i))+1);
            }
            else
                map2.put(magazine.charAt(i), 1);
        }
        for (char ch : map1.keySet()) {
            if (!map2.containsKey(ch) || map2.get(ch) < map1.get(ch)) {
                return false;
            }
        }
        return true;

    }
}
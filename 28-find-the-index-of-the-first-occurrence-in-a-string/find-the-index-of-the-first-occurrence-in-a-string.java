class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) return -1;
        // haystack = haystack+haystack;
        if(haystack.contains(needle)) return haystack.indexOf(needle);
        return -1;
    }
}
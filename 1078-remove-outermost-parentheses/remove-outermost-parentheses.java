class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        for(char ch: s.toCharArray()){
            if(ch == ')') count--;

            if(count != 0){
                str.append(ch);
            }

            if(ch == '(') count++;
        }

        return str.toString();
    }
}
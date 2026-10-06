class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chArr = s.toCharArray();
        for (char ch : chArr) {
            if (ch == ')') {
                if (!stack.empty() && stack.peek() == '('){
                    stack.pop();
                }
                else stack.push(ch);
            }
            else stack.push(ch);

        }
        return stack.size();
    }
}
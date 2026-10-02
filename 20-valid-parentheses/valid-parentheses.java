class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case '(': stack.push('('); break;
                case ')':{
                    if(stack.isEmpty()) stack.push(')');
                    if(stack.peek() == '(') stack.pop();
                    else stack.push(')');
                } break;
                case '[': stack.push('['); break;
                case ']':{
                    if(stack.isEmpty()) stack.push(']');
                    if(stack.peek() == '[') stack.pop();
                    else stack.push(']');
                } break;
                case '{': stack.push('{');break;
                case '}':{
                    if(stack.isEmpty()) stack.push('}');
                    if(stack.peek() == '{') stack.pop();
                    else stack.push('}');
                } break;
                default: stack.push(s.charAt(i));break;
            }

        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
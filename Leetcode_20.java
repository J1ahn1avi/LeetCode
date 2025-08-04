//20. Valid Parentheses
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '(' || i == '{' || i == '[') {
                stack.push(i);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char openb = stack.pop();

                if ((i == ')' && openb != '(') ||
                        (i == '}' && openb != '{') ||
                        (i == ']' && openb != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

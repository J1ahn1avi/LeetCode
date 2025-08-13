//3174. Clear Digits
class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for (char i : s.toCharArray()) {
            if (Character.isLetter(i)) {
                stack.push(i);
            } 
            else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        String res = "";
        for (char c : stack) {
            res += c;
        }
        return res;
    }
}

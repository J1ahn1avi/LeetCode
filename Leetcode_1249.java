//1249. Minimum Remove to Make Valid Parentheses
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();

        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    seen.add(i);
                }
            }
        }

        while (!stack.isEmpty()) {
            seen.add(stack.pop());
        }

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (!seen.contains(i)) {
                res += s.charAt(i);
            }
        }

        return res;
    }
}

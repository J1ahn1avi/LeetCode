//394. Decode String
class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for (char i : s.toCharArray()) {
            if (i == ']') {
                String res = "";
                while (!stack.isEmpty() && !stack.peek().equals("[")) {
                    res = stack.pop() + res;
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                String repnum = "";
                while (!stack.isEmpty() && stack.peek().matches("\\d")) {
                    repnum = stack.pop() + repnum;
                }
                int n = Integer.parseInt(repnum);
                String repstr = "";
                for (int j = 0; j < n; j++) {
                    repstr += res;
                }
                stack.push(repstr);
            } 
            else {
                stack.push(String.valueOf(i));
            }
        }

        String decode = "";
        for (String i : stack) {
            decode += i;
        }
        return decode;
    }
}

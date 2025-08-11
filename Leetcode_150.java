//150. Evaluate Reverse Polish Notation
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String i : tokens) {
            if (!i.equals("+") && !i.equals("-") && !i.equals("*") && !i.equals("/")) {
                stack.push(Integer.parseInt(i));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int res = 0;
                switch (i) {
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                    case "/":
                        res = a / b;
                        break;
                }
                stack.push(res);
            }

        }
        return stack.pop();
    }
}

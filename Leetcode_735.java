//735. Asteroid Collision
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            boolean des = false;
            while (!stack.isEmpty() && i < 0 && stack.peek() > 0) {
                if (stack.peek() == Math.abs(i)) {
                    stack.pop();
                    des = true;
                    break;
                } else if (stack.peek() < Math.abs(i)) {
                    stack.pop();
                    continue;
                } else {
                    des = true;
                    break;
                }
            }
            if (!des) {
                stack.push(i);
            }
        }

        int res[] = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}

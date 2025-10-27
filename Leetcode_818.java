//818. Race Car
class Solution {
    public int racecar(int target) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { 0, 0, 1 });
        Set<String> visited = new HashSet<>();

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int moves = curr[0];
            int pos = curr[1];
            int speed = curr[2];
            if (pos == target) {
                return moves;
            }
            String currState = (pos + "," + speed);
            if (!visited.contains(currState)) {
                visited.add(currState);
                queue.offer(new int[] { moves + 1, pos + speed, speed * 2 });
                int newSpeed = speed;
                if (pos + speed < target && speed < 0) {
                    newSpeed =1;
                } else if( pos+speed>target && speed>0){
                    newSpeed = -1;
                }
                queue.offer(new int[] { moves + 1, pos, newSpeed });
            }
        }
        return -1;
    }
}

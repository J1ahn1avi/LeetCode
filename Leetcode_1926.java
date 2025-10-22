//1926. Nearest Exit from Entrance in Maze
class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int nrow=maze.length;
        int ncol=maze[0].length;
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{entrance[0],entrance[1],0});
        maze[entrance[0]][entrance[1]]='+';

        int dir[][]={{0,-1},{0,1},{-1,0},{1,0}};

        while(!queue.isEmpty()){
            int []curr=queue.poll();
            int row=curr[0];
            int col=curr[1];
            int step=curr[2];

            for(int d[]:dir){
                int currRow=row+d[0];
                int currCol=col+d[1];

                if(currRow>=0 && currRow<nrow && currCol>=0 && currCol<ncol && maze[currRow][currCol]=='.'){
                    if(currRow==0 || currRow==nrow-1 || currCol==0 || currCol==ncol-1){
                        return step+1;
                    }
                    maze[currRow][currCol]='+';
                    queue.offer(new int[] {currRow,currCol,step+1});
                }
            }
        }
        return -1;
    }
}

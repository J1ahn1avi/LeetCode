//463. Island Perimeter
class Solution {
    public int islandPerimeter(int[][] grid) {
        int nr=grid.length;
        int perimeter=0;
        int nc=grid[0].length;
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                if(grid[i][j]==1){
                    perimeter+=4;
                    if(j>0 && grid[i][j]==1 && grid[i][j-1]==1){
                        perimeter-=2;
                    }
                    if(i>0 && grid[i][j]==1 && grid[i-1][j]==1){
                        perimeter-=2;
                    }

                }
            }
        }
        return perimeter;
    }
}

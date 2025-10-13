//200. Number of Islandsclass Solution {
    public int numIslands(char[][] grid) {
        int nr = grid.length;
        int nc = grid[0].length;
        int count = 0;
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, nr, nc, i, j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int nr, int nc, int i, int j) {
        if ((i < 0) || j < 0 || i >= nr || j >= nc || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '2';
        dfs(grid, nr, nc, i, j - 1);
        dfs(grid, nr, nc, i, j + 1);
        dfs(grid, nr, nc, i - 1, j);
        dfs(grid, nr, nc, i + 1, j);
    }
}

//73. Set Matrix Zeroes
class Solution {
    public void setZeroes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Set<Integer> rowidx = new HashSet<>();
        Set<Integer> colidx = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    rowidx.add(i);
                    colidx.add(j);
                }
            }
        }
        for (int i : rowidx) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = 0;
            }
        }
        for (int j : colidx) {
            for (int i = 0; i < m; i++) {
                mat[i][j] = 0;
            }
        }
    }
}

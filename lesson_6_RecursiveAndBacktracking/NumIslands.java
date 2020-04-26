package leetcode.lesson_6_RecursiveAndBacktracking;

public class NumIslands {
    private final int[][] d = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    private int m, n;

    private boolean[][] momo;

    public static void main(String[] args) {
        char[] tmp = new char[]{'1', '1', '0', '0', '0', '1', '1', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '1', '1'};
        NumIslands ws = new NumIslands();
        char[][] board = new char[4][5];
        int jj = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = tmp[jj++];
            }
        }
        System.out.println(ws.numIslands(board));
    }

    public boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        momo = new boolean[m][n];
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!momo[i][j] && grid[i][j] == '1') {
                    floodFill(grid, i, j, momo);
                    ans++;
                }
            }
        }
        return ans;
    }

    public void floodFill(char[][] grid, int x, int y, boolean[][] momo) {

        momo[x][y] = true;

        for (int i = 0; i < 4; i++) {
            if (inArea(x + d[i][0], y + d[i][1]) && !momo[x + d[i][0]][y + d[i][1]] && grid[x + d[i][0]][y + d[i][1]] == '1')
                floodFill(grid, x + d[i][0], y + d[i][1], momo);
        }
        return;
    }
}

package leetcode.lesson_6_RecursiveAndBacktracking;


public class WordSearch {

    private int[][] d = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    private int m, n;

    public boolean exist(char[][] board, String word) {

        m = board.length;
        n = board[0].length;

        boolean[][] momo = new boolean[m][n];

        for (int i = 0; i < m; i ++)
            for (int j = 0; j < n; j ++){
                if (findChar(board, word, momo, 0,i, j)) return true;
            }
        return false;
    }
    public boolean findChar(char[][] board, String word, boolean[][] momo,int index, int x, int y){

        if (index == word.length() - 1) return board[x][y] == word.charAt(index);

        if (word.charAt(index) == board[x][y]) {
            momo[x][y] = true;
            for (int i = 0; i < 4; i ++){
                if (inArea(x + d[i][0], y + d[i][1]) && !momo[x + d[i][0]][y + d[i][1]]) {
                    if(findChar(board, word, momo, index + 1, x + d[i][0], y + d[i][1]))
                        return true;
                }
            }
            momo[x][y] = false;
        }
       return false;
    }

    public boolean inArea(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public static void main(String[] args){
        char[] tmp = new char[]{'A','B','C','E','S','F','C','S','A','D','E','E'};
        WordSearch ws = new WordSearch();
        char[][] board = new char[3][4];
        int jj  = 0;
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 4; j ++){
                board[i][j] = tmp[jj ++];
            }
        }
        System.out.println(ws.exist(board, "SEE"));
    }
}

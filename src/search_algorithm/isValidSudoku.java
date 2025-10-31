package search_algorithm;


//有效的数独~~
class Solution17 {


    // 标行，标列
    boolean[][] row,col;
    boolean[][][] grid;

    public boolean isValidSudoku(char[][] board) {
        row = new boolean[9][10];
        col = new boolean[9][10];
        grid = new boolean[3][3][10];


        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j< 9;j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] - '0';
                    if(row[i][num] || col[j][num] || grid[i / 3][j / 3][num] ){
                        return false;
                    }
                    row[i][num] =col[j][num] =grid[i /3][j / 3][num] = true;
                }

            }
        }
        return true;
    }
}


public class isValidSudoku {


}

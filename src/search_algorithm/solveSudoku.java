package search_algorithm;

class Solution18 {

    boolean[][] row,col;
    boolean[][][] grid;


    // 判断数独中存在哪些数字~~
    public void func(char[][] board){

        for(int i = 0; i< 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] - '0';
                    row[i][num] = col[j][num] = grid[i / 3][j / 3][num] = true;
                }
            }
        }
    }

    public void solveSudoku(char[][] board) {

        // 这些用来剪枝~~
        row = new boolean[9][10];
        col = new boolean[9][10];
        grid = new boolean[3][3][10];
        func(board);

        dfs(board);

    }

    public boolean dfs(char[][] board){

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j< 9 ; j++){
                if(board[i][j] == '.'){
                    for(int num = 1 ; num <= 9 ; num++){
                        if(!col[j][num] && !row[i][num] && !grid[i / 3][j / 3][num]){
                            board[i][j] = (char)(num+'0');
                            row[i][num] = col[j][num] = grid[i / 3][j / 3][num] =true;
                            if(dfs(board)) return true;
                            board[i][j] = '.';
                            row[i][num] = col[j][num] = grid[i / 3][j / 3][num] =false;
                        }
                    }
                    // 这里面1~9都不合适直接返回上一层~~
                    return false;
                }
            }

        }
        // 走到这里，说明所有的数都已经填完了，直接返回true即可~~
        return true;
    }
}

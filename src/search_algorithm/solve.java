package search_algorithm;

class Solution23 {

    int m, n;



    // 正难则反
    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;

        for(int j = 0 ; j < n ; j++){
            if(board[0][j] == 'O'){
                dfs(board,0,j);
            }
            if(board[m-1][j] == 'O'){
                dfs(board,m-1,j);
            }

        }

        for(int i = 0 ; i < m ; i++){
            if(board[i][0] == 'O'){
                dfs(board,i,0);
            }
            if(board[i][n-1] == 'O'){
                dfs(board,i,n-1);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' ) {
                    board[i][j] = 'X';
                }
                if(board[i][j] == '.'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    int[] dx = { 1, -1, 0, 0 };
    int[] dy = { 0, 0, 1, -1 };

    public void dfs(char[][] board, int i, int j) {

        board[i][j] = '.';


        for (int k = 0; k < 4; k++) {
            int x = dx[k] + i;
            int y = dy[k] + j;

            if (x >= 0 && x < m && y >= 0 && y < n && board[x][y] == 'O') {

                dfs(board,x,y);
            }
        }
    }

}
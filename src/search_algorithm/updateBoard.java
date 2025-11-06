package search_algorithm;



//扫雷游戏~~
class Solution26 {

    int n, m;

    // 是不是首先便利找个雷的位置~~
    public char[][] updateBoard(char[][] board, int[] click) {

        m = board.length;
        n = board[0].length;

        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }

        dfs(board, click[0], click[1]);
        return board;

    }

    int[] dx = { 0, 0, 1, -1, 1, 1, -1, -1 };
    int[] dy = { 1, -1, 0, 0, -1, 1, 1, -1 };

    public void dfs(char[][] board, int i, int j) {

        int count = 0;
        // 统计周围地雷的个数~~
        for (int k = 0; k < 8; k++) {

            int x = i + dx[k];
            int y = j + dy[k];

            if (x >= 0 && x < m && y >= 0 && y < n && board[x][y] == 'M') {
                count++;
            }

        }
        // 周围没有地雷
        if (count == 0) {
            board[i][j] = 'B';
            for (int k = 0; k < 8; k++) {

                int x = i + dx[k];
                int y = j + dy[k];
                // 这是未显露的E~~ 根据题目规则，可以继续进行递归~~
                if (x >= 0 && x < m && y >= 0 && y < n && board[x][y] == 'E') {
                    dfs(board, x, y);
                }
            }

        } else {
            // 周围有地雷，就不需要再递归了，修改其值即可~~
            board[i][j] = (char) ('0' + count);
            return;
        }

    }
}

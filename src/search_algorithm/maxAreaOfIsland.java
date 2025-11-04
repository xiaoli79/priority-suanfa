package search_algorithm;

class Solution24 {

    int n, m;
    boolean[][] vis;
    int res;
    int count;

    public int maxAreaOfIsland(int[][] grid) {

        m = grid.length;
        n = grid[0].length;
        vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1 && !vis[i][j]) {
                    count = 0;
                    dfs(grid, i, j);
                    res = Math.max(res,count);
                }
            }
        }
        // 返回其值~~
        return res;
    }

    int[] dx = { 1, -1, 0, 0 };
    int[] dy = { 0, 0, 1, -1 };

    public void dfs(int[][] grid, int i, int j) {

        count++;
        vis[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int x = dx[k] + i;
            int y = dy[k] + j;

            // 只要满足if逻辑，才会调用dfs~~
            if (x >= 0 && x < m && y >= 0 && y < n && !vis[x][y] && grid[x][y] == 1) {

                dfs(grid, x, y);

            }

        }

    }
}
package search_algorithm;




//黄金矿工~~
class Solution20 {
    boolean[][] vis;
    int n,m;
    int res = 0;

    public int getMaximumGold(int[][] grid) {

        n = grid.length;
        m = grid[0].length;
        vis = new boolean[n][m];

        // 遍历~~
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++ ){
                if(grid[i][j] != 0){
                    vis[i][j] = true;
                    // 执行递归~~
                    dfs(grid,i,j,grid[i][j]);
                    vis[i][j] = false;

                    // 如若不满足，需要进行回溯~~
                }
                // 需要判断是否完成，否则需要回溯~~
            }
        }
        return res;
    }
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};



    // 存值，然后与res进行比较，但是我不知道递归出口是什么~~
    int tmp = 0;

    public void dfs(int[][] grid,int i,int j,int currentSum){
        //递归出口~~

        boolean canMove = false;

        if(!canMove){

            res = Math.max(res,currentSum);
        }

        // 递归逻辑~~
        for(int k = 0 ; k< 4 ; k++){

            int x = i + dx[k];
            int y = j + dy[k];

            // 需要有判断值是否是最大~~
            if(x >= 0 && x < n && y >=0 && y < m && !vis[x][y] && grid[x][y] != 0){
                canMove = true;
                vis[x][y] = true;

                dfs(grid,x,y,currentSum + grid[x][y]);

                vis[x][y] = false;

            }

        }
    }
}
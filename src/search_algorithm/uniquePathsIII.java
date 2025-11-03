package search_algorithm;



class Solutio21 {

    int n ,m;
    int cnt;

    int init_x;
    int init_y;

    int res;

    boolean[][] vis;

    // 不同路径III
    public int uniquePathsIII(int[][] grid) {

        n = grid.length;m = grid[0].length;

        vis = new boolean[n][m];

        for(int i = 0 ; i < n  ; i++){
            for(int j = 0 ; j < m ; j++){

                if(grid[i][j] == 0){
                    cnt++;
                }

                if(grid[i][j] == 1){
                    init_x = i;
                    init_y = j;
                }
            }
        }

        vis[init_x][init_y] = true;
        dfs(grid,init_x,init_y,0);
        vis[init_x][init_y] = false;


        return res;
    }


    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};


    public void dfs(int[][] grid,int init_x,int init_y,int tmp){
        if(grid[init_x][init_y] == 2){
            if(cnt == tmp){
                res++;
            }
            return;
        }


        // 上下左右四条路径进行遍历~~
        for(int k = 0 ; k < 4; k++){
            int x = dx[k] + init_x;
            int y = dy[k] + init_y;

            if(x >= 0 && x < n && y >=0 && y < m && grid[x][y] != -1 && !vis[x][y]){
                vis[x][y] = true;
                int next_tmp = tmp;
                if(grid[x][y] == 0){
                    next_tmp = tmp +1;
                }
                dfs(grid,x,y,next_tmp);
                vis[x][y] = false;
            }
        }
    }
}







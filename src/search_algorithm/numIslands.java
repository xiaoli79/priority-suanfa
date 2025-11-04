package search_algorithm;

//岛屿数量


class Solution22 {


    int m,n;

    boolean[][] vis;
    int res;

    public int numIslands(char[][] grid) {

        m = grid.length;
        n = grid[0].length;
        vis = new boolean[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    res++;
                    dfs(grid,i,j);
                }

            }
        }
        return res;
    }

    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};

    // 递归的逻辑~~
    public void dfs(char[][] grid,int i , int j){


        vis[i][j] = true;


        for(int k =0 ; k < 4 ; k++){
            int x = dx[k] + i ;
            int y = dy[k] + j;

            if(x >= 0 && x < m && y >=0 && y < n && grid[x][y] == '1' && !vis[x][y] ){

                dfs(grid,x,y);
            }
        }

    }
}
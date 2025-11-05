package search_algorithm;

import java.util.ArrayList;
import java.util.List;

class Solution25 {
    int n ,m;

    List<List<Integer>> res;

    boolean[][] pac ;
    boolean[][] atl;



    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;

        pac = new boolean[m][n];

        atl = new boolean[m][n];

        res = new ArrayList<>();


        for(int j = 0 ; j < n ; j++ ){
            dfs(heights,0,j,pac);
            dfs(heights,m-1,j,atl);
        }

        for(int i = 0 ; i< m ; i ++) {
            dfs(heights,i,0,pac);
            dfs(heights,i,n-1,atl);
        }

        for(int i = 0 ; i< m ; i++){
            for(int j = 0 ; j< n ; j++){
                if(pac[i][j] == true && atl[i][j] == true){
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(i);
                    tmp.add(j);
                    res.add(tmp);
                }
            }
        }
        return res;
    }
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};

    public void dfs(int[][] height ,int i,int j, boolean[][] vis){

        vis[i][j] = true;


        for(int k = 0 ; k< 4 ;k++){
            int x = dx[k] + i;
            int y = dy[k] + j;

            if(x >= 0 && x < m && y >= 0 && y < n && height[i][j] <= height[x][y] && !vis[x][y]){
                dfs(height,x,y,vis);
            }
        }
    }

}
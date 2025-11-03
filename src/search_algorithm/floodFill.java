package search_algorithm;


// 使用dfs完成图像渲染~~
class Solution21 {

    int n ,m;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        n = image.length;
        m= image[0].length;
        // 使用一个变量记录之前的~~颜色~~
        int curColor = image[sr][sc];


        if(curColor != color){
            dfs(image,sr,sc,curColor,color);
        }
        return image;
    }

    // 往上下左右四个方向进行扩展~~
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};

    public void dfs(int[][] image,int i , int j , int curColor,int color){


        // 如果等于之前的颜色，就进行修改~~
        if(image[i][j] == curColor){
            image[i][j] = color;

            // 四个分支~~
            for(int k = 0 ;k < 4 ; k++){
                int x = dx[k] + i ;
                int y = dy[k] + j;
                if(x >=0 && x < n && y >= 0 && y < m ){
                    dfs(image,x,y,curColor,color);
                }
            }
        }

    }
}
package search_algorithm;

class Solution19 {
    // 统计路径，避免重复对象
    boolean[][] visit;


    char[] word;

    // 判断是否存在~~
    public boolean exist(char[][] board, String _word) {

        visit = new boolean[board.length][board[0].length];

        word = _word.toCharArray();


//      记住主函数也可以套循环~~
        for(int i = 0 ; i< board.length ; i++){
            for(int j = 0 ; j <board[0].length ; j++){
                if(word[0] == board[i][j]){
                    visit[i][j] =true;

                    if(dfs(board,i,j,1)){
                        return true;
                    }
                    visit[i][j] = false;
                }
            }
        }
        return false;
    }


    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};

    public boolean dfs(char[][] board,int i ,int j,int pos){

        if(pos == word.length){
            return true;
        }


        for(int k = 0 ; k < 4 ; k++){
            int x = i + dx[k];
            int y = j + dy[k];

            // 上下左右四个位置进行遍历~~ 居然把最重要的条件给忘了~~
            if( x >= 0 && x < board.length &&y >= 0 && y < board[0].length && !visit[x][y] && board[x][y] == word[pos]){

                visit[x][y] = true;
                if(dfs(board,x,y,pos+1)) return true;
                visit[x][y] = false;
            }

        }
        return false;
    }
}
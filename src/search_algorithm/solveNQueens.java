package search_algorithm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//n皇后问题~~
class Solution16 {
    // 列，主对角线，副对角线~~
    boolean[] checkCol,checkDig1,checkDig2;

    List<List<String>> res;
    char[][] path;
    int n;

    public List<List<String>> solveNQueens(int _n) {

        n = _n;
        path = new char[n][n];
        // 列
        checkCol = new boolean[n];
        // 主对角线
        checkDig1 = new boolean[2*n];
        // 副对角线~~
        checkDig2 = new boolean[2*n];

        res = new ArrayList<>();

        for(int i = 0 ;i< n ; i++){
            Arrays.fill(path[i],'.');
        }

        dfs(0);
        return res;
    }


    public void dfs(int row){
        // 边界情况
        if(row == n){
            List<String> tmp = new ArrayList<>();
            for(int i = 0 ; i< n ; i++){
                tmp.add(new String(path[i]));
            }
            res.add(new ArrayList<>(tmp));
            return;
        }

//      这个决策树是先对
        for(int col = 0 ; col < n ; col++){
            if(checkCol[col] == false &&  checkDig1[row-col+n] == false && checkDig2[row+col] == false){
                // 把该位置设置成n皇后~~
                path[row][col] = 'Q';
                checkCol[col] = checkDig1[row-col+n] = checkDig2[row+col] = true;
                // 往下一行去寻找
                dfs(row+1);
                // 恢复现场~~
                path[row][col] = '.';
                checkCol[col] = checkDig1[row-col+n] = checkDig2[row+col] = false;

            }
        }

    }
}

public class solveNQueens {
}

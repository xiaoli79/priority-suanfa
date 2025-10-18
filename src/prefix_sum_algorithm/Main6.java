package prefix_sum_algorithm;


//矩阵区域和~~
class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length , n =mat[0].length;
        int[][] dp = new int[m+1][n+1];

        // 求出前缀和数组
        for(int i = 1  ; i <= m ; i++ ){
            for(int j = 1 ; j<= n ; j++){
//              二维前缀和的递推公式~~
                dp[i][j] = dp[i-1][j] + dp[i][j-1] -dp[i-1][j-1] + mat[i-1][j-1];
            }
        }
        int[][] ret = new int[m][n];
        for(int i =0 ; i< m ; i++){
            for(int j = 0 ; j< n ; j++){

                // 映射，以及考虑边界情况~~
                int x1 = Math.max(0,i-k) + 1,y1=Math.max(0,j-k) + 1;
                int x2 = Math.min(m-1,i+k) + 1,y2=Math.min(n-1,j+k) + 1;
                ret[i][j] = dp[x2][y2] - dp[x1-1][y2] - dp[x2][y1-1] + dp[x1-1][y1-1];
            }
        }
        return ret;
    }
}

public class Main6 {
}

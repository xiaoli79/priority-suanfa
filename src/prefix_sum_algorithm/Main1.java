package prefix_sum_algorithm;

class Solution1 {
    public int pivotIndex(int[] nums) {

        // 需要找到中心下标！！！~~
        int[] dp = new int[nums.length+1];

        // 维护dp~~
        for(int i = 0 ;  i< nums.length;i++){
            dp[i+1] = nums[i]+dp[i];
        }

        for(int i = 0 ; i < nums.length ; i++){
            //
            if(dp[i] == dp[nums.length] - dp[i + 1]){
                return i;
            }
        }

        return -1;
    }
}




class Solution11 {
    public int pivotIndex(int[] nums) {

        int n = nums.length;
        int[] f = new int[n];
        // 后缀积数组  g 表示[i+1,n-1] 的后缀积~
        int[] g = new int[n];
        f[0] = g[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            f[i] = f[i - 1] + nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            g[i] = g[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < n; i++) {

            if (f[i] == g[i]) {
                return i;
            }
        }
        return -1;
    }

}

public class Main1 {



}

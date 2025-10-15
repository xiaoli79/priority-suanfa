package prefix_sum_algorithm;

//解法2
class Solution22 {

    // 世界需要缝缝补补~~
    public int[] productExceptSelf(int[] nums) {

        int[] res  = new int[nums.length];
        int[] dp = new int[nums.length+1];

        dp[0] = 1;
        // 求前缀和
        for(int i = 0 ; i < nums.length ;i ++){
            dp[i+1] = dp[i] * nums[i];
        }
        // 这道题对除法卡死了~~
        // 遍历数组~~  要考虑边界情况~~
        int tmp = nums[nums.length-1];
        for(int right= nums.length - 1 ; right >= 0 ;right--){

            // 这个需要跳过该次循环~~
            if(right == nums.length - 1){
                res[right] = dp[right];
                continue;
            }
            res[right] = dp[right] * tmp;
            tmp *= nums[right];
        }
        return res;
    }


}

//解法一~~
class Solution2 {

    // 世界需要缝缝补补~~
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[nums.length];


        // 预处理一下数组~~
        // 前缀积数组  f 表示[0,i-1] 的前缀积
        int[] f = new int[n];
        // 后缀积数组  g 表示[i+1,n-1] 的后缀积~
        int[] g = new int[n];
        f[0] = g[n-1] = 1;

        for(int i =1 ; i < n ; i++){
            f[i] = f[i-1] * nums[i-1];
        }

        for(int i = n - 2 ; i >=0; i--){
            g[i] = g[i+1] * nums[i+1];
        }

        for(int i = 0 ; i< n ;i++){
            res[i] = f[i] * g[i];
        }

        return res;
    }


}


public class Main2 {


    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.productExceptSelf(new int[]{1, 2, 3, 4}));
    }
}

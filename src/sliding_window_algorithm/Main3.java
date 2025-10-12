package sliding_window_algorithm;



class Solution3 {
    public int longestOnes(int[] nums, int k) {

        int left =0 ,right =0;
        int ret =0;
        int cnt =0;
//      滑动窗口的逻辑！！
        while(right < nums.length){

            if(nums[right] == 0){
                cnt++;
            }
            while(cnt > k){
                if(nums[left] == 0){
                    cnt--;
                }
                left++;
            }
//          过程中更新其值
            ret = Math.max(ret,right-left+1);
            right++;

        }
        return ret;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        s.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2);
    }
}

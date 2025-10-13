package sliding_window_algorithm;



//滑动窗口，正难则反~~
class Solution4 {
    public int minOperations(int[] nums, int x) {

        // 正难则反,滑动窗口

        int max = -1;
        int sum =0;
        for(int i = 0 ; i < nums.length ;i++){
            sum+= nums[i];
        }
        int left=0,right =0;
        int target = sum -x;
        if(target < 0) return -1;

        int tmp =0;
        while(right<nums.length){
            tmp += nums[right];

            while(tmp > target && left <= right){
                tmp-=nums[left];
                left++;
            }

            if(tmp == target){
                max = Math.max(max,right-left+1);
            }
            right++;
        }
        return max ==-1 ? max : nums.length - max;
    }
}




public class Main4{
    public static void main(String[] args) {

    }
}
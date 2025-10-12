package sliding_window_algorithm;




//长度最小的子数组！！
//这才是一个滑动窗口标准写法
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // 初始化最小长度为一个不可能达到的最大值
        int minLength = Integer.MAX_VALUE;

        // 初始化窗口的左边界、右边界和窗口内的和
        int left = 0;
        int currentSum = 0;

        // right 指针负责扩大窗口
        for (int right = 0; right < nums.length; right++) {
            // 将新元素加入窗口的和
            currentSum += nums[right];

            // 当窗口内的和满足条件 (>= target) 时
            // 尝试收缩窗口，以寻找更小的长度
            while (currentSum >= target) {
                // 1. 更新最小长度
                minLength = Math.min(minLength, right - left + 1);

                // 2. 从和中移除最左边的元素
                currentSum -= nums[left];

                // 3. 移动左边界，即收缩窗口
                left++;
            }
        }

        // 如果 minLength 没有被更新过，说明没有找到符合条件的子数组
        // 否则返回找到的最小长度
//      判断成功后，更新其值
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}





public class Main {


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minSubArrayLen(11,new int[]{1,2,3,4,5}));
    }
}

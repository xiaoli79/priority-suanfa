package binary_search;

class Solution {
    // 处理边界情况~~
    public int[] searchRange(int[] nums, int target) {
        // 判断数组是否为空,进行进行边界情况的判断~~
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        int left = 0, right=nums.length-1;
        int begin =-1,end =-1;


//      寻找左边界
        while(left < right){
            int mid = left + (right -left ) / 2;

            if(nums[mid] < target){
                left =mid + 1;
            }else if(nums[mid] >= target){
                right =mid;
            }
        }


        if (nums[left] != target) {
            return new int[]{-1, -1};
        }
        begin = right;


        left = 0; right = nums.length-1;
//      寻找右边界~~
        while(left < right){
            int mid = left + (right -left+1) / 2;

            if(nums[mid] <= target){
                left =mid;
            }else if(nums[mid] > target){
                right =mid-1;
            }
        }
        end =left;
        return new int[]{begin,end};
    }
}



public class Main2 {




}

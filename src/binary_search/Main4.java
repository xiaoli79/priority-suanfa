package binary_search;


class Solution4 {
    public int searchInsert(int[] nums, int target) {

        // 寻找左端点

        int left = 0 ,right = nums.length-1;


        while(left < right){
            int mid = left + (right -left ) /2 ;
            if(nums[mid] < target){
                left = mid+1;
            }else{
                right =mid;
            }
        }
        if(nums[left] < target){
            return left + 1;
        }
        return left;
    }
}



public class Main4 {

}

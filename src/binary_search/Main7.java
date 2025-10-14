package binary_search;



class Solution7  {


    public int takeAttendance1(int[] nums) {

        int left =0 ,right = nums.length -1;
        while(left < right){
            int mid = left + (right - left) /2 ;

            if(nums[mid] == mid ) left= mid + 1;
            else right = mid;
        }

        // 这个用来处理最后的边界情况！！~~莴苣了~就是完全升序的时候，啥都不缺~~
        return nums[left] == left ?left+1 : left;
    }
    public int takeAttendance2(int[] nums) {
        for(int i = 0 ; i< nums.length; i++){
            // 我是sb
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}

public class Main7 {
}

package two_pointer_demo;

//移动0问题
class Solution1 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j  = 0;
        while(i < nums.length){
            if(nums[i] !=  0 && nums[j] == 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
            if(nums[j] != 0){
                j++;
            }
            i++;
        }
    }
}


public class Main1 {

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        solution.moveZeroes(new int[]{0,1,0,3,12});
    }

}

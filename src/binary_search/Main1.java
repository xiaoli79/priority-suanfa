package binary_search;



class Solution1 {
    public int search(int[] nums, int target) {


        int left =0,right =nums.length-1;


        while(left <= right){
            int mid = left +(right -left) /2;


            if(nums[mid] > target){
                right = mid-1;
            }else if(nums[mid] < target){
                left =mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}


public class Main1 {
    public static void main(String[] args) {

    }
}

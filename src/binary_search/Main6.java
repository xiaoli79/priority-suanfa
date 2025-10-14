package binary_search;



//寻找二段性~~
class Solution6 {
    public int findMin(int[] nums) {

        int left =0 , right=  nums.length -1,n=nums.length;
        while(left < right){
            int mid = left +  (right- left) /2;

            if(nums[mid] <= nums[n-1]){
                right =mid;
            }else{
                left =mid +1;
            }
        }
        return nums[left];
    }
}

public class Main6 {

    public static void main(String[] args) {

    }
}

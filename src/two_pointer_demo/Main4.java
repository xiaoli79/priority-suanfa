package two_pointer_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//三数之和
class Solution4 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ret = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0 ; i< nums.length-2;i++){

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // 跳过重复的起始元素
            }

            int left = i + 1,right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0){
                    left++;
                }else if( sum > 0){
                    right--;
                }else{

                    ret.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    // 这里是while循环，进行left，right指针去重！！
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    // 跳过重复元素之后，再进行加减D
                    left++;
                    right--;
                }
            }
        }
        return ret;

    }
}



public class Main4 {


    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}

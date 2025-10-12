package two_pointer_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



//四数之和
class Solution5 {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ret = new ArrayList<>();

        // 排序
        Arrays.sort(nums);
        // 固定一个值
        for(int i = 0; i< nums.length-3;i++){
            // 进行去重
            if( i > 0 && nums[i-1] == nums[i]){
                continue;
            }
            // 固定第二个值
            for(int j = i+1; j<nums.length-2;j++){
                // 进行去重
                if( j > i + 1   && nums[j-1] == nums[j]){
                    continue;
                }

                int left = j+1;
                int right = nums.length-1;
                while(left < right){
                    // 它会有一个整形提升~~ 如果对单独一个数组进行类型提升！！
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(target-sum > 0){
                        left++;
                    }else if(target - sum <0){
                        right--;
                    }else{
                        ret.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        // 去重！！
                        while(left < right && nums[left] == nums[left+1]){
                            left++;
                        }
                        while( left < right && nums[right] == nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return ret;
    }
}


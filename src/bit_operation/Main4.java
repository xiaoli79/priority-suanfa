package bit_operation;


//leetcode 136

//只出现一次的数字~~
class Solution4 {
    public int singleNumber(int[] nums) {

        int res = 0;
        for(int i = 0 ; i< nums.length; i++){
            res ^= nums[i];

        }
        return res;

    }
}


public class Main4 {
}

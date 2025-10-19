package bit_operation;



class Solution7{

    // 使用异或来进行运算
    public int missingNumber1(int[] nums) {
        int res = 0;
        for(int num : nums){
            res ^= num;
        }
        for(int i = 0 ; i < nums.length + 1;i++) {
            res ^= i;
        }
        return res;

    }


    // 使用哈希表
    public int missingNumber2(int[] nums) {
        int[] hash = new int[nums.length+1];

        for(int i = 0 ; i< nums.length ; i++){
            hash[nums[i]]++;
        }

        for(int i = 0 ; i< nums.length ; i++){
            if(hash[i] == 0){
                return i;
            }
        }
        return nums.length;
    }


    // 使用高斯求和来算
    public int missingNumber3(int[] nums) {

        int n = nums.length + 1;
        // 使用高斯求和
        int sum = ((0 + n-1) * n) / 2;

        int tmp = 0;

        for(int num : nums){
            tmp += num;
        }

        return sum - tmp;

    }


}

public class Main7 {
}

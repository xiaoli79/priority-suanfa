package bit_operation;

//面试题17.19~~位运算~~
class Solution10 {
    // 哈希表的空间复杂度~~为O(n)
    public int[] missingTwo(int[] nums) {
        int tmp = 0;
        for(int x : nums){
            tmp ^= x;
        }
        for(int i = 1 ; i<= nums.length + 2; i ++){
            tmp ^= i;
        }
        // 通过以上的步骤找到了只出现一次的两个数字~~

        int diff = 0;
        // 找到只出现一次的两个数字肯定不一样，也就是0和1
        while(true){
            if(((tmp >> diff) & 1) == 1) break;
            else diff++;
        }

        // 进行分组~~相同的被分到一组，肯定会被抵消~~~
        int[] ret = new int[2];
        for(int x : nums){
            if(((x >> diff) & 1 ) == 1) ret[1] ^=x;
            else ret[0] ^= x;
        }
        for(int i = 1 ; i<= nums.length + 2; i ++){
            if(((i >> diff) & 1) == 1) ret[1] ^= i;
            else ret[0] ^=i;
        }
        // 最后即是结果~~
        return ret;
    }
}

public class Main10 {
}

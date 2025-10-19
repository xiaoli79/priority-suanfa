package bit_operation;



//leetcode 260
//只出现一次的数字(III)
class Solution5 {
    public int[] singleNumber(int[] nums) {

        int res =0 ;
        for(int num : nums){
            res ^= num;
        }

//      假设有两个元素a和b,分别代表我们要求的代表,
//      a和b在二进制中,至少会有一位不同,我们把它找出来~~,存到diff中
        int diff = res & (-res);
//      进行分组~~分成A和B两个小组,因为a和b不同,所以他们会被分到不同的组,
//      而相同的元素 同时  & diff 肯定会被分到同一组中,然后异或进行消除即可~~
        int a = 0, b = 0;
        for(int num : nums){
            if((diff & num) == 0){
                a ^= num;
            }else{
                b ^= num;
            }
        }
//      最后求出正确的答案~~
        return new int[]{a,b};

    }
}

public class Main5 {
}

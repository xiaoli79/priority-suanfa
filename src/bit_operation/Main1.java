package bit_operation;




class Solution1 {

//    leetcode 191
    public int hammingWeight(int n) {

        int ret = 0;
        while(n != 0){
            // n & n - 1
            // 这里边的 n-1 将最右侧的1的右边区域（包含1），全部变成相反~~
            // 进行按位与就会全部变成新发~~
            n &= n-1;
            ret++;
        }

        return ret;
    }
}

public class Main1 {



}

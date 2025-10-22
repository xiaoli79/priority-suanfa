package bit_operation;


class Solution {

    public int getSum(int a, int b) {

        while(b != 0){
            // 无进制相加~~
            int x  = a ^ b;
            // 计算进位
            int carry = (a & b) << 1;


            // 赋值，为了下一步的操作~~
            a=x;
            b=carry;
        }

        return a ;
    }
}

public class Main8 {
}

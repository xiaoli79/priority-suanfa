package bit_operation;



class Solution3 {


    // 这道题就是直接按位异或即可~~
    public int hammingDistance(int x, int y) {
        int res =0 ;

        // 先按位异或,不相同的会变成1，然后再求里面1的个数即可~~
        int num = x ^ y;

        while(num != 0){
            num &= (num-1);
            res++;

        }
        return res;
    }
}


public class Main3 {

}

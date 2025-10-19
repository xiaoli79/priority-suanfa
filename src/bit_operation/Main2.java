package bit_operation;



class Solution2 {
    public int[] countBits(int n) {


        //比特位计算 ，leetcode 338

        int[] res = new int[n+1];
        for(int i = 0 ; i<= n ; i++){
            int sum = 0;
            int tmp = i;
            while(tmp != 0){
                tmp &= (tmp-1);
                sum++;
            }
            res[i] = sum;
        }
        return res;

    }
}

public class Main2 {
}

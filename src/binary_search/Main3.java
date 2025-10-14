package binary_search;



class Solution3 {



    // 只要满足二段性，就可以使用二分查找！！~~



    public int mySqrt(int x) {

        if(x < 1) return 0;

        long left =0 , right = x;
        while(left < right){
            long mid = left + (right - left) / 2;

            if(mid * mid  <= x){
                left = mid;
            }else{
                right = mid -1;
            }
        }

        return (int)left;

    }
}


public class Main3 {



}

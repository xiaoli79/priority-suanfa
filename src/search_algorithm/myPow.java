package search_algorithm;


// 使用递归来实现快速幂
//如果是2 ^ 5 ，那么快速幂就是 2^2 * 2^2 * 2
//如果是 2^ 6 ， 那么1快速幂就是 2 ^ 3 * 2 ^ 3
// 这就是快速幂的原理~~

class Solution2 {

    // 计算快速幂~~
    public double myPow(double x, int n) {
        return n < 0 ? 1 / pow(x,-n) : pow(x,n);

    }

    public double pow (double x ,int n ){
        if(n == 0) return 1.0;

        double res = pow(x , n / 2);

        return n % 2 == 0 ? res * res : res * res * x;
    }


}
public class myPow {

}

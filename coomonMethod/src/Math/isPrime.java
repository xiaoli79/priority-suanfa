package Math;


//判断一个数是否是素数~
public class isPrime {

    static boolean isPrime(int n){
//      判断一个数是否是素数
        if(n < 2){
            return false;
        }

        for (int i = 2; i * i<=n ; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPrime(51));


    }
}

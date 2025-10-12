package two_pointer_demo;


//快乐数
class Solution3 {
    public boolean isHappy(int n) {

        int sum = 0;
        while(sum != 1) {
            while (n != 0) {
                int tmp = n % 10;
                sum += tmp * tmp;
                n = n / 10;
            }
            n= sum;
            if(sum != 1){
                sum = 0;
            }
        }
        return sum == 1;
    }
}



public class Main3 {


    public static void main(String[] args) {


        Solution3 s = new Solution3();
        System.out.println(s.isHappy(19));

    }
}

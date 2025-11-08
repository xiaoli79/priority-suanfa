

//Java中进制转换常用方法
public class Main4 {


//  注意若是比赛数比较大的话~~要直接使用Long~~
    public static void main(String[] args) {
        //  任意进制(字符串) -> 10进制(整数)
        int n = Integer.parseInt("101010",2);
        System.out.println(n);

//      10进制(整数) -> 任意进制(字符串)
        String s = Integer.toString(255,16);
        System.out.println(s);

    }

}

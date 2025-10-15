package prefix_sum_algorithm;

import java.util.Scanner;

import java.util.Scanner;


//一维前缀和模板~~
public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),m=scanner.nextInt();

        int[] arr = new int[n+1];
        // 放置一个哨兵，来进行前缀和的维护~~
        long[] pre = new long[n+1];
        for(int i =1 ; i<= n;i++){
            arr[i] = scanner.nextInt();
            pre[i] += arr[i]+pre[i-1];
        }

        while(--m >=0){
            int begin = scanner.nextInt(),end =scanner.nextInt();

            long sum = pre[end] - pre[begin-1];

            System.out.println(sum);
        }
    }
}

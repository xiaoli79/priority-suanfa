import java.util.Arrays;


//自定义排序~~
public class Main3 {


    public static void main(String[] args) {

        Integer[] arr = {1,2,5,4,3};

        int[][] arr1 = new int[][]{{1,2},{3,2},{6,1}};



//      这是升序~~
        Arrays.sort(arr,(a,b)->arr[a]-arr[b]);

        Arrays.sort(arr,(a,b)->arr[b]-arr[a]);

//      这个是先判断第一个元素~~
        Arrays.sort(arr1,(int[] a,int[] b)->{
          if(a[0] != b[0]){
//            如果第一个元素不相同,就按照升序~~
              return a[0]-b[0];
//            如果就一个元素相同,就按照降序~~
          }else{
              return b[0]-a[0];
          }
        });

    }

}

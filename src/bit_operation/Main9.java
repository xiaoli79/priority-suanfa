package bit_operation;


import java.util.HashMap;
import java.util.Map;

class Solution9 {


    // 这个使用哈希表会浪费很大的空间~~~
    public int singleNumber1(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num = entry.getKey(),val =entry.getValue();
            if(val ==1){
                res = num;
            }

        }
        return res;


    }

    // 这个使用哈希表会浪费很大的空间~~~
    public int singleNumber(int[] nums) {
        int ret = 0;
        for(int i= 0 ; i< 32 ; i++){ // 依次修改ret 中的 每一个比特位~

            int sum = 0;
            for(int x : nums){ //统计nums中所有的数的第i位的和~
                if(((x >> i) & 1) == 1){
                    sum++;
                }
            }
            sum %= 3;  //统计那个单独的数是否出现~~
            if(sum == 1) ret |= 1 << i;
        }
        return ret;
    }
}
public class Main9 {



}

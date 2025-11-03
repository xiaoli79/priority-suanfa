package prefix_sum_algorithm;


import java.util.HashMap;
import java.util.Map;


//连续数组~~

class Solution5 {
    public int findMaxLength(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int sum =0 ,res = 0;
        for(int i = 0 ; i< nums.length ; i++){
            sum+=(nums[i]==0 ? -1 :1);
            if(map.containsKey(sum)) res = Math.max(res,i-map.get(sum));
            else map.put(sum,i);
        }
        return res;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        s.findMaxLength(new int[]{0,1,1,0,0});
    }
}

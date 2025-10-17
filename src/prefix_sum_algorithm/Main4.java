package prefix_sum_algorithm;
import java.util.HashMap;
import java.util.Map;


class Solution4 {
    public int subarraysDivByK(int[] nums, int k) {

//      同余定理  (sum - x ) % k = 0  => sum % k = x % k  根据这个定理就可以推出其值~~
//      (sum % k + k) % k 这个公式是为了预防 负数 % 正数，让 负数 % 正数 = 正数
//      在[0,i-1]区间内，找到有多少个前缀和的余数等于(sum % k + k) % k;
        Map<Integer,Integer> hash = new HashMap<>();

        hash.put(0 % k ,1);

        int sum = 0, ret = 0;

        for(int x : nums){
            sum+=x;
            int r = (sum % k + k) % k;
//          假设i是当前查询的位置，j <= i -1;
//          这里面是统计有多少个前缀和的余数也等于r
            ret += hash.getOrDefault(r,0);
//          把在i位置的前缀和放到hash表中，方便之后查询
            hash.put(r,hash.getOrDefault(r,0)+1);
        }
        return ret;
    }
}


public class Main4 {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        s.subarraysDivByK(new int[]{4,5,0,-2,-3,1}, 5);
    }
}

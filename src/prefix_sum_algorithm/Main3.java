package prefix_sum_algorithm;

import java.util.HashMap;
import java.util.Map;

class Solution3 {


//  这个算法的核心：以i位置为结尾的所有子数组
//  在[0,i-1]区间里，有多少个前缀和等于sum[i]-k

    public int subarraySum(int[] nums, int k){
        Map<Integer,Integer> hash = new HashMap<>();


        hash.put(0,1);
//
        int sum =0,ret =0;
        for(int x : nums){
            sum += x;
//          如果有sum[i] -k  就证明说有 k~~  所以该数+1
            ret += hash.getOrDefault(sum-k,0);
//          把所有sum[i]前缀和放入哈希表中，方便统计其出现的次数
            hash.put(sum,hash.getOrDefault(sum,0)+1);
        }
        return ret;
    }

}


//为什么是这个玩意~~

public class Main3 {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.subarraySum(new int[]{1,2,3}, 3));
    }
}

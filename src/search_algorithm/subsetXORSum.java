package search_algorithm;

import java.util.ArrayList;
import java.util.List;


//子集异或和~~
class Solution6{


    int res =0;
    List<Integer> path = new ArrayList<>();


    public int subsetXORSum(int[] nums) {
        dfs(nums,0);
        return res;
    }

    public void dfs(int[] nums,int i){

        // 递归出口~~
        if(i == nums.length){

            // 进行异或~~
            return;
        }
        path.add(nums[i]);
        dfs(nums,i+1);
        // 进行异或~~
        int tmp = 0;
        for(Integer x : path){
            tmp ^= x;
        }
        res += tmp;

        path.remove(path.size()-1);
        dfs(nums,i+1);
    }
}



public class subsetXORSum {
}

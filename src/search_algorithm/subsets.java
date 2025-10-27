package search_algorithm;


import java.util.ArrayList;
import java.util.List;



//找出子集~~
class Solution5 {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums,0);
        return res;
    }


    public void dfs(int[] nums,int i ){

        //递归出口~~~
        if(i == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }

        //该节点选还是不选~~
        // 选这个节点~~
        path.add(nums[i]);
        dfs(nums,i+1);
        path.remove(path.size()-1);
        // 不选这个节点~~
        dfs(nums,i+1);
    }
}
public class subsets {
}

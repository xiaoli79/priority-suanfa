package search_algorithm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//x
class Solution7 {

    List<List<Integer>> res = new ArrayList<>();

    List<Integer> path = new ArrayList<>();

    boolean[] check;

    public List<List<Integer>> permuteUnique(int[] nums) {

        check = new boolean[nums.length];
        Arrays.sort(nums);

        dfs(nums,0);
        return res;

    }

    public void dfs(int[] nums,int cnt){

        if(nums.length == cnt){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0 ;i < nums.length ; i++){

            // 这里是处理剪枝的逻辑~~ 避免重复元素对程序影响~~
            if(i > 0 && nums[i] == nums[i-1] && check[i-1] == false){
                continue;
            }

            if(check[i] == false){
                path.add(nums[i]);
                check[i] = true;
                dfs(nums,cnt+1);
                path.remove(path.size()-1);
                check[i] = false;
            }
        }
    }
}
public class permuteUnique {
}

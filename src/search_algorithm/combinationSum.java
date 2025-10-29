package search_algorithm;

import java.util.ArrayList;
import java.util.List;



//组合综合~~
class Solution13 {


    List<List<Integer>> res = new ArrayList<>();

    List<Integer> pathList = new ArrayList<>();

    int path;

    int target;

    public List<List<Integer>> combinationSum(int[] candidates, int _target) {
        target = _target;

        dfs(candidates,0);
        return res;
    }


    public void dfs(int[] candidates, int index){

        // 剪枝~~
        if (path > target) {
            return;
        }
        // 递归出口~~
        if(path == target){
            res.add(new ArrayList<>(pathList));
            return;
        }

        for(int i = index ; i < candidates.length; i++){

            path += candidates[i];
            pathList.add(candidates[i]);
            dfs(candidates,i);
            path -= candidates[i];
            pathList.remove(pathList.size() - 1);

        }

    }
}




public class combinationSum {
}

package search_algorithm;


import java.util.ArrayList;
import java.util.List;

class Solution10{

    List<List<Integer>> res  = new ArrayList<>();

    List<Integer> path = new ArrayList<>();

    int n;
    int k;

    public List<List<Integer>> combine(int _n, int _k) {
        n = _n;
        k = _k;

        dfs(1);

        return res;

    }

    public void dfs(int start){

        if(path.size() == k){
            res.add(new ArrayList<>(path));
        }


        for(int i = start; i<=n ;i++){
            path.add(i);
            dfs(i+1);
            path.remove(path.size() - 1);
        }

    }
}
public class combine {
}

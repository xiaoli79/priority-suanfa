package search_algorithm;
import java.util.ArrayList;
import java.util.List;

//全排列~~ 使用递归的~~~
class Solution3 {
    // 存储结果
    List<List<Integer>> ret;
    // 存储每个路径
    List<Integer> path;
    // 检查每个元素出现的~~
    boolean[] check;

    public List<List<Integer>> permute(int[] nums) {

        ret = new ArrayList<>();
        check = new boolean[nums.length];
        path = new ArrayList<>();

        dfs(nums);
        return ret;
    }
    public void dfs(int[] nums){

        if(nums.length == path.size()){

            // 不能直接这样写~~执行这下面代码存储的是引用，随着dfs的回溯，path中的内容也会消失
            // ret.add(path)
            // 使用这个就相当于创建了path的副本放在这里，不管以后path怎么回溯都不会影响这个副本~~
            //ret.add(new ArrayList<>(path));

            ret.add(new ArrayList<>(path));
            return ;
        }

        for(int i =0 ; i< nums.length ; i++){

            if(check[i] == false){

                path.add(nums[i]);
                check[i] = true;

                dfs(nums);
                // 回溯->恢复现场~~
                check[i] =false;
                path.remove(path.size() - 1);
            }
        }
    }
}
public class permute {


}

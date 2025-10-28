package search_algorithm;

//做全局变量


//使用索引来进行定位~~

class Solution12 {
    int res = 0;
    int sum = 0;

    public int findTargetSumWays(int[] nums, int target) {

        dfs(nums,0,target);

        return res;
    }

    public void dfs(int[] nums, int index , int target){
        if(index == nums.length){
            if(sum == target){
                res += 1;
            }
            return;
        }

        sum += nums[index];
        dfs(nums,index + 1, target);
        sum-=nums[index];
        sum -= nums[index];
        dfs(nums,index + 1, target);
        sum+= nums[index];
    }
}



//做函数参数~~
class Solution11 {

    int res = 0;
    int target;

    public int findTargetSumWays(int[] nums, int _target) {
        target = _target;
        dfs(nums,0,0);
        return res;
    }

    public void dfs(int[] nums, int index , int path){
        if(index == nums.length){
            if(path == target){
                res += 1;
            }
            return;
        }


        dfs(nums,index+1,path + nums[index]);
        dfs(nums,index+1,path - nums[index]);

    }
}
public class findTargetSumWays {



}

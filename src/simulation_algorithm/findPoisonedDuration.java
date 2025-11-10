package simulation_algorithm;

// 提莫攻击
class Solution2 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        // 记录中毒的总时间
        int res = 0;


        for(int i = 0 ; i< timeSeries.length - 1; i++){
            if(timeSeries[i+1] - timeSeries[i] >= duration){
                res += duration;
            }else{
                res+=timeSeries[i+1] - timeSeries[i];
            }
        }

        res+=duration;
        return res;
    }
}

public class findPoisonedDuration {
}

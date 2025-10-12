package sliding_window_algorithm;


import java.util.HashSet;

class Solution2 {
    public int lengthOfLongestSubstring(String ss) {
        // 将字符串转换你为字符数组
        char[] s = ss.toCharArray();

        // 用这个hash数组来统计元素出现的个数~~
        int[] hash = new int[128];
        int left =0,right=0;
        int ret = 0;
        // 使用滑动窗口来解决
        while(right <ss.length()){
            // 开始向右滑动
            hash[s[right]]++;
            // 如果已经有重复元素~~
            while(hash[s[right]] > 1){
                //从哈希表中删除元素，让窗口向左滑动~~
                //!!!!
                hash[s[left++]]--;
            }
            // 过程中更新其值
            ret =Math.max(ret,right-left+1);
            right++;
        }
        return ret;

    }
}

public class Main2 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
    }
}

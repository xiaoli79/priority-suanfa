package sliding_window_algorithm;

import java.util.HashSet;

import java.util.HashMap;
import java.util.Map;
//水果成篮！！
class Solution5 {
    public int totalFruit(int[] fruits) {
        if (fruits == null || fruits.length == 0) {
            return 0;
        }

        int maxFruits = 0;
        int left = 0;
        // Map: key 是水果类型, value 是该水果在窗口中的数量
        Map<Integer, Integer> basket = new HashMap<>();

        // right 指针负责扩大窗口
        for (int right = 0; right < fruits.length; right++) {
            // 1. 将右边的水果放入篮子
            int rightFruit = fruits[right];
            basket.put(rightFruit, basket.getOrDefault(rightFruit, 0) + 1);

            // 2. 检查篮子里的水果种类是否超过2种
            // 如果超过了，就需要从左边拿出水果，直到种类变回2种
            while (basket.size() > 2) {
                int leftFruit = fruits[left];
                // 从篮子中减少左边水果的数量
                basket.put(leftFruit, basket.get(leftFruit) - 1);

                // 如果该种水果的数量变为0，说明篮子里已经没有这种水果了，
                // 就从 map 中移除这个 key
                if (basket.get(leftFruit) == 0) {
                    basket.remove(leftFruit);
                }
                // 左指针右移，缩小窗口
                left++;
            }

            // 3. 更新最大水果数
            // 此时窗口 [left, right] 内的水果种类一定是 <= 2 的，是有效的
            // 所以用当前窗口的长度来更新最大值
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}

public class Main5 {


    public static void main(String[] args) {

        Solution5 solution = new Solution5();
        System.out.println(solution.totalFruit(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}));
    }
}

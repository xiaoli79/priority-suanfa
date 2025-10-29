package search_algorithm;

class Solution15 {

    int res = 0;
    // check 数组用于标记 "数字" 是否被使用过
    // check[i] = true 表示 "数字 i" 已经被放在了排列中
    boolean[] check;

    public int countArrangement(int n) {
        // n+1 的大小是为了方便 1-based 索引 (数字 1 到 n)
        check = new boolean[n + 1];

        // 我们从第 1 个 "位置" 开始尝试填充
        dfs(n, 1);
        return res;
    }

    public void dfs(int n, int index) {

        if (index > n) {
            // 找到了一个优美的排列
            res++;
            return;
        }
        
        for (int i = 1; i <= n; i++) {

            if (!check[i]) {

                if (i % index == 0 || index % i == 0) {

                    // --- 做出选择 ---
                    check[i] = true; // 标记 "数字 i" 已被使用

                    // 递归：去填充下一个 "位置" (index + 1)
                    dfs(n, index + 1);

                    check[i] = false;
                }
            }
        }
    }
}

public class countArrangement {
}

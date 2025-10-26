package search_algorithm;



//class Solution {
//
//    public int sumNumbers(TreeNode root) {
//        return dfs(root, 0);
//    }
//    public int dfs(TreeNode root , int preSum){
//
//        //第一步先求当前节点的和~~
//        preSum = preSum*10 + root.val;
//        // 递归出口~~
//        if(root.left == null && root.right == null) {
//            return preSum;
//        }
//        int ret = 0;
//        // 第二步求出左子树的和
//        if(root.left != null) ret += dfs(root.left,preSum);
//        // 第三步计算右子树的和
//        if(root.right != null) ret += dfs(root.right,preSum);
//        // 最后一步把左子树的和和右子树的和相加~~返回给上一层的节点~~
//        return ret;
//
//    }
//}


public class sumNumbers {
}

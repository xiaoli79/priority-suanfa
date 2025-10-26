package search_algorithm;




//验证二叉搜索树~~

//class Solution {
//
//    long prev = Long.MIN_VALUE;
//    public boolean isValidBST(TreeNode root) {
//
//        if(root == null) return true;
//        // 减枝的策略
//        boolean left = isValidBST(root.left);
//        if(left ==false) return false;
//
//        boolean cur = false;
//        if(root.val > prev) cur = true;
//        // 减枝的策略~~
//        if(cur == false ) return false;
//
//        prev = root.val;
//
//        boolean right = isValidBST(root.right);
//
//        return left && cur && right;
//    }
//
//}



public class isValidBST {
}

package search_algorithm;

//法一~~
//class Solution {
//
//    int[] arr = new int[10000];
//    int t = 0;
//
//    public int kthSmallest(TreeNode root, int k) {
//        dfs(root);
//        return arr[k-1];
//    }
//
//
//    public void dfs(TreeNode root){
//        if(root == null){
//            return ;
//        }
//        dfs(root.left);
//        arr[t++] = root.val;
//        dfs(root.right);
//    }
//}



//法二~~ 不需要借助额外的数组~~
//class Solution {
//
//    int t = 0;
//    int res = 0;
//
//
//    public int kthSmallest(TreeNode root, int k) {
//
//        t = k;
//        dfs(root);
//        return res;
//
//    }
//
//
//    public void dfs(TreeNode root){
//        if(root == null || t == 0){
//            return ;
//        }
//        dfs(root.left);
//        t--;
//        if(t == 0) res = root.val;
//        if(t == 0) return;
//        dfs(root.right);
//    }
//}



public class kthSmallest {
}

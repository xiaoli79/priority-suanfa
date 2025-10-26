package search_algorithm;



//class Solution {
//
//    ArrayList<String> ret = new ArrayList<>();
//
//    public List<String> binaryTreePaths(TreeNode root) {
//        dfs(root,new StringBuffer());
//        return ret;
//    }
//
//    public void dfs(TreeNode root,StringBuffer _path){
//
//        StringBuffer path = new StringBuffer(_path);
//
//        if( root == null ){
//            return;
//        }
//        if(root.left == null && root.right == null){
//
//            path.append(root.val);
//            ret.add(path.toString());
//        }else{
//            path.append(root.val+"->");
//        }
//
//        dfs(root.left,path);
//        dfs(root.right,path);
//    }
//}



public class binaryTreePaths {
}

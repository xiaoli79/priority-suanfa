package search_algorithm;




//注意oath的改变，如果path是引用变量~~，传入dfs中是全局变量~~注意恢复现场~~
//或者在dfs中重新引入改成局部变量~~



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

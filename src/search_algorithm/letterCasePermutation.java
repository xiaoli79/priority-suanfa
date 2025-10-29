package search_algorithm;


import java.util.ArrayList;
import java.util.List;

class Solution14 {

    List<String> res = new ArrayList<>();

    StringBuffer path;

    public List<String> letterCasePermutation(String s) {

        path = new StringBuffer();
        dfs(s,0);
        return res;

    }

    public void dfs(String s,int index){

        // 递归出口~~
        if(path.length() == s.length()){

            res.add(path.toString());
            return;
        }


//      判断字符是否是数字
        if(Character.isDigit(s.charAt(index))){
            path.append(s.charAt(index));
            dfs(s,index+1);
            path.deleteCharAt(path.length()-1);

//      这种情况就是字符了~~
        }else{

            path.append(Character.toLowerCase(s.charAt(index)));
            dfs(s,index+1);
            path.deleteCharAt(path.length()-1);

            path.append(Character.toUpperCase(s.charAt(index)));
            dfs(s,index+1);
            path.deleteCharAt(path.length()-1);

        }
    }
}



public class letterCasePermutation {


}

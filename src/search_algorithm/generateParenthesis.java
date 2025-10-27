package search_algorithm;

import java.util.ArrayList;
import java.util.List;

class Solution9 {

    public int left;
    public int right;
    public int n;


    public StringBuffer path = new StringBuffer();

    public List<String> res = new ArrayList<>();


    public List<String> generateParenthesis(int _n) {
        n = _n;
        dfs();
        return res;
    }

    public void dfs(){
        if(right >= n){
            res.add(path.toString());
            return;
        }
        // 添加左括号
        if(left < n){
            path.append("(");
            left++;
            dfs();
            // 回溯~~
            path.deleteCharAt(path.length()-1);
            left--;
        }

        // 当right< left 添加右括号~~
        if(right < left){
            path.append(")");
            right++;
            dfs();
            // 回溯~~
            path.deleteCharAt(path.length()-1);
            right--;
        }

    }

}





public class generateParenthesis {
}

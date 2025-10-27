package search_algorithm;


import java.util.ArrayList;
import java.util.List;


//电话号码的组合~~
class Solution8{
    String[] hash = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    List<String> res = new ArrayList<>();

    StringBuffer path = new StringBuffer();

    public List<String> letterCombinations(String digits) {

        if(digits.length() == 0){
            return res;
        }
        dfs(digits,0);

        return res;
    }

    public void dfs(String digits,int pos){

        // 递归出口~~
        if(pos == digits.length()){
            res.add(path.toString());
            return;
        }

        String cur = hash[digits.charAt(pos) - '0'];

        // 进行遍历~~
        for(int i =0 ; i< cur.length(); i++){
            path.append(cur.charAt(i));
            dfs(digits,pos+1);
            path.deleteCharAt(path.length()-1);
        }

    }
}



public class letterCombinations {
}

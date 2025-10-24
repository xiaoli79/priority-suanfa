package search_algorithm;


import java.util.List;

class Solution {


//  从宏观角度上看待问题~~
//  函数头的设计~~找到重复子问题~~ 将x柱子上的一堆盘子(n)，借助y柱子，转移到z柱子上面~~
    public void dfs(List<Integer> A, List<Integer> B,List<Integer> C, int n){
//      边界情况就是直接把A的盘子直接放到C上即可~~
        if(n == 1) {
            C.add(A.remove(A.size() - 1));
            return;
        }
//      函数体就是分析一个子问题的过程~~
//      把A的n-1的盘子借助C放到B上
        dfs(A,C,B,n-1);
        // 把A的最后一个放到C上
        C.add(A.remove(A.size()-1));
//      把B的盘子借助A放到C上~~
        dfs(B,A,C,n-1);

    }
    
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {

        int n = A.size();
        dfs(A,B,C,n);
    }
}
public class hanota {
}

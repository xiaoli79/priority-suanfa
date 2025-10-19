package bit_operation;





class Solution6 {
    public boolean isUnique(String astr) {

//      使用鸽巢原理进行优化~~
        if(astr.length() > 26) return false;

        int bitMap = 0;

        for(int i = 0 ; i  < astr.length();i++){
            int x = astr.charAt(i) - 'a';
            // 先判断字符是否存在位图中
            if(((bitMap >> x) & 1) == 1)  return false;

            // 把字符放入位图中 , 这个算法是把那个位置的值修改成1
            bitMap |= 1 << x;

        }
        return true;
    }


//  使用哈希表来进行统计~~
    public boolean isUnique1(String astr) {

        if(astr.length() > 26) return false;
        int[] hash = new int[26];

        for(int i = 0 ; i < astr.length();i++){
            hash[astr.charAt(i)-'a']++;

            if(hash[astr.charAt(i)-'a'] == 2){
                return false;

            }
        }
        return true;

    }
}

public class Main6 {



}

package sliding_window_algorithm;
import java.util.ArrayList;
import java.util.List;


//找到所有字符串中所有字母异位词！！  解法1
class Solution6 {
    public boolean isTrue(int[] hash1,int[] hash2,int left,int right,String ss){

        for(left = 0 ; left <= right ; left++){
            if(hash1[ss.charAt(left)] != hash2[ss.charAt(left)]){
                return false;
            }
        }
        return true;
    }

    public List<Integer> findAnagrams(String ss, String p) {

        List<Integer> ret = new ArrayList<>();
        int [] hash1 = new int[128];
        int [] hash2 = new int[128];

        for(int i = 0 ; i < p.length();i++){
            hash1[p.charAt(i)]++;
        }

        int left=0,right=0;
        while(right < ss.length()){

            hash2[ss.charAt(right)]++;
            if(right -left + 1 > p.length()){
                hash2[ss.charAt(left)]--;
                left++;
            }

            // 判断hash1和hash2是否相等！！
            if(right-left + 1 == p.length() &&  isTrue(hash1,hash2,left,right,ss)){
                ret.add(left);
            }

            right++;
        }
        return ret;
    }
}


//使用count来进行位置值，进而判断，进而减少了时间复杂度！！
class Solution66 {

    public List<Integer> findAnagrams(String ss, String p) {

        List<Integer> ret = new ArrayList<>();
        int [] hash1 = new int[128];
        int [] hash2 = new int[128];
        int count=0;

        for(int i = 0 ; i < p.length();i++){
            hash1[p.charAt(i)]++;
        }

        int left=0,right=0;
        while(right < ss.length()){
            hash2[ss.charAt(right)]++;
            // 进窗口
            if(hash2[ss.charAt(right)] <= hash1[ss.charAt(right)]) count++;


            // 出窗口
            if(right -left + 1 > p.length()){
                if(hash2[ss.charAt(left)] <= hash1[ss.charAt(left)]) count--;
                hash2[ss.charAt(left)]--;
                left++;
            }

            // 判断hash1和hash2是否相等！！
            if(right-left + 1 == p.length() &&  count == p.length() ){
                ret.add(left);
            }

            right++;
        }
        return ret;


    }
}



public class Main6 {




}

package sliding_window_algorithm;


import java.util.*;

class Solution7 {


    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> ret = new ArrayList<>();
        Map<String,Integer> map1 = new HashMap<>();

        for(String x : words){
            map1.put(x,map1.getOrDefault(x,0)+1);
        }

        int len = words[0].length();
        int total_len = words[0].length() * words.length;

        for(int i = 0 ; i< len ; i++){
            Map<String,Integer> map2 = new HashMap<>();
            int left =i,right=i;
            // 需要去维护count;
            int count = 0;
            while(right + len <= s.length()){
                //每回从中拿取len个字符
                String str =s.substring(right,right+len);
                map2.put(str,map2.getOrDefault(str,0)+1);
                //这个判断条件?
                if(map2.get(str) <= map1.getOrDefault(str,0)) count++;


                if(right-left + 1 >total_len){
                    String out = s.substring(left,left+len);
                    if(map2.get(out) <= map1.getOrDefault(out,0)) count--;
                    map2.put(out,map2.get(out)-1);
                    left+=len;
                }
                if(count == words.length){
                    ret.add(left);
                }
                right+=len;
            }

        }
        return ret;
    }


    public static void main(String[] args) {





    }

}


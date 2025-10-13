package sliding_window_algorithm;


class Solution8 {

    public String minWindow(String ss, String tt) {

        char[] s = ss.toCharArray();
        char[] t = tt.toCharArray();

        int[] hash1 = new int[128];
        int[] hash2 =  new int[128];

        int kinds = 0;

        for(char x : t){
            if(hash1[x]++ == 0){
                kinds++;
            }
        }
        int minlen =Integer.MAX_VALUE,begin =-1;
        for(int left =0,right =0,count =0 ; right < s.length;right++){

            char in = s[right];

            hash2[in]++;

            // 处理count;
            if(hash2[in] == hash1[in]){
                count++;
            }

            while(kinds ==count){
                // 更新结果
                // minlen = Math.min(minlen,right-left+1);
                // begin = left;

                if(right -left +1 <minlen){
                    begin = left;
                    minlen =right -left + 1;
                }

                // 出窗口
                int out = s[left++];
                if(hash2[out]-- == hash1[out]) count--;
            }
        }

        // 处理结果
        if(begin == -1) return "";
        else return ss.substring(begin,begin+minlen);
    }
}






public class Main8 {
}

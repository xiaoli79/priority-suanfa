package String_algorithm;

// 最长公共前缀~~
//思路就是以某个元素为基准，剩下的依次比较即可~~
class Solution {

//  同时比较
    public String longestCommonPrefix1(String[] strs) {

        for(int i = 0 ; i< strs[0].length() ; i++){
            char tmp = strs[0].charAt(i);


            for(int j  = 1 ; j < strs.length ; j++){
                if(strs[j].length() == i || tmp != strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];

    }

//   先拿第一个字符串，把这个字符串直接当成最长公共前缀，然后依次往后比较即可~~ 直到比较完即可~
    public String longestCommonPrefix2(String[] strs) {
        String res = strs[0];

        for(int i = 1 ; i< strs.length ; i++){
            res = findCommon(strs[i],res);
        }

        return res;
    }

    public String findCommon(String s1,String s2){
        int i = 0;

//      这是防止越界的~~
        while(i < Math.min(s1.length(),s2.length()) && s1.charAt(i) == s2.charAt(i)){
            i++;
        }
        return s1.substring(0,i);

    }
}
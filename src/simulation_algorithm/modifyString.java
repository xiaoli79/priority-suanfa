package simulation_algorithm;



//替换所有有？号的字符~~
// 注意仔细读题，这道题要求是不能有连续的重复字符！！！
class Solution {
    public String modifyString(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == '?') {

                for (char ch = 'a'; ch <= 'c'; ch++) {


                    boolean leftOk = (i == 0) || (arr[i - 1] != ch);


                    boolean rightOk = (i == n - 1) || (arr[i + 1] != ch);

                    if (leftOk && rightOk) {
                        arr[i] = ch;

                        break;
                    }
                }
            }
        }

        // 使用正确的
        return new String(arr);
    }
}
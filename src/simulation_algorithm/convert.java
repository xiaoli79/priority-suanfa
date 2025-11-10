package simulation_algorithm;

class Solution3 {

    // 这道题就是找规律~~！！
    // 模拟题优化的思路~~ 就是找规律~~
    // 这是一个字符串~~
    public String convert(String s, int numRows) {
        int d = 2 * numRows - 2;
        int n = s.length();

        StringBuffer sb = new StringBuffer();
        if(numRows == 1) return s;

        // 遍历行数~~
        // 处理第一行
        for(int i = 0 ;  i < n ; i+= d){
            sb.append(s.charAt(i));
        }


        // 处理中间行
        for(int k = 1 ; k< numRows - 1 ; k++){
            for(int i = k , j = d - i; i < n || j < n ; i+=d ,j +=d){
                if(i < n){
                    sb.append(s.charAt(i));
                }
                if(j < n){
                    sb.append(s.charAt(j));
                }
            }
        }


        // 处理最后一行
        for(int i = numRows - 1 ; i< n ; i+=d){
            sb.append(s.charAt(i));
        }
        return sb.toString();



    }
}
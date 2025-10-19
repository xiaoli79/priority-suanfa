package bit_operation;

public class Demo1 {

//  进制转换~~
    public static void main(String[] args) {


//        任意进制转十进制，是字符串转整形~~

        // 1. 二进制 (Binary) -> 十进制 (Decimal)
        String binaryString = "10110";
        int decimalFromBinary = Integer.parseInt(binaryString, 2);
        System.out.println(binaryString + " (二进制) = " + decimalFromBinary + " (十进制)"); // 输出: 22

        // 2. 八进制 (Octal) -> 十进制 (Decimal)
        String octalString = "37";
        int decimalFromOctal = Integer.parseInt(octalString, 8);
        System.out.println(octalString + " (八进制) = " + decimalFromOctal + " (十进制)"); // 输出: 31

        // 3. 十六进制 (Hex) -> 十进制 (Decimal)
        String hexString = "1A"; // 十六进制不区分大小写
        int decimalFromHex = Integer.parseInt(hexString, 16);
        System.out.println(hexString + " (十六进制) = " + decimalFromHex + " (十进制)"); // 输出: 26

        // 4. 任意进制 (例如 5 进制) -> 十进制 (Decimal)
        String base5String = "43";
        int decimalFromBase5 = Integer.parseInt(base5String, 5);
        System.out.println(base5String + " (五进制) = " + decimalFromBase5 + " (十进制)"); // 输出: 23

        // 5. 处理大数字 (使用 Long)
        String largeBinary = "100000000000000000000000000000000"; // 33 位的 1
        long longFromBinary = Long.parseLong(largeBinary, 2);
        System.out.println("大二进制数 = " + longFromBinary); // 输出: 429496729



        int decimalNumber = 42;

//       十进制转其他进制，是整形转字符串类型~

        // 1. 十进制 (Decimal) -> 二进制 (Binary)
        String binaryString1 = Integer.toBinaryString(decimalNumber);
        System.out.println(decimalNumber + " (十进制) = " + binaryString + " (二进制)"); // 输出: 101010

        // 2. 十进制 (Decimal) -> 八进制 (Octal)
        String octalString1 = Integer.toOctalString(decimalNumber);
        System.out.println(decimalNumber + " (十进制) = " + octalString + " (八进制)"); // 输出: 52

        // 3. 十进制 (Decimal) -> 十六进制 (Hex)
        String hexString1 = Integer.toHexString(decimalNumber);
        System.out.println(decimalNumber + " (十进制) = " + hexString + " (十六进制)"); // 输出: 2a

        // 4. 十进制 (Decimal) -> 任意进制 (例如 7 进制)
        //    这里使用通用方法
        int numForBase7 = 100;
        String base7String = Integer.toString(numForBase7, 7);
        System.out.println(numForBase7 + " (十进制) = " + base7String + " (七进制)");

    }
}

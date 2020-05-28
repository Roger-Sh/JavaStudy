package helloworld;

/*
分割字符串
public String[] split(String regex);    // 按照参数规则将字符串分割为若干部分

notice:
1 split 方法参数为正则表达式
2 正则表达式中"\\."来表示"."
 */

import java.util.Scanner;

public class Demo19_StringSplit {
    public static void main(String[] args) {
        // str.split(regex)
        String str1 = "aaa, bbb, ccc";
        String[] strArray1 = str1.split(", ");
        for (int i = 0; i < strArray1.length; i++) {
            System.out.println(strArray1[i]);
        }
        System.out.println("=================");

        // '.' 无法作为分割符号, 要使用"\\."
        String str2 = "xxx.yyy.zzz";
        String[] strArray2 = str2.split(".");
        System.out.println(strArray2.length);   // 0
        String[] strArray3 = str2.split("\\.");
        System.out.println(strArray3.length);   // 3
        for (int i = 0; i < strArray3.length; i++) {
            System.out.println(strArray3[i]);
        }
        System.out.println("=================");

        // excise: 将数组（1，2，3）按照指定格式拼接成一个字符串，格式[word1#word2#word3]
        int[] arrayInt = {1, 2, 3, 4, 5};
        String str3 = formatStr(arrayInt);
        System.out.println(str3);
        System.out.println("=================");

        /*  excise: 键盘输入字符串，统计各个字符出现的次数，
            大写字母，小写字母，数字，其他
            思路：
            1. Scanner
            2. String str = sc.next()
            3. 4 variable to count 4 type character
            4. String --> char[], toCharArray()
            5. iterate char[], determine the type of the character
            6. count++
            7. print count for 4 type of character
         */
        countCharFromKeyboard();
    }

    // excise: 将数组（1，2，3）按照指定格式拼接成一个字符串，格式[word1#word2#word3]
    public static String formatStr(int[] array) {
        String str = "[";

        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                str = str + array[i] + "#";
            } else {
                str = str + array[i] + "]";
            }
        }

        return str;
    }

    // excise:键盘输入字符串，统计各个字符出现的次数，
    public static void countCharFromKeyboard() {
        // get string from keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = sc.next();

        // init count
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        // convert string to charArray
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                countLower++;
            } else if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                countUpper++;
            } else if (charArray[i] >= '0' && charArray[i] <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }

        // print result
        System.out.println("Lowercase letter: " + countLower);
        System.out.println("Uppercase letter: " + countUpper);
        System.out.println("Nummer character: " + countNumber);
        System.out.println("Other character: " + countOther);
    }
}

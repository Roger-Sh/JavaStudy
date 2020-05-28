package helloworld;

/*
分割字符串
public String[] split(String regex);    // 按照参数规则将字符串分割为若干部分

notice:
1 split 方法参数为正则表达式
2 正则表达式中"\\."来表示"."
 */

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

        // excise
        int[] arrayInt = {1, 2, 3};
        String str3 = formatStr(arrayInt);
        System.out.println(str3);
        System.out.println("=================");
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
}

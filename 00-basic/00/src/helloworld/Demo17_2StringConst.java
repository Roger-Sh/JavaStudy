package helloworld;

/*
字符串常量池，程序中直接写上双引号的字符串，就在常量池中。

对于基本类型来说，== 是进行数值比较
对于引用类型来说，== 是进行地址比较

 */

public class Demo17_2StringConst {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);   // true，  str1 与 str2 的地址值相同
        System.out.println(str1 == str3);   // false， str1 与 str3 地址值不同
        System.out.println(str2 == str3);   // false， str2 与 str3 地址值不同
    }
}

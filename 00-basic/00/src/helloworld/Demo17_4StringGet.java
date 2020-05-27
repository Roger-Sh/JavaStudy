package helloworld;

/*
String 中与获取相关的常用方法

public int length()                 // 获取字符串的字符个数，字符串长度
public String concat(String str)    // 将当前字符串与参数字符串拼接成返回值的新字符串
public char charAt(int index)       // 获取指定索引位置的单个字符，从0开始
public int indexOf(String str)      // 查找参数字符串在本字符串中首次出现的索引位置，如果没有返回-1
 */

public class Demo17_4StringGet {
    public static void main(String[] args) {
        // get length
        int length = "asdlkjhalkjhfalsjkf".length();
        System.out.println("\"asdlkjhalkjhfalsjkf\"的长度是 " + length);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);   // Hello        不变
        System.out.println(str2);   // World        不变
        System.out.println(str3);   // HelloWorld   拼接成的新字符串
        System.out.println("================");

        // 获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("一号索引位置的字符是：" + ch);
        System.out.println("================");

        // 查找参数字符串在本来字符串中第一次出现的索引位置
        // 如果没有，返回-1
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("\"llo\"第一次出现的索引值：" + index);      // 2

        System.out.println("\"abc\"第一次出现的索引值：" + original.indexOf("abc"));            // -1
    }

}

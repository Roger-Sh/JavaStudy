package basic_03_string;

/*
java.lang.String类代表字符串
API中，JAVA所有的字符串字面值如“abc”都作为此类的实例实现，就算没有new，也是String的实例

String：
1. 字符串的内容永不可变，为常量，不能更改
2. 正因为字符串不可改变，所以字符串可以共享
3. 字符串效果相当于char[] 字符数组， 底层是byte[]字节数组

创建字符串的3+1种方式
三种构造方法：
    1. public String();                 // 创建一个空白字符串，不含有任何内容
    2. public String(char[] array);     // 根据字符数组的内容创建对应字符串
    3. public String(byte[] array);     // 根据字节数组的内容创建对应字符串
 */


public class Demo17_1String {
    public static void main(String[] args) {
        // 使用空参构造
        String str1 = new String();             // 空字符串
        System.out.println("Str1: " + str1);    // Str1: , null, 什么都没有

        // 根据字符数组创建对应字符串
        char[] charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);
        System.out.println("Str2: " + str2);    // Str2: abc

        // 根据字节数组创建字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("Str3: " + str3);    // Str3: abc

        // 直接创建
        String str4 = "Hello";
        System.out.println("Str4: " + str4);    // Str4: Hello
    }
}

package helloworld;

/*
字符串常量池，程序中直接写上双引号的字符串，就在常量池中。

对于基本类型来说，== 是进行数值比较
对于引用类型来说，== 是进行地址比较

字符串常量池
1 字符串常量池存在于堆HEAP中
2 使用常量字符串创建字符串对象时，首先在heap中创建对应 byte[] 字节数组，然后在字符串常量池中创建字符串对象，保存字节数组的地址值，
  当栈中的指令通过常量字符串创建字符串对象时，就将字符串常量池中的字符串对象保存的地址赋值给栈中新建的字符串对象，
  同样的常量字符串赋值给不同的字符串时，由于常量字符串的地址值不变，所以不同字符串保存的地址值也相同
3 使用char[] 创建字符串对象时，首先在heap中创建char[]，然后将其转换为byte[]，最后将byte[]的地址值赋值给heap中的字符串对象，
  最后传给栈中的字符串对象

 */

public class Demo17_2StringConstPool {
    public static void main(String[] args) {

        // 通过字符串常量创建字符串， 字符串常量相同，字符串保存的地址值也相同
        String str1 = "abc";
        String str2 = "abc";

        // 通过char[]创建字符串, 就算内容相同，但地址值不同，因为charArray并没有常量池
        char[] charArray1 = {'a', 'b', 'c'};
        String str3 = new String(charArray1);
        char[] charArray2 = {'a', 'b', 'c'};
        String str4 = new String(charArray2);

        // 字符串常量池中，只要有一个字符不一样，也是两个不同的字符串常量，地址值不同
        String str5 = "abcd";


        System.out.println(str1 == str2);   // true，  str1 与 str2 的地址值相同
        System.out.println(str1 == str3);   // false， str1 与 str3 地址值不同
        System.out.println(str2 == str3);   // false， str2 与 str3 地址值不同
        System.out.println(str3 == str4);   // false， str3 与 str4 地址值不同
        System.out.println(str1 == str5);   // false， str3 与 str4 地址值不同

    }
}

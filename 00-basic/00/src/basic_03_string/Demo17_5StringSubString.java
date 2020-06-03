package basic_03_string;

/*
字符串截取方法：
1. public String substring(int index);          // 截取从参数位置一直到字符串末尾，返回新字符串
2. public String subString(int begin, int end)  // 截取从begin到end， [begin, end)
 */

public class Demo17_5StringSubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);   // HelloWorld
        System.out.println(str2);   // World
        System.out.println("==============");

        String str3 = str1.substring(4, 7);
        System.out.println(str3);   //oWo
        System.out.println("==============");

        // 下面写法，字符串内容仍然没有改变
        String strA = "Hello";
        System.out.println(strA);   // Hello
        strA = "Java";              // 改变了地址，并非改变内容
        System.out.println(strA);   // Java

    }
}

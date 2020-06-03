package basic_03_string;

/*
字符串比较
1. == 进行字符串地址值的比较
2. String 成员方法 String.equals()
3. String 成员方法 String.equalsIgnoreCase(String str), 忽略大小写进行内容比较

public boolean equals(Object obj)
1. 参数可以是任何对象，任何对象都可以用Object 进行接受
2. 只有参数是一个字符串并且内容相同的时候才会给true，否则返回false
3. equals 具有对称性，a.equals(b) 和 b.equals(a) 具有相同效果
4. 如果比较双方一个常量一个变量，推荐把常量字符串写在前面
   推荐："abc".equals(str), 不推荐：str.equals("abc"), 当str为null时，第二种方法会造成空指针错误，无法使用成员方法

public boolean equalsIgnoreCase(Object obj)
1. 忽略大小写
2. 只忽略英文大小写

 */

public class Demo17_3StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        String str4 = "hello";

        System.out.println(str1.equals(str2));      // true
        System.out.println(str1.equals(str3));      // true
        System.out.println(str1.equals("Hello"));   // true
        System.out.println("Hello".equals(str1));   // true
        System.out.println(str1.equals(str4));      // false
        System.out.println("===============");      // false

        String str5 = null;
        System.out.println("abc".equals(str5));     // 推荐
        // System.out.println(str5.equals("abc"));  // 不推荐， 如果str5为null, 会报错，出现空指针异常 NullPointerException
        System.out.println("===============");      // false

        String strA = "Java";
        String strB = "java";

        System.out.println(strA.equals(strB));              // false
        System.out.println(strA.equalsIgnoreCase(strB));    // true
    }
}

package basic_03_string;

/*
字符串转换的常用方法

public char[] toCharArray();    // 将当前字符串转换为字符数组
public byte[] getBytes();       // 获得当前字符串的字节数组
public String replace(CharSequence oldString, CharSequence newString)
                                // 将当前字符串中的部分旧字符串替换为新字符串, charSequence 可以接受字符或字符串

 */


public class Demo17_6StringConvert {
    public static void main(String[] args) {
        // convert to charArray
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);           // H
        System.out.println(chars.length);       // 5
        System.out.println("===============");

        // convert to byteArray
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);       // 97 98 99
        }
        System.out.println("===============");

        // replace
        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("===============");

        String str3 = "What the **** **** ****";
        String str4 = str3.replace("****", "fuck");
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("===============");


    }
}

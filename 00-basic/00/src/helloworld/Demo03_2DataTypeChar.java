package helloworld;

/*
ASCII:      American Standard Code for Information Interchange
Unicode:    0-127 is same as ASCII, later has other language character, even emoji

48 - '0'
65 - 'A'
97 - 'a'

 */

public class Demo03_2DataTypeChar {
    public static void main(String[] args) {
        char zifu1 = '1';
        System.out.println(zifu1 + 0);  // 48 + 1 = 49

        char zifu2 = 'A';               // A = ASCII 65

        char zifu3 = 'c';
        int num = zifu3;
        System.out.println(num);        //99

        char zifu4 = '中';
        System.out.println((int) zifu4); // 20013
    }
}

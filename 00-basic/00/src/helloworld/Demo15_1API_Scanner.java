package helloworld;

/*
API:    Application Programming Interface
    1. 导包
        import packageName.className;
        // 如果在同一个包内，可省略导包语句
        // java.lang 下的内容不需要导包，其他包需要import
    2. 创建
        className instance = new className(args);
    3. 使用
        instance.methodName(args);

Class Scanner: 实现键盘输入数据
    1. 导包
        import java.util;
    2. 创建
        Scanner sc = new Scanner(System.in);
    3. 使用
        int num = sc.nextInt();     // get int from keyboard
        String str = sc.next();     // get string from keyboard

 */

import java.util.Scanner;                       // 1. import

public class Demo15_1API_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 2. new Scanner();

        System.out.println("Please enter an integer: ");
        int num = sc.nextInt();                 // 3. use: get int from KB
        System.out.println("Please enter a string: ");
        String str = sc.next();                 //    use: get string from KB

        System.out.println("Get int from KB: " + num);
        System.out.println("Get string from KB: " + str);
        System.out.println("======================");


    }

}

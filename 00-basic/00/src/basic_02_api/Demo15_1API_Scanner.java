package basic_02_api;

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

        /*
                example for scanner
         */

        Scanner sc = new Scanner(System.in);    // 2. new Scanner();

        System.out.println("Please enter an integer: ");
        int num = sc.nextInt();                 // 3. use: get int from KB
        System.out.println("Please enter a string: ");
        String str = sc.next();                 //    use: get string from KB

        System.out.println("Get int from KB: " + num);
        System.out.println("Get string from KB: " + str);
        System.out.println("======================");

        /*
                build a class Sum(), using Scanner to get numbers
         */

        Sum sum1 = new Sum();
        System.out.println(sum1.getA() + " + " + sum1.getB() + " = " + sum1.sum());
        System.out.println("======================");

        Sum sum2 = new Sum(5, 6);
        System.out.println(sum2.getA() + " + " + sum2.getB() + " = " + sum2.sum());
        System.out.println("======================");

    }

}

/*
use Scanner to get 2 numbers from kb, then summarize them
 */

class Sum {

    /*
            member variable
     */

    private double a;
    private double b;

    /*
            constructor
     */

    public Sum() {
        System.out.println("Please enter A: ");
        Scanner sc1 = new Scanner(System.in);
        this.a = sc1.nextInt();

        System.out.println("Please enter B: ");
        Scanner sc2 = new Scanner(System.in);
        this.b = sc2.nextInt();
    }

    public Sum(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /*
            getter and setter
     */

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    /*
            member method
     */

    // summarize two numbers
    public double sum() {
        return this.a + this.b;
    }
}
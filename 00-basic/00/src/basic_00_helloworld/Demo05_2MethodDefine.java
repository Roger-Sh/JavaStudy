package basic_00_helloworld;

/*
    1. method call:
        1. 单独调用
        2. 打印调用
        3. 赋值调用

    2. method with/without args

    3. method with/without return
 */

public class Demo05_2MethodDefine {
    public static void main(String[] args) {
        sum(10, 5);                         // call method along

        System.out.println(sum(10, 5));     // call with print

            int result = sum(10, 15);       // call with valuation
        System.out.println(result);

        /*
        example, determine if two numbers are equivalent
         */
        System.out.println(isEqui(10, 10)); // true

        /*
        example, print hello world with certain number
         */
        printHelloWorld(10);
    }

    public static int sum(int a, int b) {
        System.out.println("sum() was called");
        int result = a + b;
        return result;
    }

    public static boolean isEqui(int a, int b) {
        return a == b;
    }

    public static void printHelloWorld(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("Hello world! x" + (i+1));
        }
    }


}

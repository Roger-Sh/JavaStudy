package basic_00_helloworld;

public class Demo10OverloadExample {
    public static void main(String[] args) {
        byte num1 = 5;
        System.out.println(num1);
        short num2 = 5;
        System.out.println(num2);
        int num3 = 5;
        System.out.println(num3);
        long num4 = 5;
        System.out.println(num4);
        float num5 = 5;
        System.out.println(num5);
        double num6 = 5;
        System.out.println(num6);
    }

    public static void myPrint(byte x){
        System.out.println(x);
    }

    public static void myPrint(short x) {
        System.out.println(x);
    }

    public static void myPrint(int x) {
        System.out.println(x);
    }

    public static void myPrint(long x) {
        System.out.println(x);
    }

    public static void myPrint(float x) {
        System.out.println(x);
    }

    public static void myPrint(double x) {
        System.out.println(x);
    }

}
package helloworld;

/*
    basic data type:
        byte short int long
        float, double
        char
        boolean

    refer data type:
        string, array, class, api(plug?), lambda
 */

/*
    1. var name can't be same in a define area
    2. float 1.2F, long 300000000L
    3. data can't be large than the range of its datatype
    4. var without valuation can't be used
    5. define area is within the area defined with {}

 */

public class Demo02Variable {
    public static void main(String[] args) {
        // int
        int num1 = 10;
        System.out.println(num1);

        // re-valuation 重新赋值
        num1 = 20;
        System.out.println(num1);

        // byte
        byte num2 = 30;
        System.out.println(num2);
        //num2 = 400; 400 too large for num2

        // short
        short num3 = 50;
        System.out.println(num3);

        // long
        long num4 = 3000000000L;
        System.out.println(num4);

        // float
        float num5 = 2.5F;
        System.out.println(num5);

        // double
        double num6 = 1.2;
        System.out.println(num6);

        // char
        char char1 = 'A';
        System.out.println(char1);
        char1 = '中';                //chinese char is okay
        System.out.println(char1);

        // boolean
        boolean var1 = true;
        System.out.println(var1);
        var1 = false;
        System.out.println(var1);
        boolean var2 = var1;
        System.out.println(var2);
    }
}

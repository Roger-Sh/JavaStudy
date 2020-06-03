package basic_00_helloworld;

/*
    data type convert notice:
        1. force data type should be carefully because of the Loss of accuracy
        2. byte, short, char can be calculated
        3. byte, short, char will be converted to int during the calculation
        4. boolean can not be converted to other data type
 */

public class Demo03_1DataTypeConvert {
    public static void main(String[] args) {
        /*
        auto data type convert
         */

        // 100 should be 100L, here the datatype will be converted automatically
        // data type convert, left range should bigger than right
        long num1 = 100;    // 100 --> long
        System.out.println(num1);

        // float --> double
        double num2 = 2.5F;
        System.out.println(num2);

        // long --> float
        float num3 = 30L;
        System.out.println(num3); // 30.0

        /*
        force data type convert
        not recommend, should be carefully
         */

        // int num4 = 100L              // error, right range larger than left
        int num4 = (int) 100L;
        System.out.println(num4);

        int num5 = (int) 6000000000L;
        System.out.println(num5);       // 1705032704

        int num6 = (int) 3.5;
        System.out.println(num6);       // 3

        /*
            convert during calculation
         */

        // char with calculation
        char char1 = 'A';               // A ascii 65
        System.out.println(char1 + 1);  // char --> int 65 + 1 = 66

        // byte with calculation
        byte num7 = 40;
        byte num8 = 50;
        // byte result1 = num7 + num8;  // wrong, result is int because of the calculation
        int result1 = num7 + num8;
        System.out.println(result1);    // 90

        // short with calculation
        short num9 = 50;
        short num10 = 60;
        short result2 = (short) (num9 + num10);   // short + short = int + int
        System.out.println(result2);


    }
}

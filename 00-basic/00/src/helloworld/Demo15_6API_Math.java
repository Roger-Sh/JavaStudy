package helloworld;

/*
java.lang.Math

public static double abs(double num);   // get absolute double number
public static double ceil(double num);  // get ceiling number, 向上取整
public static double floor(double num); // get floor number, 向下取整
public static double round(double num); // get round number
Math.pi
 */

public class Demo15_6API_Math {
    public static void main(String[] args) {
        // Math.abs()
        System.out.println(Math.abs(-3.14));    // 3.14

        // Math.celing()
        System.out.println(Math.ceil(3.7));     // 4
        System.out.println(Math.ceil(3.3));     // 4
        System.out.println(Math.ceil(-5.8));    // -5
        System.out.println(Math.ceil(-5.2));    // -5

        // Math.floor()
        System.out.println(Math.floor(3.7));    // 3
        System.out.println(Math.floor(3.1));    // 3
        System.out.println(Math.floor(-7.7));   // -8
        System.out.println(Math.floor(-7.3));   // -8

        // Math.round()
        System.out.println(Math.round(3.9));    // 4
        System.out.println(Math.round(3.2));    // 3
        System.out.println(Math.round(-3.8));   // -4
        System.out.println(Math.round(-3.2));   // -3


        // Math.PI
        System.out.println(Math.PI);

        /*
                excise: 计算 -10.8 到 5.9 之间， 绝对值大于6或小于2.1的整数有多少个?
         */

        int count = countIntBetween(-10.8, 5.9, 6, 2.1);
        System.out.println("-10.8 到 5.9 之间， 绝对值大于6或小于2.1的整数有多少个? " + count);

    }

    public static int countIntBetween(double lowLimit, double highLimit, double absLowLimit, double absHighLimit) {
        if (lowLimit > 0) {
            lowLimit = Math.ceil(lowLimit);
            highLimit = Math.floor((highLimit));
        } else if (highLimit < 0) {
            lowLimit = Math.ceil(lowLimit);
            highLimit = Math.floor(highLimit);
        } else {
            lowLimit = Math.ceil(lowLimit);
            highLimit = Math.floor(highLimit);
        }

        int count = 0;

        for (int i = (int) lowLimit; i <= (int) highLimit; i++) {
            if (Math.abs(i) > absLowLimit || Math.abs(i) < absHighLimit) {
                System.out.println(i);
                count++;
            }
        }

        return count;
    }
}

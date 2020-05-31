package helloworld;

/*
java.lang.Math

public static double abs(double num);   // get absolute double number
public static double ceil(double num);  // get ceiling number, 向上取整
public static double floor(double num); // get floor number, 向下取整
public static double round(double num); // get round number
 */

public class Demo20_API_Math {
    public static void main(String[] args) {
        // Math.abs()
        System.out.println(Math.abs(-3.14));    // 3.14

        // Math.celing()
        System.out.println(Math.ceil(3.7));     // 4
        System.out.println(Math.ceil(3.3));     // 4

        // Math.floor()
        System.out.println(Math.floor(3.7));    // 3
        System.out.println(Math.floor(3.1));    // 3

        // Math.round()
        System.out.println(Math.round(3.9));    // 4
        System.out.println(Math.round(3.2));    // 3
    }
}

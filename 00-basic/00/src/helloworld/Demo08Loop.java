package helloworld;

/*
    Loop has 4 parts
    1. init statement
    2. determine statement
    3. loop body
    4. step statement
 */

public class Demo08Loop {
    public static void main(String[] args) {

        // for
        for (int i = 1; i <= 100; i++) {
            System.out.println("My fault!" + i);
        }
        System.out.println("for end");

        // while
        int a = 1;
        while (a <= 100) {
            System.out.println("a = " + a);
            a++;
        }
        System.out.println("while end");

        // do while
        int b = 1;
        do {
            System.out.println("b = " + b);
            b++;
        } while (b < 10);

        /*
        Example of even number from 1-100
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum: " + sum);

        // break, continue
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println("Hello " + i);

            if (i == 8) {
                break;
            }
        }

        // example loop hour and minute
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.println(hour + "点" + minute + "分");
            }
        }

        printMethod();
    }

    public static void printMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}


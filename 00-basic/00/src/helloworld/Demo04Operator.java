package helloworld;

/*
Operator: +, -, *, /, %, ++, --
 */

/*
basic valuation:
    int a = 1;
combined valuation:
    +=,-+,*=,/+,%=
 */

/*
comparison: >, <, ==, >=, <=, !=
 */

/*
logic operation:
    and:    &&
    or:     ||
    not:    !
 */

public class Demo04Operator {
    public static void main(String[] args) {
        /*
        plus with string
         */

        String str1 = "Hello";
        System.out.println(str1);               //Hello
        // + combine this two string
        System.out.println("Hello" + "World");    //HelloWorld

        String str2 = "Java";
        // String + int --> string
        System.out.println(str2 + 20);          // Java20
        System.out.println(str2 + (20 + 50));     // Java50

        /*
        ++, --
         */

        // use ++ along
        int num1 = 10;
        ++num1;
        System.out.println(num1);   //11
        num1++;
        System.out.println(num1);   //12

        // use ++ with other operation
        int num2 = 20;
        System.out.println(++num2); //21
        System.out.println(num2++); //21

        int num3 = 30;
        System.out.println(num3++); //30
        System.out.println(num3);   //31

        /*
        valuation
         */

        int a = 10;
        // a = a + 5;
        a += 5;
        System.out.println(a);  //  15

        int b = 10;
        b %= 3;
        System.out.println(b);  //  1

        /*
        determine operation
         */
        a = 3;
        b = 4;
        int result = a > b ? a : b;
        System.out.println(result); // 4
    }
}

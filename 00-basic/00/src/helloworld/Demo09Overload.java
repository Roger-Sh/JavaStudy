package helloworld;

/*
For methods with similar function, it's too nasty to write
different name of the methods just because of the different args
in order to use the same method name with different args, use overload
 */

/*
    Different arg lists:
        1. different number of arg
        2. different type of arg
        3. modifier （修饰符）different is ok
 */

public class Demo09Overload {
    public static void main(String[] args) {
        // different number of args
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));

        // different type of args
        System.out.println(sum(10, 20.0));
        System.out.println(sum(10.0, 20));
    }

    /*
        different number of args
     */
    public static int sum(int a, int b){
        System.out.println("This method has 2 args");
        return a + b;
    }

    public static int sum(int a, int b, int c){
        System.out.println("This method has 3 args");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        System.out.println("This method has 4 args");
        return a + b + c + d;
    }

    /*
        different type of args
     */

    public static int sum(int a, double b){
        System.out.println("This method has arg: int, double");
        return (int)(a+b);
    }

    public static int sum(double a, int b){
        System.out.println("This method has args: double, int");
        return (int)(a+b);
    }
}

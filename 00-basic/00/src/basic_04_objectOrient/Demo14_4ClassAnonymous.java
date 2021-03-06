package basic_04_objectOrient;

/*
anonymous instance
匿名对象：
    1. //只有右边的新建对象，没有左边的名字和赋值运算符
       new className();
    2. 匿名对象只能使用一次，如果确定一个对象只需要使用一次，就建议使用匿名对象。
 */


import basic_00_helloworld.StandardPerson;

import java.util.Scanner;

public class Demo14_4ClassAnonymous {
    public static void main(String[] args) {
        // normal instance
        StandardPerson one = new StandardPerson();
        one.setName("Roger");
        one.setAge(20);
        one.show();
        System.out.println("===============");

        // anonymous instance
        new StandardPerson().setName("Francesca");
        new StandardPerson().setAge(20);
        new StandardPerson().show();            // null, 0 匿名对象只能使用一次

        // normal Scanner
        System.out.println("Please enter integer: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        methodParam(sc);                        // 普通对象作为传递参数，该对象仍然存在

        // anonymous Scanner
        System.out.println("Please enter integer: ");
        int num2 = new Scanner(System.in).nextInt();

        // anonymous Scanner as param
        methodParam(new Scanner(System.in));    // 匿名对象作为传递参数，传递结束该对象消失

        // anonymous Scanner as return
        Scanner sc2 = methodReturn();           // 匿名对象作为返回值，
        System.out.println("Please enter integer: ");
        System.out.println(sc2.nextInt());
    }

    public static void methodParam(Scanner sc) {
        System.out.println("Please enter integer: ");
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static Scanner methodReturn() {
        // normal Scanner
        //Scanner sc = new Scanner(System.in);
        //return sc;

        // anonymous Scanner
        return new Scanner(System.in);
    }
}


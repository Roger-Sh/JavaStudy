package helloworld;

/*
anonymous instance
匿名对象：
    1. //只有右边的新建对象，没有左边的名字和赋值运算符
       new className();
    2. 匿名对象只能使用一次，如果确定一个对象只需要使用一次，就建议使用匿名对象。
 */


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
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        methodParam(sc);                        // 普通对象作为传递参数，该对象仍然存在

        // anonymous Scanner
        int num2 = new Scanner(System.in).nextInt();
        methodParam(new Scanner(System.in));    // 匿名对象作为传递参数，传递结束该对象消失


    }

    public static void methodParam(Scanner sc) {

    }
}

class StandardPerson {
    /*
            member variable
     */

    private String name;
    private int age;

    /*
            constructor
     */

    public StandardPerson() {
    }

    public StandardPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
            getter and setter
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
            member method
     */

    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

}
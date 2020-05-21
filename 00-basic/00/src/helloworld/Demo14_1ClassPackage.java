package helloworld;

/*

面向对象 三大特性：
    1. 封装
    2. 继承
    3. 多态

1. 封装 package：
    1. method 是一种封装
    2. 关键字 private 是一种封装
        // 类外部无法访问类中的private变量，但可以通过setXxx() getXxx()方法间接访问
        // 在setXxx()中可以限制value
        // 对于基本类型boolean, private 成员变量不能用getMale(), 要用isMale()
    3. 封装就是将一些细节信息藏起来，对外界不可见，提高代码安全性

 */


public class Demo14_1ClassPackage {
    public static void main(String[] args) {

        /*
                package with method
        */

        int[] array = {5, 15, 20, 25, 30};
        int max = getMax(array);
        System.out.println("Max: " + max);
        System.out.println("==================");

        /*
                package with private
        */

        Person person1 = new Person();
        person1.show();

        person1.name = "Weipu";
        // person1.age = -18;   // can't call private member variable age
        person1.setAge(-20);
        person1.setAge(20);
        person1.show();
        System.out.println("==================");

        /*
                package example
         */

        Student stu = new Student();
        stu.setName("Roger");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("Name: " + stu.getName());
        System.out.println("Age: " + stu.getAge());
        System.out.println("Is male ? : " + stu.isMale());
        System.out.println("==================");

        // example with 'this' keyword
        stu.sayHelloTo("Francesca");
        System.out.println("==================");


    }

    public static int getMax(int[] array) {
        int max = array[0];

        for (int value : array) {   // enhanced for
            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}

/*
Problem:    there should be some limit for the age
Solution:  use private to protect member variable to limit age

member variable with private keyword can not be called from outside of the class
 */

class Person {
    String name;
    private int age;

    // setAge(): set a number to private age
    public void setAge(int num) {
        if (num < 100 && num >= 9) {
            age = num;
        } else {
            System.out.println("Wrong number!");
        }
    }

    // getAge(): get value of age
    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student {
    private String name;        // name
    private int age;            // age
    private boolean male;       // if male

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    public void setMale(boolean bool) {
        male = bool;
    }

    public boolean isMale() {   // 对于基本类型boolean, private 成员变量不能用getMale(), 要用isMale()
        return male;
    }

    // 如果成员方法的局部变量与成员变量相同，则成员变量在调用时前面要加this,否则优选调用成员方法内部的局部变量
    public void sayHelloTo(String name) {
        System.out.println("Hello, " + name + ", I'm " + this.name + ".");
    }
}
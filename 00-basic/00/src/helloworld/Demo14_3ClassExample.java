package helloworld;

public class Demo14_3ClassExample {
    public static void main(String[] args) {
        StandardStudent stu1 = new StandardStudent();
        stu1.show();
        stu1.setName("Roger");
        stu1.setAge(20);
        stu1.show();
        System.out.println("=============");

        StandardStudent stu2 = new StandardStudent("Francesca", 20);
        stu2.show();
        System.out.println("=============");


    }
}

/*
standard class normally has 4 components:
    1. every member variable with private
    2. setXxx() and getXxx() for every member variable
    3. constructor without args
    4. constructor with args for all member variable
 */

class StandardStudent {

    /*
            member variable
     */

    private String name;    // name
    private int age;        // age

    /*
            constructor
     */

    public StandardStudent() {
        this.name = "John Doe";
        this.age = 20;
    }

    public StandardStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
            setter and getter
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /*
            method
     */

    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
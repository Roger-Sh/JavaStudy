package helloworld;

/*
Constructor:    构造方法：专门用来创建对象的方法，当通过关键字 new 创建对象时，其实就是在调用构造方法
format:
public className(type param){
    //method body
}

notice:
    1. constructor name is same as class name
    2. constructor has no return type nor void
    3. use new to call constructor
    4. if there is no constructor, system will set a default constructor with nothing inside
    5. if there is one constructor, there is no constructor from system
    6. constructor can be overload, 重载，使用不同类型的params
 */

public class Demo14_2ClassConstructor {
    public static void main(String[] args) {

        // use new to call constructor, no params, call default constructor
        StudentWithConstructor stu1 = new StudentWithConstructor();
        stu1.setName("Roger");
        stu1.setAge(20);
        stu1.show();
        System.out.println("=================");

        // use new to call constructor, with params, call defined constructor
        StudentWithConstructor stu2 = new StudentWithConstructor("Francesca", 20);
        stu2.show();
        System.out.println("=================");

    }
}

class StudentWithConstructor {
    private String name;
    private int age;

    /*
            constructor
     */

    // 默认 空构造器, 当存在构造器时此构造器也必须手动设置才能起效, 无参
    public StudentWithConstructor() {
        System.out.println("Constructor begins!");
    }

    // 自定义构造器，全参
    public StudentWithConstructor(String name, int age) {
        System.out.println("Constructor begins!");
        setName(name);
        setAge(age);
    }

    /*
            setter and getter
     */

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age > 9 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Wrong age!");
        }
    }

    public int getAge() {
        return this.age;
    }

    /*
            method
     */
    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
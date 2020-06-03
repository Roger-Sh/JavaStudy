package basic_04_objectOrient;

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
    6. constructor can be overload, 重载，参数列表不同
 */

public class Demo14_2ClassConstructor {
    public static void main(String[] args) {

        // use new to call constructor, no params, call default constructor
        StudentWithConstructor stu1 = new StudentWithConstructor();
        stu1.show();    // null, 0,
        stu1.setName("Roger");
        stu1.setAge(20);
        stu1.show();
        System.out.println("=================");

        // use new to call constructor, with params, call defined constructor
        StudentWithConstructor stu2 = new StudentWithConstructor("Francesca", 20);
        stu2.show();
        stu2.setAge(18);
        stu2.show();
        System.out.println("=================");

    }
}

class StudentWithConstructor {
    /*
            member variable
     */

    private String name;
    private int age;

    /*
            constructor
     */

    // 无参构造器
    public StudentWithConstructor() {
        System.out.println("Constructor begins!");
    }

    // 全参构造器
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
package helloworld;

/*
面向对象三大特征：封装性Encapsulation，继承性Inheritance，多态性Polymorphism
继承是多态的前提，如果没有继承，就没有多态。

在继承的关系中，子类就是一个父类的延申，也就是说子类可以被当作父类看待，例如父类是员工，子类是讲师，那么讲师就是员工

// 格式
定义父类的格式，（一个普通的类的定义）
public class FatherClassName{
    // ...
}

定义子类的格式, 关键在于extends
public class SonClassName extends FatherClassName {
    //
}

// 继承时的重名成员变量
在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，有两种访问方式：
1. 直接通过子类对象访问成员变量
    // 取决于该对象是子类还是父类，是子类就用子类的变量，是父类就用父类的变量，子类如果没有就向上找父类的
2. 间接通过成员方法访问成员变量
    // 取决于成员方法在哪，如果属于父类则使用父类的变量，如果是子类则使用子类的变量
    // 方法属于哪个类就优先使用哪个类，没有就向上找
3. 当同时有重名的局部变量，子类成员变量，父类成员变量时，通过super访问父类的成员变量
    子类中的局部变量    直接写成员变量名,就近原则用局部
    子类中的成员变量    this.memberVar
    父类中的成员变量    super.memberVar

// 继承时的重名成员方法
在父子类的继承关系当中，如果成员方法重名，创建的对象是谁，就用谁的方法，没有就向上找

// 重写Override, 在继承关系中，
    1. 重写Override, 方法的名称一样，参数列表也一样
       重载Overload, 方法名称一样，参数列表不一样
    2. @Override, 写在方法前面用来检测是不是有效的正确覆盖重写，这个注解就算不写也能正确重写，只是用来检测
    3. 子类方法的返回值范围必须小于等于父类方法返回值范围， 比如Object 是所有 class 的祖宗
    4. 子类方法权限必须大于等于父类方法的权限修饰符
        public > protected > (default 什么都不写) > private
    5. 对于已经投入使用的类，尽量不要修改，推荐定义一个新的类，重复利用其中共性内容，并且添加改动新内容

// 继承中的构造方法
    1. 子类构造方法中有一个默认隐含的super调用，所以一定是先调用父类构造，后执行子类构造
    2. 可以通过super关键字来子类构造调用父类重载构造
    3. super的父类构造调用，必须是子类构造方法的第一个语句，并且一个子类构造方法只能调用一次super

// super 三种用法
    1. 在子类成员方法中，访问父类成员变量， super.memberVar   当该变量在子类与父类中重名
    2. 在子类成员方法中，访问父类成员方法， super.method()    当该方法在子类与父类中重名
    3. 在子类构造方法中，访问父类构造方法， super()

// this 三种用法
    1. 在本类的成员方法中，访问本类的成员变量，         this.memberVar
    2. 在本类的成员方法中，访问本类的另一个成员方法，    this.memberMethod()
    3. 在本类的构造方法中，访问本类的另一个构造方法，    this(...)    // this(...)必须是构造方法的第一个语句， this()与super()不能同时使用

// 继承三大特性
    1. java语言是单继承的，一个类的直接父类只能有唯一一个
    2. java语言可以多级继承， java.lang.Object 是最原始的亚当
    3. 一个子类的直接父类是唯一的，但一个父类可以拥有很多个子类

 */

public class Demo19_1ClassInheritance {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Roger", 20, "male");
        teacher1.employeeMethod();
        teacher1.teacherMethod();
        teacher1.show();
        teacher1.test();
        teacher1.method();
        System.out.println("==================");

        Tutor tutor1 = new Tutor("Francesca", 18, "Female");
        tutor1.employeeMethod();
        tutor1.tutorMethod();
        tutor1.show();
        System.out.println("==================");

        Tutor tutor2 = new Tutor();
        tutor2.employeeMethod();
        tutor2.tutorMethod();
        tutor2.show();
        System.out.println("==================");

        Employee employee1 = new Employee("Jack", 33, "male");
        employee1.show();

        System.out.println("==================");

    }

}

// fatherClass 父类
class Employee {
    // protected,对于protected而言，它指明就类用户而言，他是private，
    // 但是对于任何继承与此类的子类而言或者其他任何位于同一个包的类而言，他却是可以访问的。
    protected int id;
    protected String name;
    protected int age;
    protected String gender;
    protected String title;

    int num = 10;

    protected static int idCounter = 0;

    /*
            constructor
     */

    public Employee() {
        this("John Doe", 0, "unknown");
    }

    public Employee(String name, int age, String gender) {
        this.id = ++idCounter;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.title = "Employee";
    }

    /*
            getter and setter
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*
            method
     */

    public void employeeMethod() {
        System.out.println("Employee method start!");
    }

    public void method() {
        System.out.println("Employee method start!");
    }

    public void show() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Job title: " + this.title);
    }
}

class Teacher extends Employee {

    int num = 20;

    /*
        constructor
     */

    public Teacher() {
        super();                    // 调用父类无参构造方法
        this.title = "Teacher";
    }

    public Teacher(String name, int age, String gender) {
        super(name, age, gender);   // 调用父类有参构造方法
        this.title = "Teacher";
    }

    /*
        method
     */

    public void teacherMethod() {
        System.out.println("Teacher method start!");
    }

    // 重名成员方法, 重写，用来改写该方法的具体实现
    @Override // 用以检测是否正确重写override
    public void method() {
        System.out.println("Teacher method start!");
    }

    public void test() {
        int num = 30;
        System.out.println("son class local var: " + num);
        System.out.println("son class member var: " + this.num);
        System.out.println("dad class member var: " + super.num);
    }
}

class Tutor extends Employee {
    /*
        constructor
     */

    public Tutor() {
        super();
        this.title = "Tutor";
    }

    public Tutor(String name, int age, String gender) {
        super(name, age, gender);
        this.title = "Tutor";
    }

    /*
        method
     */

    public void tutorMethod() {
        System.out.println("Tutor method start!");
    }
}
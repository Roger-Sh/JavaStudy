package helloworld;

/*
静态代码块格式：

public class className {

    static {
        // static code block

    }
}

当第一次用到本类时，静态代码块执行唯一的一次
静态内容总是优先于非静态，所以静态代码块比构造方法先运行

静态代码块 典型用途：
    用来一次性对静态成员变量进行赋值

 */

public class Demo18_2StaticCodeBlock {
    public static void main(String[] args) {
        PersonStatic p1 = new PersonStatic("Roger", 20);        // 第一次使用PersonStatic类的时候，执行static code block
        PersonStatic p2 = new PersonStatic("Francesca", 18);
        PersonStatic p3 = new PersonStatic();

        p1.show();
        PersonStatic.setCompany("SpaceX");
        p2.show();
        p3.show();

    }
}

class PersonStatic {
    private String name;
    private int age;
    private int id;

    private static int idCounter;
    private static String company;

    static {
        System.out.println("Static code block start!");
        PersonStatic.idCounter = 0;
        PersonStatic.company = "default company";
    }

    // constructor
    public PersonStatic() {
        System.out.println("Constructor start!");
        this.name = "John Doe";
        this.age = 20;
        this.id = ++idCounter;
    }

    public PersonStatic(String name, int age) {
        System.out.println("Constructor start!");
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    // getter and setter

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        PersonStatic.idCounter = idCounter;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        PersonStatic.company = company;
    }

    // show() method
    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("ID: " + this.id);
        System.out.println("Company: " + PersonStatic.company);
    }
}
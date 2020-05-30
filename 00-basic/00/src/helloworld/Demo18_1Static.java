package helloworld;

/*
static 与 对象无关，属于整个类共有的
如果一个成员变量使用了static关键字，那么这个变量不再属于对象，而是属于所在的类，多个对象共享
如果一个成员变量使用了static关键字，那么这个方法不再属于对象，而是属于所在的类，可以不需要创建对象直接使用

 */


public class Demo18_1Static {
    public static void main(String[] args) {
        // static member variable，静态成员变量
        StudentStatic stu1 = new StudentStatic("Roger", 19);
        StudentStatic stu2 = new StudentStatic("Francesca", 17);
        StudentStatic stu3 = new StudentStatic();

        stu1.show();                            // room: null, 因为此时还未给room赋值
        StudentStatic.setRoom("classroom 101"); // 给static room 赋值，所有对象均享有该静态成员变量，通过对象名直接访问
        stu1.show();
        stu2.show();
        stu3.show();
        System.out.println(stu1.getRoom());             // 通过对象名访问静态成员变量, 不推荐
        System.out.println(StudentStatic.getRoom());    // 通过类名直接访问静态，推荐
        System.out.println("=================");

        // static member method， 静态成员方法
        StudentStatic.showRoom();   // 通过类名直接访问静态成员方法，推荐
        stu1.showRoom();            // 通过对象名访问静态成员方法，不推荐, 会自动翻译为通过类名访问
    }
}

class StudentStatic {
    private String name;
    private int age;
    private int id;

    private static int idCounter = 0; // idCounter, new instance --> idCounter++
    private static String room;

    /*
        constructor
     */

    public StudentStatic() {
        this.name = "John Doe";
        this.age = 20;
        this.id = ++idCounter;
    }

    public StudentStatic(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        StudentStatic.room = room;
    }

    /*
        method
     */

    // 普通方法
    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("ID: " + this.id);
        System.out.println("Room: " + this.room);
    }

    // 静态方法， static method
    public static void showRoom() {
        System.out.println("Room: " + StudentStatic.room);
    }
}
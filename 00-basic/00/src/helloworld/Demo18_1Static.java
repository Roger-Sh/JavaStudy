package helloworld;

/*
static 与 对象无关，属于整个类共有的
如果一个成员变量使用了static关键字，那么这个变量不再属于对象，而是属于所在的类，多个对象共享

 */


public class Demo18_1Static {
    public static void main(String[] args) {
        // 仅给stu1 的room赋值，但由于room是static 所以stu2的room也同样得到了赋值
        StudentStatic stu1 = new StudentStatic("Roger", 19);
        StudentStatic stu2 = new StudentStatic("Francesca", 17);
        StudentStatic stu3 = new StudentStatic();


        stu1.show();
        StudentStatic.setRoom("classroom 101");
        stu2.show();
        stu3.show();
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

    //    public void setId(int id) {
    //        this.id = id;
    //    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        StudentStatic.room = room;
    }

    /*
        method
     */

    public void show(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("ID: " + this.id);
        System.out.println("Room: " + this.room);
    }
}
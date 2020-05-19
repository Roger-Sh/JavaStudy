package helloworld;
/*
通常情况，一个类无法直接使用，需要根据类创建一个变量

1. 导包，指出类的位置
    import package name, class name
    import helloworld.Demo12_2ObjectOrientStudent
    // 对于和当前类属于同一个包的情况，可以省略import语句

2. 创建格式
    className objectName = new className()
    Student shan = new Student();

3. 使用分为两种情况
    1. 使用成员变量：objectName.memberVariableName
    2. 使用成员方法：objectName.memberMethod(args)

notice:
    成员变量如果未赋值，那么会生成一个默认值，规则与数组相同


 */


public class Demo12_3ObjectOrientStudentUse {
    public static void main(String[] args) {
        // 1. same package, no need to import

        // 2. new object
        Demo12_2ObjectOrientStudent stu1 = new Demo12_2ObjectOrientStudent();

        // 3. use member variable
        System.out.println(stu1.name);      // null
        System.out.println(stu1.age);       // 0
        System.out.println("=============");       // 0

        // change member variable
        stu1.name = "Weipu Shan";
        stu1.age = 18;
        System.out.println(stu1.name);      // null
        System.out.println(stu1.age);       // 0
        System.out.println("=============");       // 0

        // 4. use member method
        stu1.eat();
        stu1.sleep();
        stu1.study();

    }
}

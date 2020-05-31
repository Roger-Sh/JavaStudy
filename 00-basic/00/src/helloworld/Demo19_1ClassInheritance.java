package helloworld;

/*
面向对象三大特征：封装性Encapsulation，继承性Inheritance，多态性Polymorphism
继承是多态的前提，如果没有继承，就没有多态

在继承的关系中，子类就是一个父类，也就是说子类可以被当作父类看待，例如父类是员工，子类是讲师，那么讲师就是员工

定义父类的格式，（一个普通的类的定义）
public class FatherClassName{
    // ...
}

定义子类的格式, 关键在于extends
public class SonClassName extends FatherClassName {
    //
}

 */

public class Demo19_1ClassInheritance {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.method();

        Tutor tutor1 = new Tutor();
        tutor1.method();

    }

}

// fatherClass 父类
class Employee {

    public void method() {
        System.out.println("Employee method start!");
    }
}

class Teacher extends Employee {

}

class Tutor extends Employee {

}
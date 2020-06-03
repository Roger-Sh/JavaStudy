package basic_04_objectOrient;

/*
抽象方法：   加上abstract关键字，去掉大括号，直接分号结尾
抽象类：     抽象方法所在的类，必须是抽象类，在class前加上abstract

如何使用抽象类和抽象方法
1. 不能直接创建new抽象对象
2. 必须用一个子类来继承抽象类
3. 子类必须覆盖重写抽象父类中的所有抽象方法，覆盖重写（实现）：子类去掉抽象方法的abstract关键字，然后补上方法体大括号
4. 创建子类对象进行使用

notice
1. 抽象类不能创建对象
2. 抽象类中可以有构造方法，供子类创建对象时，初始化父类成员使用
3. 抽象类中，不一定包含抽象方法，但是有抽象方法的类一定是抽象类
4. 抽象类的子类必须重写抽象父类中所有的抽象方法，除非该子类也是抽象类

 */


public class Demo20_1ClassAbstractMethod {
    public static void main(String[] args) {
        // 错误写法，抽象类不能创建对象，这里Animal是抽象类
        // Animal animal = new Animal();

        // 使用子类来继承抽象类，在子类中实现抽象类中的抽象方法
        CatOrange cat1 = new CatOrange();
        cat1.normalMethod();            // from Animal.class
        cat1.eat();                     // from Cat.class
        cat1.sleep();                   // from Cat.class
        cat1.catOrangeSpecial();        // from OrangeCat.class

        Animal cat2 = new CatOrange();
        cat2.normalMethod();            // from Animal.class
        cat2.eat();                     // from Cat.class
        cat2.sleep();                   // from Cat.class
        // cat2.catOrangeSpecial();     //cat2 的类并不是CatOrange，而是Animal， 只能通过CatOrange使用其中重写Animal类的方法


    }

}

/*
        下面的三个类中，抽象类Animal为最上级抽象类，抽象类Cat继承了Animal，普通类CatOrange继承了抽象类Cat，
 */

// abstract class
abstract class Animal {
    // constructor
    public Animal() {
        System.out.println("Animal constructor");
    }

    // abstract method, 没有大括号，有分号
    public abstract void eat();

    public abstract void sleep();

    // normal method，有大括号，没有分号
    public void normalMethod() {
        System.out.println("Animal can eat and sleep!");
    }
}

// 具体的子类继承抽象类
// 子类也可以是抽象类, 比如猫下面还可以有不同的猫
abstract class Cat extends Animal {
    // constructor
    public Cat() {
        //super();
    }

    // 子类继承抽象父类必须实现所有父类中的抽象方法，使用override来重写父类中的抽象方法
    @Override
    public void eat() {
        System.out.println("Cat eat fish!");
    }

    // public abstract void sleep();
}

//
class CatOrange extends Cat {
    // constructor
    public CatOrange() {
    }

    // 重写父类中的抽象方法
    @Override
    public void sleep() {
        System.out.println("Orange cat sleeps 16 hours per day.");
    }

    public void catOrangeSpecial() {
        System.out.println("Orange cat is very heavy!");
    }
}
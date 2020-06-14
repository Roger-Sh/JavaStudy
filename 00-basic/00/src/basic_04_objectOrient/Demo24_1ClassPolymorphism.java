package basic_04_objectOrient;

/*
面向对象三大特征：封装性Encapsulation，继承性Inheritance，多态性Polymorphism(multi)
extends继承或者implements实现，是多态性的前提
父类：人类
子类：学生
对象：小明，是一个学生，也是一个人类，这个对象拥有多种形态，这就是对象的多态性

代码当中体现多态性，其实就是一句话，父类引用指向子类对象
左父右子！
格式：
    针对父类继承：   父类名称 对象名 = new 子类名称（）；
    针对接口实现：   接口名称 对象名 = new 实现类名称（）；

 */


public class Demo24_1ClassPolymorphism {
    public static void main(String[] args) {
        // 使用多态的写法
        // 左侧父类的引用，指向右侧子类的对象
        Dad roger = new Son();
        roger.methodCommon();
        roger.methodDad();      //该方法父类特有，虽然该实例为子类对象，但子类对象继承了父类方法，所以
        //roger.methodSon();    //该方法子类特有，当该实例引用类型为父类时，无法使用子类特有的方法
    }

}

class Dad {
    int num = 10;

    public void methodCommon() {
        System.out.println("this is dad");
        System.out.println(num);
    }

    public void methodDad() {
        System.out.println("this is only in dad");
        System.out.println(num);
    }
}

class Son extends Dad {
    // 成员变量不能进行重写
    int num = 20;

    // 重写父类方法
    @Override
    public void methodCommon() {
        System.out.println("this is son");
        System.out.println(num);
    }

    public void methodSon() {
        System.out.println("this is only in son");
        System.out.println(num);
    }
}

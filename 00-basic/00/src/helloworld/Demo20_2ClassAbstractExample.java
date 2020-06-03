package helloworld;

public class Demo20_2ClassAbstractExample {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.eat();
    }
}

// abstract class
abstract class Fu {
    // constructor
    public Fu() {
        System.out.println("abstract Fu class");
    }

    // abstract method
    public abstract void eat();
}

// 子类
class Zi extends Fu {
    // constructor
    public Zi() {

    }

    // override the abstract method from Fu class
    @Override
    public void eat() {
        System.out.println("zi eat");
    }
}
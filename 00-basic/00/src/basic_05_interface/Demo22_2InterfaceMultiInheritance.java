package basic_05_interface;

/*
// 类与接口之间的关系
    1. 类与类之间是单继承的，直接父类只有一个
    2. 类与接口之间是多实现的，一个类可以实现多个接口
    3. 接口与接口之间是多继承的

// 注意事项
1. 多个父级接口中的抽象方法如果重复，没有关系
2. 多个父级接口中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写，并且带着default关键字
 */

public class Demo22_2InterfaceMultiInheritance {
    public static void main(String[] args) {
        MyInterfaceImplF impl1 = new MyInterfaceImplF();
        impl1.methodAbs1();
        impl1.methodDef1();

    }


}

interface MyInterfaceC extends MyInterfaceA, MyInterfaceB {
    // abstract method
    public abstract void methodAbsF1();

    // 父级接口中的默认方法重名，必须在子接口中进行覆盖重写
    @Override
    default void methodDef1() {
        System.out.println("override default method from MyInterfaceA and MyInterfaceB in MyInterfaceC");
    }
}

class MyInterfaceImplF implements MyInterfaceC {
    // abstract method from MyInterfaceA
    @Override
    public void methodAbs1() {

    }

    @Override
    public void methodAbs2() {

    }

    @Override
    public void methodAbs3() {

    }

    @Override
    public void methodAbs4() {

    }

    // abstract method from MyInterfaceB
    @Override
    public void methodAbs2B() {

    }

    @Override
    public void methodAbs2(int num) {

    }

    // abstract method from MyInterfaceC
    @Override
    public void methodAbsF1() {

    }
}

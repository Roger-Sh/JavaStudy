package basic_05_interface;

/*
接口就是多个类的公共规范
接口是一种引用数据类型，最重要的内容就是其中的抽象方法

接口格式：
public interface interfaceName {
    // interface content
}

注意：换成interface关键字之后，编译生成的字节码文件仍然是 .java --> .class

接口中可以定义的内容：
Java7:
    1. const variable   常量
    2. abstract method  抽象方法

Java8:
    3. default method   默认方法
    4. static method    静态方法

Java9:
    5. private method   私有方法

注意事项：
1. 接口中的抽象方法，修饰符必须是两个固定的关键字，public abstract
2. 这两个关键字修饰符，可以选择性省略
3. 如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类
4. Java8 开始，接口里允许定义默认方法, 接口中的默认方法可以解决接口升级的问题
    public default 返回值类型 methodName(args) {
        // method content
    }
5. 接口的默认方法可以通过接口实现类对象直接调用
   接口的默认方法也可以被接口实现类进行覆盖重写


接口使用：
1. 接口不能直接使用，必须有一个实现类来实现该接口
格式:
public class ImplementClassName implements interfaceName {
    // ...
}
2. 接口的实现类必须覆盖重写接口中所有的抽象方法，
实现：去掉abstract关键字，加上方法体大括号
3. 创建实现类的对象，进行使用

 */

public class Demo22_1Interface {
    public static void main(String[] args) {
        // 错误写法，不能直接new接口对象使用
        // MyInterfaceAbstract interface1 = new MyInterfaceAbstract();

        // 要使用接口，必须创建实现类的对象
        MyInterfaceImplA impl1 = new MyInterfaceImplA();
        impl1.methodAbs1();     // 调用实现类中实现的抽象方法
        impl1.methodDef1();     // 调用默认方法，若实现类中没有，则向上寻找接口中的默认方法

        MyInterfaceImplB impl2 = new MyInterfaceImplB();
        impl2.methodAbs2();     // 调用实现类中实现的抽象方法
        impl2.methodDef1();     // 调用实现类中覆盖重写的默认方法
    }


}

// interface 接口 MyInterface
interface MyInterface {
    /*
        abstract method 抽象方法，必须被实现类实现
     */

    public abstract void methodAbs1();

    abstract void methodAbs2();

    public void methodAbs3();

    void methodAbs4();

    /*
        default method 默认方法, 不需要被实现类实现
     */

    public default void methodDef1() {
        System.out.println("This is a default method from interface");
    }
}

// implements class 实现类 MyInterfaceImplA
class MyInterfaceImplA implements MyInterface {

    /*
            implement abstract method from interface
     */
    @Override
    public void methodAbs1() {
        System.out.println("1. abstract method implemented by MyInterfaceImplA");
    }

    @Override
    public void methodAbs2() {
        System.out.println("2. abstract method implemented by MyInterfaceImplA");
    }

    @Override
    public void methodAbs3() {
        System.out.println("3. abstract method implemented by MyInterfaceImplA");
    }

    @Override
    public void methodAbs4() {
        System.out.println("4. abstract method implemented by MyInterfaceImplA");
    }
}

// 另一个实现类 MyInterfaceImplB
class MyInterfaceImplB implements MyInterface {
    /*
            implement abstract method from interface
     */
    @Override
    public void methodAbs1() {
        System.out.println("1. abstract method implemented by MyInterfaceImplB");

    }

    @Override
    public void methodAbs2() {
        System.out.println("2. abstract method implemented by MyInterfaceImplB");

    }

    @Override
    public void methodAbs3() {
        System.out.println("3. abstract method implemented by MyInterfaceImplB");

    }

    @Override
    public void methodAbs4() {
        System.out.println("4. abstract method implemented by MyInterfaceImplB");

    }

    /*
            implement default method from interface
     */

    @Override
    public void methodDef1() {
        System.out.println("default method implemented by MyInterfaceImplB");
    }
}
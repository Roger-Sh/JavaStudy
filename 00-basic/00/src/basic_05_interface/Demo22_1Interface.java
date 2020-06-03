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
任何版本:
        1. public static final constName 常量， final 表示该变量不可改变
Java7:

        2. abstract method  抽象方法
Java8:
        3. default method   默认方法
        4. static method    静态方法
Java9:
        5. private method   私有方法

注意事项：
1. 接口中的抽象方法 abstract method
    1. 修饰符必须是两个固定的关键字，public abstract, 这两个关键字修饰符，可以选择性省略
    2. 如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类
2. 接口中的默认方法 default method
    1. Java8 开始，接口里允许定义默认方法, 接口中的默认方法可以解决接口升级的问题
    2. 格式
        public default returnType methodName(args) {
            // content
        }
    3. 接口的默认方法可以通过接口实现类对象直接调用
       接口的默认方法也可以被接口实现类进行覆盖重写
3. 接口中的静态方法 static method
    1. 静态方法不能通过接口实现类的对象来调用
    2. 通过接口名称直接调用静态方法 interfaceName.methodStatic(args);
4. 接口中的私有方法 private method
    1. java9开始，接口中允许定义私有方法，私有方法可以被默认方法调用，但不能被实现类使用，所以为interface私有的方法
    2. 普通私有方法，解决多个默认方法之间重复代码问题
            private returnType methodName(args){
                // content
            }
       静态私有方法，解决多个静态方法之间重复代码问题
            private static returnType methodName(args){
                // content
            }
5. 接口中的成员变量
    1. 接口中的成员变量必须使用 public static final 三个关键字进行修饰, 即接口的常量，final 表示不可改变的常量
    2. 格式
        public static final type CONSTNAME = value;
    3. 省略public static final，仍然拥有同样效果
    4. 接口中的常量必须全部大写

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

        // 第二个实现类的使用
        MyInterfaceImplB impl2 = new MyInterfaceImplB();
        impl2.methodAbs2();     // 调用实现类中实现的抽象方法
        impl2.methodDef1();     // 调用实现类中覆盖重写的默认方法

        // 访问接口的静态方法
        MyInterface.methodStatic1();

        // 访问接口中的常量
        System.out.println(MyInterface.NUM_OF_INTERFACE);

    }


}

// interface 接口 MyInterface
interface MyInterface {
    /*
            const
     */

    public static final int NUM_OF_INTERFACE = 10;   // final 表示不可改变

    /*
            abstract method 抽象方法，必须被实现类实现
     */

    // abstract method 只有声明，没有方法体
    public abstract void methodAbs1();

    abstract void methodAbs2();

    public void methodAbs3();

    void methodAbs4();

    /*
            default method 默认方法, 不需要被实现类实现
     */

    // default method 有方法体，相当于一个默认实现
    public default void methodDef1() {
        System.out.println("This is a default method from interface");
        methodPrivate1();      // use private method
    }

    /*
            static method
     */

    // static method 有方法体
    public static void methodStatic1() {
        System.out.println("This is a static method from interface");
        methodPrivate2();      // use private static method
    }

    /*
            private method
     */

    // 普通私有方法，可以被默认方法 default method 调用
    private void methodPrivate1() {
        System.out.println("This is a private method from interface, only used in interface for default method");
    }

    // 静态私有方法，可以被静态方法 static method 调用
    private static void methodPrivate2() {
        System.out.println("This is a static private method from interface, only used in interface for static method");
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
        System.out.println("1. default method implemented by MyInterfaceImplB");
    }
}
package basic_05_interface;

public class Demo22_3InterfaceExample {
    public static void main(String[] args) {
        // 不同引用类型的实现对象，可以使用的内容也不同，由引用类型对应的接口定义可以使用哪些方法
        Say impl1 = new InterfaceImpl();
        impl1.say(3);
        int num1 = impl1.returnNum(10);

        Talk impl2 = new InterfaceImpl();
        impl2.talk("Hello World");

        InterfaceImpl impl3 = new InterfaceImpl();
        impl3.say(6);
        int num2 = impl3.returnNum(20);
        impl3.talk("lkasjdlkajs");
        impl3.saySth();
    }
}

interface Say {
    // abstract method
    public abstract void say(int num);

    public abstract int returnNum(int num);
}

interface Talk {
    // abstract method
    public abstract void talk(String str);
}

class InterfaceImpl implements Say, Talk {

    @Override
    public void say(int num) {
        System.out.println(num);
    }

    @Override
    public int returnNum(int num) {
        return num;
    }

    @Override
    public void talk(String str) {
        System.out.println(str);
    }

    public void saySth() {
        System.out.println("from InterfaceImpl ");
    }

}
package helloworld;

/*
静态代码块格式：

public class className {

    static {
        // static code block

    }
}

当第一次用到本类时，静态代码块执行唯一的一次
静态内容总是优先于非静态，所以静态代码块比构造方法先运行

 */

public class Demo18_2StaticCodeBlock {
    public static void main(String[] args) {
        PersonStatic p1 = new PersonStatic();
        PersonStatic p2 = new PersonStatic();
    }
}

class PersonStatic {

    static {
        System.out.println("Static code block start!");
    }

    // constructor
    public PersonStatic() {
        System.out.println("Constructor start!");
    }
}
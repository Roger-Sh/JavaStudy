package helloworld;

/*
method format:
    public static void methodName(){        // static 用于与实例无关的调用， 可以直接被class中的main()调用，不需要实例化
        content
    }
 */

public class Demo05_1Method {
    public static void main(String[] args) {
        farmer();
        seller();
        cook();
        me();
    }

    public static void farmer() {
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");
        System.out.println("收割");
        System.out.println("卖给小商贩");
    }

    public static void seller() {
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");
        System.out.println("收割");
        System.out.println("卖给小商贩");
    }

    public static void cook() {
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
    }

    public static void me() {
        System.out.println("吃");
    }
}

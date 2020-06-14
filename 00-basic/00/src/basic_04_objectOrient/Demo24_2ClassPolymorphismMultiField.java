package basic_04_objectOrient;
/*
使用多态时的成员变量
访问成员变量的两种方式：
1. 直接通过对象名称访问成员变量，看等号左边是谁，就优先用谁的，没有则向上找
2. 间接通过成员方法访问

访问成员方法的方式：
    看new 的是谁，就优先用谁，没有则向上找

成员变量：编译看左，运行看左
成员方法：编译看左，运行看右

 */
public class Demo24_2ClassPolymorphismMultiField {
    public static void main(String[] args) {
        // 多态，左父右子
        Dad roger = new Son();

        // 访问成员变量
        System.out.println(roger.num);      //直接访问父类的成员变量
        //System.out.println(roger.age);    //子类中的变量并不能被显示，因为该对象的引用类型是父类
        roger.methodCommon();               //间接访问子类的成员变量，子类覆盖重写了父类的成员方法,所以虽然调用的是父类成员方法，但已被子类改写

        // 访问成员方法
        roger.methodCommon();               // 父子都有，优先用子
        roger.methodDad();                  // 子类没有，父类有，向上找父
        //roger.methodSon();                // 无法访问子类独有的方法，因为引用类型为父类
        //roger.methodSon();                // 无法访问子类独有的方法，因为引用类型为父类

    }
}

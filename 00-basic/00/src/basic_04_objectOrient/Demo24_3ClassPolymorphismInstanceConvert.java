package basic_04_objectOrient;
/*
对象转型
    向上转型一定安全
    向下转型要看原型是什么

如何才能知道一个父类引用的对象，本来是什么子类？
    对象 instanceof 类名称   // 得到一个boolean结果，判断前面的对象能不能当作后面类型的实例

 */

public class Demo24_3ClassPolymorphismInstanceConvert {
    public static void main(String[] args) {
        // 对象向上转型，就是父类引用子类对象
        AnimalDemo24 animal = new CatDemo24();  // 将animal 从cat 向上转型成 animal
        animal.eat();
        //animal.catchMouse();                  // 向上转型后，无法调用子类独有的成员方法

        // 对象向下转型
        CatDemo24 cat = (CatDemo24) animal;     // 将向上转型后的对象重新变回原来的子类引用
        cat.catchMouse();

        // 错误向下转型
        //DogDemo24 dog = (DogDemo24) animal;     // 将本来是猫的对象转换成狗
        //dog.watchHouse();                       // ClassCastException, 对象类型转换错误

        // 判断子类类型, 使用instanceof，返回值是boolean
        if (animal instanceof DogDemo24) {
            DogDemo24 dog = (DogDemo24) animal;
        }

        if (animal instanceof CatDemo24) {
            CatDemo24 cat2 = (CatDemo24) animal;
        }

        // example
        giveMeAPet(new DogDemo24());
    }

    public static void giveMeAPet(AnimalDemo24 animal) {
        // 判断传入的父类是由什么子类向上转型而成的
        if (animal instanceof DogDemo24) {
            DogDemo24 dog = (DogDemo24) animal; //向下转型
            dog.watchHouse();
        }
        if (animal instanceof CatDemo24) {
            CatDemo24 cat = (CatDemo24) animal; //向下转型
            cat.catchMouse();
        }
    }
}

abstract class AnimalDemo24 {
    public abstract void eat();
}

class CatDemo24 extends AnimalDemo24 {

    @Override
    public void eat() {
        System.out.println("Cat eat fish");
    }

    public void catchMouse() {
        System.out.println("cat catches mouse");
    }
}

class DogDemo24 extends AnimalDemo24 {
    @Override
    public void eat() {
        System.out.println("Dog eat meat");
    }

    public void watchHouse() {
        System.out.println("Dog watches house");
    }
}

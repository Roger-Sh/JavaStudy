package basic_04_objectOrient;
/*
对象转型
向上转型一定安全
向下转型要看原型是什么
 */

public class Demo24_3ClassPolymorphismInstanceConvert {
    public static void main(String[] args) {
        // 对象向上转型，就是父类引用子类对象
        AnimalDemo24 animal = new CatDemo24();  // 将animal 从cat 向上转型成 animal
        animal.eat();
        //animal.catchMouse();                  // 向上转型后，无法调用子类独有的成员方法

        // 对象向下转型
        CatDemo24 cat = (CatDemo24) animal;     // 将
        cat.catchMouse();

        // 错误向下转型
        DogDemo24 dog = (DogDemo24) animal;     // 将本来是猫的对象转换成狗
        dog.watchHouse();                       // ClassCastException, 对象类型转换错误
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

    }
}

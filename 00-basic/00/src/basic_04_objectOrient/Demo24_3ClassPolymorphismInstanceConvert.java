package basic_04_objectOrient;
/*
对象向上转型
 */

public class Demo24_3ClassPolymorphismInstanceConvert {
    public static void main(String[] args) {
        // 对象向上转型，就是父类引用子类对象
        AnimalDemo24 animal = new CatDemo24();  // 将animal 从cat 向上转型成 animal
        animal.eat();
        //animal.catchMouse();                  // 向上转型后，无法调用子类独有的成员方法

        // 对象向下转型
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

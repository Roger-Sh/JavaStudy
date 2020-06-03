package basic_04_objectOrient;

/*
Define a class -- student:
属性 attributes           |   成员变量    member variable
    name                 |   String name
    age                  |   int    age
行为 behave               |   成员方法    member method
    eat                  |   public void eat()
    sleep                |   public void sleep()
    study                |   public void study()

 */

public class Demo12_2ObjectOrientStudent {
    // member variable, 类中的全局变量, 写在方法外
    String name;
    int age;

    // member method, 无 static 修饰符
    public void eat(){
        System.out.println("eat!");
    }

    public void sleep(){
        System.out.println("sleep!");
    }

    public void study(){
        System.out.println("study!");
    }

    public static void main(String[] args) {

    }
}



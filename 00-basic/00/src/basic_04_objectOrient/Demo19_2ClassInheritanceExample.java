package basic_04_objectOrient;

public class Demo19_2ClassInheritanceExample {
    public static void main(String[] args) {
        Phone oldPhone = new Phone();
        oldPhone.call();
        oldPhone.send();
        oldPhone.show();

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();


    }
}

// old phone class
class Phone {
    public void call() {
        System.out.println("call...");
    }

    public void send() {
        System.out.println("send...");
    }

    public void show() {
        System.out.println("show number");
    }
}

// new phone class
class NewPhone extends Phone {

    @Override
    public void show() {
        // 重复利用父类中的旧代码
        super.show();

        // 子类重写的新内容
        System.out.println("show name");
        System.out.println("show image");
    }
}
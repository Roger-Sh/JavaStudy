package helloworld;
/*
Memory explain

1. Method Area
    Phone.class{
        // memeber variable:
            String brand;
            double price;
            String color;

        // member method:               // 0x333, 该地址指向 Method Area
            call(String who);
            sendGroupMessage();
    }

    Demo12_4ObjectOrientPhone.class{
        main(String[] args);            // 0x111，该成员方法地址
    }

2. Stack

    sendGroupMessage();                 // 通过地址找到 Method Area 中的方法，运行结束后立刻 出栈

    call(String who);                   // 0x333, 通过地址找到 Method Area 中的方法，结束后 出栈

    main(String[] args)                 // 先来的在最下面，运行时 进栈, 找到 Method Area 中的地址
        Phone phone1 = new Phone();     // 0x666, 在 Heap中开辟一块内存，记录该对象地址，成员变量自动赋值默认值
        phone1.brand = "Xiaomi";        // 通过对象的地址访问brand, price, color， 并赋值
        phone1.call("Jobs");            // 当运行此方法时，Stack中进入该方法，将main压在下面，叫压栈, 运行结束后出栈
        phone1.sendGroupMessage();      // 当运行此方法时，Stack中进入该方法，进栈，压栈，出栈

3. Heap
    new Phone(){                        // 0x666， 该地址指向 Heap
        // member variable
        String brand;                   // null
        double price;                   // 0.0
        String color;                   // null

        // member method                // 0x333, 该地址指向 Method Area

    }


// 内存图解见fig/Demo12_4.png
 */


public class Demo12_4ObjectOrientPhone {
    public static void main(String[] args) {

        /*
                phone1
         */

        Phone phone1 = new Phone();
        System.out.println(phone1.brand);       // null
        System.out.println(phone1.price);       // 0.0
        System.out.println(phone1.color);       // null
        System.out.println(phone1);             // helloworld.Phone@b4c966a, 栈中保存的该对象位于堆中的地址值，并包括了包的信息
        System.out.println("===============");

        // member variable valuation
        phone1.brand = "Xiaomi";
        phone1.price = 3499;
        phone1.color = "Black";
        System.out.println(phone1.brand);
        System.out.println(phone1.price);
        System.out.println(phone1.color);
        System.out.println("===============");

        // member method call
        phone1.call("Lei Jun");
        phone1.sendGroupMssage();

        /*
                phone2
         */


        Phone phone2 = new Phone();
        System.out.println(phone2.brand);       // null
        System.out.println(phone2.price);       // 0.0
        System.out.println(phone2.color);       // null
        System.out.println(phone2);             // helloworld.Phone@6e8cf4c6, 栈中保存的该对象位于堆中的地址值，并包括了包的信息
        System.out.println("===============");

        // member variable valuation
        phone2.brand = "Apple";
        phone2.price = 8999;
        phone2.color = "Black";
        System.out.println(phone2.brand);
        System.out.println(phone2.price);
        System.out.println(phone2.color);
        System.out.println("===============");

        // member method call
        phone2.call("Jobs");
        phone2.sendGroupMssage();

    }
}

class Phone {
    // member variable
    String brand;
    double price;
    String color;

    // member method
    public void call(String who){
        System.out.println("Call " + who);
    }

    public void sendGroupMssage(){
        System.out.println("send group message");
    }
}
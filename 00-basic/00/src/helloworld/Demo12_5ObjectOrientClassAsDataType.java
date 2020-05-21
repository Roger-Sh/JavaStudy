package helloworld;

public class Demo12_5ObjectOrientClassAsDataType {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "apple";
        one.price = 8388.0;
        one.color = "gold";

        method(one);    // 将对象 one 传入 method
        System.out.println("===========");

        Phone two = getPhone("Xiaomi", 3499.0, "white");
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("===========");


    }

    public static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }

    public static Phone getPhone(String brand, double price, String color) {
        Phone phone1 = new Phone();
        phone1.brand = brand;
        phone1.price = price;
        phone1.color = color;
        return phone1;
    }

}

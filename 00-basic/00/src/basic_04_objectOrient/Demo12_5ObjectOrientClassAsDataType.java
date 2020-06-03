package basic_04_objectOrient;

public class Demo12_5ObjectOrientClassAsDataType {
    public static void main(String[] args) {
        Handy one = new Handy();
        one.brand = "apple";
        one.price = 8388.0;
        one.color = "gold";

        method(one);    // 将对象 one 传入 method
        System.out.println("===========");

        Handy two = getPhone("Xiaomi", 3499.0, "white");
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("===========");


    }

    public static void method(Handy param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }

    public static Handy getPhone(String brand, double price, String color) {
        Handy handy1 = new Handy();
        handy1.brand = brand;
        handy1.price = price;
        handy1.color = color;
        return handy1;
    }

}

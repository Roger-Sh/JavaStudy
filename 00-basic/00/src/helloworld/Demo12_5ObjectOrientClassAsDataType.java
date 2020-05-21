package helloworld;

public class Demo12_5ObjectOrientClassAsDataType {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "apple";
        one.price = 8388.0;
        one.color = "gold";

        method(one);    // 将对象 one 传入 method

    }

    public static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }

}

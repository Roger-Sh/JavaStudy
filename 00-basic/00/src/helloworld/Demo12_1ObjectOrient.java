package helloworld;

import java.util.Arrays;

public class Demo12_1ObjectOrient {
    public static void main(String[] args) {
        int[] array1 = {10,20,30,40,50};

        /*
            process orient
         */

        System.out.print("[");
        for (int i = 0; i < array1.length; i++) {
            if (i == (array1.length - 1)){
                System.out.println(array1[i] + "]");
            } else {
                System.out.print(array1[i] + ", ");
            }
        }
        System.out.println("====================");

        /*
            object orient
        */

        // 找一个JDK提供的Arrays类
        // 其中有一个toString方法，将数组替换为字符串
        System.out.println(Arrays.toString(array1));
        System.out.println("====================");

        // example for class Demo00HelloWorld
        Demo00HelloWorld helloWorldA = new Demo00HelloWorld();
        helloWorldA.main(args);
        SecondHelloWorld helloWorldB = new SecondHelloWorld();
        helloWorldB.main();
    }
}

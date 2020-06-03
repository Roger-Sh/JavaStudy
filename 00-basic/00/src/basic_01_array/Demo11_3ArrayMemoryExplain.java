package basic_01_array;
/*
Java 内存划分为5个部分
1. 栈 Stack，存放的都是方法中的局部变量
        局部变量：方法的参数，或者是方法{}内部的变量
        作用域：一旦超出作用域，立刻从栈内存中消失
2. 堆 Heap，凡是new出来的东西，都在堆中，
        堆内存里面的东西都有一个地址值，16bit
        堆内存内的数据都有默认值，规则：
            int             默认为 0
            float, double   默认为 0.0
            char            默认为 '\u0000'
            boolean         默认为 false
            refer type      默认为 null

3. 方法区，Method Area, 储存.class相关信息，包含方法的信息

4. 本地方法栈，Native Methode Stack， 与操作系统相关

5. 寄存器， PC Register, 与CPU相关
*/
public class Demo11_3ArrayMemoryExplain {
    public static void main(String[] args) {
        int[] array1 = new int[3];  // dynamic init
        System.out.println(array1);         // memory adress
        System.out.println(array1[0]);      // 0
        System.out.println(array1[1]);      // 0
        System.out.println(array1[2]);      // 0
        System.out.println("============");

        // change element in the array
        array1[1] = 10;
        array1[2] = 20;
        System.out.println(array1);         // same memory adress
        System.out.println(array1[0]);      // 0
        System.out.println(array1[1]);      // 10
        System.out.println(array1[2]);      // 20
        System.out.println("============");

        //

        /*
        方法区 Method Area:
            public static void main(String[] args)

        栈 Stack:
            // 方法在栈里运行
            main(String[] args){
                int[] array1;                   // array1 储存了数组的内存地址
                System.out.println(array1);     // 输出了array1 的地址
                array1[1] = 10;                 // 找到堆中array1代表的0x666的内存地址，找到1号元素，将其替换为10
            }

        堆 Heap:
            // 对象的具体内容在堆里
            new int[3];
            0   [0]     0x666, 零号元素的内存地址，返回给栈中的数组名
            0   [1]
            0   [2]

         */

        int[] array2 = new int[3];  // dynamic init
        System.out.println(array2);         // memory adress
        System.out.println(array2[0]);      // 0
        System.out.println(array2[1]);      // 0
        System.out.println(array2[2]);      // 0
        System.out.println("============");

        // change element in the array
        array2[1] = 10;
        array2[2] = 20;
        System.out.println(array2);         // same memory adress
        System.out.println(array2[0]);      // 0
        System.out.println(array2[1]);      // 10
        System.out.println(array2[2]);      // 20
        System.out.println("============");

        // 将array1 地址赋值给array3
        int[] array3 = array1;
        // 改变array3 代表的内存地址代表的数组内容
        array3[1] = 100;
        array3[2] = 200;

        System.out.println(array3);         // memory adress
        System.out.println(array3[0]);      // 0
        System.out.println(array3[1]);      // 0
        System.out.println(array3[2]);      // 0
        System.out.println("============");

        // array1 的内容也同时改变，因为array1 与 array3 代表的是同一个内存地址
        System.out.println(array1);         // memory adress
        System.out.println(array1[0]);      // 0
        System.out.println(array1[1]);      // 0
        System.out.println(array1[2]);      // 0
        System.out.println("============");

    }
}

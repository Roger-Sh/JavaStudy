package basic_01_array;



public class Demo11_2ArrayUse {
    public static void main(String[] args){
        // 直接输出arrayName
        int[] array1 = {10, 20, 30};
        System.out.println(array1);         //[I@10f87f48, 内存地址哈希值，16bit

        // 访问数组, arrayName[index]
        System.out.println(array1[0]);      // 10
        // System.out.println(array1[3]);   // Exception
        System.out.println("===============");

        // 对单个元素赋值
        int num = array1[1];
        System.out.println(num);
        System.out.println("===============");

        // 改变数组内容
        array1[1] = 50;
        System.out.println(array1[1]);
        System.out.println("===============");

        /*
        使用动态初始化数组时， 其元素将自动获得一个默认值，
            int             默认为 0
            float, double   默认为 0.0
            char            默认为 '\u0000'
            boolean         默认为 false
            refer type      默认为 null
         */

        // dynamic init array
        int[] array2 = new int[3];
        System.out.println(array2);     // memrory adress
        System.out.println(array2[0]);  //0
        System.out.println(array2[1]);  //0
        System.out.println(array2[2]);  //0
        System.out.println("===============");

        array2[1] = 123;
        System.out.println(array2[0]);  //0
        System.out.println(array2[1]);  //0
        System.out.println(array2[2]);  //0
    }

}

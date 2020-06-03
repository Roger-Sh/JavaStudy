package basic_01_array;

/*
    Array:
        1. 数组是引用数据类型
        2. 数组中的数据类型必须统一
        3. 数组的长度在运行期间不可改变

    init array:
        1: dynamic init, 动态初始化，指定长度
            int[] arrayName = new int[length];
            // [] 表示数组，new 表示新建数组， length 表示数组长度，为int类型
        2: static init, 静态初始化，指定内容
            int[] arrayName = new int[] {1, 2, 3};

        3. simpale init, 省略模式
            int[] arrayName = {10, 20, 30};
 */

public class Demo11_1Array {
    public static void main(String[] args){
        // dynamic init array
        int[] array1 = new int[300];
        double[] array2 = new double[10];
        String[] array3 = new String[5];
        // 拆分步骤的 dynamic init
        int[] array3_1;
        array3_1 = new int[5];

        // static init array
        int[] array4 = new int[] {5, 15, 25};
        double[] array5 = new double[] {1.5, 2.5, 3.5};
        String[] array6 = new String[] {"Hello", "World", "Java"};
        System.out.println(array6[0]);
        // 拆分步骤的 static init
        int[] arrayName6_1;
        arrayName6_1 = new int[] {10, 20, 30};

        // simple static init array
        int[] array8 = {10, 20, 30};    // 省略了 new int[]
        // simple static init array 不可拆分步骤：
        // int[] array9;
        // array9 = {10, 20, 30};   // 这样是错误的

    }

}

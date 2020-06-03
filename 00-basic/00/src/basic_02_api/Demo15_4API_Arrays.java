package basic_02_api;

/*
java.util.Arrays 与数组有关的工具类，提供了大量静态方法，用来实现数组的常规操作

public static String toString(array);   // 将参数数组变成字符串，按照默认格式 [element1, element2, element3]
public static void sort(array);         // 按照默认升序对数组元素进行排序, 数值默认从小到大，字符串默认从a到z，如果是自定义类型，需要comparable 或者comparator的接口
 */


import java.util.Arrays;

public class Demo15_4API_Arrays {
    public static void main(String[] args) {

        // Arrays.toString(array)
        int[] intArray1 = {10, 20, 30};
        String intArrayToStr = Arrays.toString(intArray1);
        System.out.println(intArrayToStr);

        // Arrays.sort(array)
        int[] intArray2 = {2, 5, 12, 6, 3, 7};                          // [2, 3, 5, 6, 7, 12]
        Arrays.sort(intArray2);
        System.out.println(Arrays.toString(intArray2));

        String[] strArray1 = {"bbb ", "aaa ", "cba ", "cbb", "ddc"};    // [aaa , bbb , cba , cbb, ddc]
        Arrays.sort(strArray1);
        System.out.println(Arrays.toString(strArray1));


    }
}

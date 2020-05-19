package helloworld;

public class Demo11_4ArrayException {
    public static void main(String[] args) {
        // Exception: ArrayIndexOutOfBoundsException
        int[] array1 = {12, 25, 25};
        System.out.println(array1[0]);      //15
        System.out.println(array1[1]);      //25
        System.out.println(array1[2]);      //35
        //System.out.println(array1[3]);    // Exception: ArrayIndexOutOfBoundsException

        // Exception: NullPointerException
        int[] array2 = null;
        //System.out.println(arra
        // y[0]);       // Exception: NullPointerException, 数组未初始化
        array2 = new int[3];                //
        System.out.println(array2[0]);       // Exception: NullPointerException, 数组未初始化
    }
}

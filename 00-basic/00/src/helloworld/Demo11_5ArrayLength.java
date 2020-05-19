package helloworld;

public class Demo11_5ArrayLength {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = {1,2,3,4,5,6,7,87,2,4,51,4,4,1,5,6,12};
        int len = array2.length;            // array2 长度
        System.out.println("Length of array2: " + len );

        int[] array3 = new int[3];
        System.out.println(array3.length);  // 3
        System.out.println(array3);
        array3 = new int[5];                // 新建了一个数组，和前面的 int[3] 不同
        System.out.println(array3.length);  // 5
        System.out.println(array3);         // 和上面的地址不同

        // 数组长度在运行期间不可改变，除非新建一个数组


    }
}

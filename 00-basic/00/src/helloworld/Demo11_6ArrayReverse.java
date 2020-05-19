package helloworld;

public class Demo11_6ArrayReverse {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,76,8,9,9,10};

        array1 = arrayReverse(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

    // 将数组反转，不使用额外数组
    public static int[] arrayReverse(int[] array) { //传递的是数组的地址值, 返回的也是地址值
        int temp;
        int len = array.length;
        int half_len = len/2;

        for (int i = 0; i < half_len; i++) {
            temp = array[i];
            array[i] = array[len-i-1];
            array[len-i-1] = temp;
        }

        return array;
    }
}

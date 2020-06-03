package basic_01_array;

public class Demo11_6ArrayIterate {
    public static void main(String[] args) {
        int[] array1 = {12,25,35,45,55,34,6,2,6,1,45,4,32,4,34,2,1,5,12,};

        for (int i = 0; i < array1.length; i++) {
           System.out.println(array1[i]);
        }
        System.out.println("===============");

        // max
        int[] maxIndex = maxArray(array1);
        System.out.println("Max: " + maxIndex[0]);
        System.out.println("Max_Index: " + maxIndex[1]);
        System.out.println("===============");

        // min
        int[] minIndex = minArray(array1);
        System.out.println("Min: " + minIndex[0]);
        System.out.println("Min_Index: " + minIndex[1]);
        System.out.println("===============");
    }

    public static int[]  maxArray(int[] array){ //传递的是数组的地址值, 返回的也是地址值
        int[] maxIndex = new int[2];
        maxIndex[0] = array[0];
        maxIndex[1] = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxIndex[0]){
                maxIndex[0] = array[i];
                maxIndex[1] = i;
            }
        }

        return maxIndex;
    }

    public static int[]  minArray(int[] array){ //传递的是数组的地址值, 返回的也是地址值
        int[] minIndex = new int[2];
        minIndex[0] = array[0];
        minIndex[1] = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minIndex[0]){
                minIndex[0] = array[i];
                minIndex[1] = i;
            }
        }

        return minIndex;
    }
}

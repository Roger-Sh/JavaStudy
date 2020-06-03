package basic_02_api;

/*
1. import package
    import java.util.Random;

2. generate instance
    Random r = new Random();

3. use
    //get a random int numer
    r.nextInt();          // range for all int
    r.nextInt(int n);     // range from 0 to certain int number, 左闭右开
 */


import java.util.Arrays;
import java.util.Random;


public class Demo15_2API_Random {
    public static void main(String[] args) {

        // random example
        Random r = new Random();
        int num1 = r.nextInt();             // range for all int
        System.out.println(num1);

        int num2 = r.nextInt(10);        // range from 0 to 9, [0,10)
        System.out.println(num2);

        /*
                1. use random to get n numbers with range [a, b], store them in array
                2. print histogram of the array with n interval
         */

        // init
        int[] randomArray;
        int a = 0;
        int b = 999;
        int n = 1000000;

        // printNRandomFromAtoB()
        randomArray = printNRandomFromAToB(a, b, n); // print n random integer from a to b, return array
        System.out.println("\n=======================");

        // arrayToHisto()
        arrayToHisto(randomArray, 10);

    }

    // use random to get n numbers with range [a, b], store them in array
    public static int[] printNRandomFromAToB(int a, int b, int n) {
        // init
        int[] array = new int[n];
        Random r = new Random();

        // generate n random from a to b
        for (int i = 0; i < n; i++) {
            int num = r.nextInt(b - a + 1) + a;
            array[i] = num;
        }

        return array;
    }

    /*
            print histogram for array
            input:
                    int[] array;    // array
                    int n;          // n interval
     */
    public static void arrayToHisto(int[] array, int n) {
        // init histo_index
        int[] histo_index = new int[n];


        // sort array from min to max
        System.out.println("Start to sort the array!");
        Arrays.sort(array);
        System.out.println("\n=======================");

        // min, max
        int min = array[0];
        int max = array[array.length - 1];

        // interval
        double interval = ((double) max - (double) min) / (double) n;

        // count for histo_index
        for (int i = 0; i < array.length; i++) {
            int index = (int) ((double) (array[i] - min) / interval);
            if (index == n) {
                index--;
            }
            histo_index[index] += 1;
        }

        // normalize for histo_index
        for (int i = 0; i < histo_index.length; i++) {
            histo_index[i] = (int) (((double) histo_index[i] / (double) array.length) * 100.0);
        }

        for (int i = 0; i < histo_index.length; i++) {
            for (int j = 0; j < histo_index[i]; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

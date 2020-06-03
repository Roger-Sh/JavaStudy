package basic_02_api;

import java.util.Arrays;

public class Demo15_5API_ArraysExcise {
    public static void main(String[] args) {

        /*
            excise：将一个随机字符串中所有的字符升序排列，并倒序打印
         */

        // random string
        String line = "kjlhasasdjkljALSKHFLAJSDlfskdjfLKJFSDLJ";

        // convert String to char array
        char[] charArray = line.toCharArray();

        // ascend sort
        Arrays.sort(charArray);

        // reverse the array
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
    }
}

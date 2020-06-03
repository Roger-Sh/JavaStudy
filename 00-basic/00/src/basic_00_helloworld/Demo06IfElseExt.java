package basic_00_helloworld;

public class Demo06IfElseExt {
    public static void main(String[] args) {
        int x = 10;
        int y;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (-1 < x && x < 3) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }
        System.out.println(y);
    }
}


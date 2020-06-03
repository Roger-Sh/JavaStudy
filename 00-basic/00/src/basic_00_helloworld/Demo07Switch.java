package basic_00_helloworld;

/*
    switch notice:
        1. case value can not be same
        2. datatype
            1.1 byte, short, char, int
            1.2 String, enum
 */


public class Demo07Switch {
    public static void main(String[] args) {
        int num = 1;

        switch (num) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("wrong data");
                break;
        }
    }
}


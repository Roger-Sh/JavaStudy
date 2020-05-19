package Practise;
import java.io.*;
import java.util.Scanner;
//题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
//方法1
/*public class Practise01 {
	public static void main(String args[]) {
		int i;
		long arr[] = new long[36];	//定义数组
		arr[0] = arr[1] = 1;
		System.out.println("There are "+arr[0]+" Rabbits in 1. month");
		System.out.println("There are "+arr[1]+" Rabbits in 2. month");
		for(i=2;i<=35;i++) {
			arr[i] = arr[i-1] + arr[i-2];
			System.out.println("There are "+arr[i]+" Rabbits in "+(i+1)+". month");
		}
	}
}*/
//方法2 获得输入的整数
public class Practise01 {
    //主方法
    public static void main(String[] args) {
        //初始化月份数
        int n = 1;
        //循环
        while(n != 0) {
            System.out.println("Please enter the month number(0 for exit)：");
            Scanner input = new Scanner(System.in);
            n = input.nextInt(); //获得输入的整数
            //input.close();
            //月份为0时退出
            if(n == 0) {
                System.out.println("Exit.");
                break;
            }
            //输出
            System.out.println("There are " + getRabbitNum(n) + " Rabbits in " + n + ". month");
        }
    }
    //方法：得到兔子数，用了递归的方法
    private static int getRabbitNum(int n) {
        if(n == 1 || n == 2)
            return 1;
        else
            return getRabbitNum(n-1) + getRabbitNum(n-2);
    }
}

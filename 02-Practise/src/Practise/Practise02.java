package Practise;

import java.util.Scanner;

//题目：判断101-200之间有多少个素数，并输出所有素数。

public class Practise02 {
	
	public static void main(String[] args) {
		int sum = 0;
		int min = 0;
		int max = 0;
		
		//输入
		System.out.println("Please enter the min number(0 for exit)：");
		Scanner in_1 = new Scanner(System.in);
		min = in_1.nextInt(); //获得输入的整数
		
		System.out.println("Please enter the max number(0 for exit)：");
		Scanner in_2 = new Scanner(System.in);
		max = in_2.nextInt(); //获得输入的整数
		
		//循环输入的范围
		for (int i = min; i < max; i++) {
			if (IsRightNum(i)) { //利用方法判断是否是素数
				System.out.print(i + " ");
				sum++;
				if (sum%10 == 0) {
					System.out.print("\n");
				}
			}
		}
		System.out.println("\nThere are totally " + sum +" Rightnums.");
		in_1.close();
		in_2.close();
	}
	
	public static boolean IsRightNum(int i) {
		for (int n = 2; n < Math.sqrt(i); n++ ) {
			if (i%n == 0) {
				return false;
			}
		}
		return true;
	}
}


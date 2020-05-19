package Practise;

import java.util.Scanner;

//题目：输入两个正整数m和n，求其最大公约数和最小公倍数。

public class Practise06 {
	
	public static void main(String[] args) {
		int bigDivisor = 0; 	//最大公约数
		int smallMultiple = 0; 	//最小公倍数
		int temp = 0;			//交换用的中间数
		
		System.out.println("Please enter two numbers:");
		Scanner scanner = new Scanner(System.in);
		int input1  = scanner.nextInt();
		int input2  = scanner.nextInt();
		
		//确保第一个数不小于第二个数
		if(input2 > input1) {
			temp = input2;
			input2 = input1;
			input1 = temp;
		}
		
		while(temp != 0)
		
	}

}

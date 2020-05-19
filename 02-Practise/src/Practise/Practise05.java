package Practise;

import java.util.Scanner;

//题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。

public class Practise05 {
	public static void main(String[] args) {
		while(true) {
			System.out.print("Please enter your note (0 for Exit):");
			Scanner scanner = new Scanner(System.in);
			int note = scanner.nextInt();
			
			if (note == 0){
				System.out.println("Exit.");
				break;
			}
			
			String belong = note >= 90 ? "A":(note >= 60 ? "B":"c");
			//scanner.close();
			
			System.out.println("Your note class is " + belong + ".");
		}
	}
}

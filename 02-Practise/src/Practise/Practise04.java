package Practise;

import java.util.Scanner;

//��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��

public class Practise04 {

	public static void main(String[] args) {
		while(true) {
			System.out.println("\nPlease enter a number (0 for exit): ");
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			System.out.println();
			
			if (input == 0) {
				System.out.println("Exit.");
				break;
			}
			
			System.out.print(input + " = ");
			
			for (int i = 2; i < input+1; i++) {
				while (input%i == 0 && input != i) {
					input = input/i;
					System.out.print(i + "*");
				}
				if(input == i) {
					System.out.print(i);
					break;
				}
			}
			//scanner.close();
		}
	}
}

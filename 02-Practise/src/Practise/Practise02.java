package Practise;

import java.util.Scanner;

//��Ŀ���ж�101-200֮���ж��ٸ����������������������

public class Practise02 {
	
	public static void main(String[] args) {
		int sum = 0;
		int min = 0;
		int max = 0;
		
		//����
		System.out.println("Please enter the min number(0 for exit)��");
		Scanner in_1 = new Scanner(System.in);
		min = in_1.nextInt(); //������������
		
		System.out.println("Please enter the max number(0 for exit)��");
		Scanner in_2 = new Scanner(System.in);
		max = in_2.nextInt(); //������������
		
		//ѭ������ķ�Χ
		for (int i = min; i < max; i++) {
			if (IsRightNum(i)) { //���÷����ж��Ƿ�������
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


package Practise;

import java.util.Scanner;

//��Ŀ����������������m��n���������Լ������С��������

public class Practise06 {
	
	public static void main(String[] args) {
		int bigDivisor = 0; 	//���Լ��
		int smallMultiple = 0; 	//��С������
		int temp = 0;			//�����õ��м���
		
		System.out.println("Please enter two numbers:");
		Scanner scanner = new Scanner(System.in);
		int input1  = scanner.nextInt();
		int input2  = scanner.nextInt();
		
		//ȷ����һ������С�ڵڶ�����
		if(input2 > input1) {
			temp = input2;
			input2 = input1;
			input1 = temp;
		}
		
		while(temp != 0)
		
	}

}

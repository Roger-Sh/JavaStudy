package Practise;

import java.util.Scanner;

//��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��

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

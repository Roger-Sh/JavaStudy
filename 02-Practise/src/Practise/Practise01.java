package Practise;
import java.io.*;
import java.util.Scanner;
//��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ����Ӷ���Ϊ���٣�
//����1
/*public class Practise01 {
	public static void main(String args[]) {
		int i;
		long arr[] = new long[36];	//��������
		arr[0] = arr[1] = 1;
		System.out.println("There are "+arr[0]+" Rabbits in 1. month");
		System.out.println("There are "+arr[1]+" Rabbits in 2. month");
		for(i=2;i<=35;i++) {
			arr[i] = arr[i-1] + arr[i-2];
			System.out.println("There are "+arr[i]+" Rabbits in "+(i+1)+". month");
		}
	}
}*/
//����2 ������������
public class Practise01 {
    //������
    public static void main(String[] args) {
        //��ʼ���·���
        int n = 1;
        //ѭ��
        while(n != 0) {
            System.out.println("Please enter the month number(0 for exit)��");
            Scanner input = new Scanner(System.in);
            n = input.nextInt(); //������������
            //input.close();
            //�·�Ϊ0ʱ�˳�
            if(n == 0) {
                System.out.println("Exit.");
                break;
            }
            //���
            System.out.println("There are " + getRabbitNum(n) + " Rabbits in " + n + ". month");
        }
    }
    //�������õ������������˵ݹ�ķ���
    private static int getRabbitNum(int n) {
        if(n == 1 || n == 2)
            return 1;
        else
            return getRabbitNum(n-1) + getRabbitNum(n-2);
    }
}

package Practise;

//��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
//���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η���

public class Practise03 {
	
	public static void main(String[] arg) {
		int sum = 0;
		for (int i = 100; i < 100000; i++) {
			int bite = i%10; //��λ
			int ten = i/10%10; //ʮλ
			int hundred = i/100%10; //��λ
			//int thausend = i/100%10; //��λ
			if (i == Math.pow(bite, 3) + Math.pow(ten, 3) + Math.pow(hundred, 3)) {
				System.out.println(i + " is Narcissistic number.");
				sum++;
			}
		}
		System.out.println("There are totally " + sum + " Narcissistic number between 100 and 1000.");
	}
}

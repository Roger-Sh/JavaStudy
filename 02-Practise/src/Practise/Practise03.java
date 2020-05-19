package Practise;

//题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
//例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。

public class Practise03 {
	
	public static void main(String[] arg) {
		int sum = 0;
		for (int i = 100; i < 100000; i++) {
			int bite = i%10; //个位
			int ten = i/10%10; //十位
			int hundred = i/100%10; //百位
			//int thausend = i/100%10; //百位
			if (i == Math.pow(bite, 3) + Math.pow(ten, 3) + Math.pow(hundred, 3)) {
				System.out.println(i + " is Narcissistic number.");
				sum++;
			}
		}
		System.out.println("There are totally " + sum + " Narcissistic number between 100 and 1000.");
	}
}

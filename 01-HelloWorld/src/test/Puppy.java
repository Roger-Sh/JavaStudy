//�������Դ�ļ�����
//�����ڶ���ͽӿڽ��з���
package test;

//import�����ڰ������ඨ��֮��
//import java.io.*;

//һ��Դ�ļ�ֻ����һ��public��
//�����ж����public��

//��Puppy
//����Դ�ļ�ͬ��
public class Puppy {
	//�������������Ϊstatic����
	
	//��Ա����
	int puppyAge;
	
	//���췽�����ڴ���һ���µĶ���
	//���췽��������public��ͬ��
	public Puppy(String name) {
		//�ù��췽������һ������name
		System.out.println("Puppy's name is: " + name);
	}
	
	//����setAge
	public void setAge(int age) {
		puppyAge = age;
	}
	
	//����getAge
	public int getAge() {
		System.out.println("Puppy's age is:" + puppyAge);
		return puppyAge;
	}
	
	//�����������ɴ˿�ʼִ��
	public static void main(String []args) {
		//�����������ٻ����һ�����췽��
		Puppy myPuppy = new Puppy( "Jerry" );
	
		//ͨ�����еķ����趨����
		myPuppy.setAge(2);
	
		//ͨ�����еķ����������
		myPuppy.getAge();
	
		//����ͨ��������ĳ�Ա�������������
		System.out.println("Variable from class is:" + myPuppy.puppyAge);
	}
}


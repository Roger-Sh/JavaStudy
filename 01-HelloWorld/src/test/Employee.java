//��
package test;

//import
import java.io.*;

//��
public class Employee {
	//�������Ҫstatic����
	
	//��Ա������ʵ������
	//��һ������ʵ����֮��ʵ��������ֵ�͸���ȷ��
	//ʵ��������Ĭ��ֵ
	
	//public �ñ���������ɼ�
	public String name;
	//private ˽�б������ڸ����пɼ�
	private int age;
	
	String designation;
	
	double salary;
   
	// Employee ��Ĺ�����
	//�����඼��һ������������ͬ��
	public Employee(String name){
		//�ֲ�����û��Ĭ��ֵ
		//�ֲ�������Ҫ��ʼ��
		this.name = name;
	}
   
	// ��������age��ֵ
	public void empAge(int empAge){
		age =  empAge;
	}
   
	/* ��������designation��ֵ*/
	public void empDesignation(String empDesig){
		designation = empDesig;
	}
   
	/* ��������salary��ֵ*/
	public void empSalary(double empSalary){
		salary = empSalary;
	}
   
	/* ������ӡ��Ϣ */
	public void printEmployee(){
		System.out.println("����:"+ name );
		System.out.println("����:" + age );
		System.out.println("ְλ:" + designation );
		System.out.println("нˮ:" + salary);
	}
}


//���ʿ������η� default private public protected
//�Ƿ������η� static final abstract synchronized volatile

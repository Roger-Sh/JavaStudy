//package
package test;

//import
import java.io.*;

//class
public class EmployeeTest{
	//������
	public static void main(String []args){
		//ʹ�ù�����������������
		Employee empOne = new Employee("Tom");
		Employee empTwo = new Employee("Jerry");
 
		// ��������������ĳ�Ա����
		empOne.empAge(26);
		empOne.empDesignation("Cat");
		empOne.empSalary(1000);
		empOne.printEmployee();
 
		empTwo.empAge(21);
		empTwo.empDesignation("Maus");
		empTwo.empSalary(500);
		empTwo.printEmployee();
   }
}

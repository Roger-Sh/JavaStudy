//package
package test;

//import
import java.io.*;

//class
public class EmployeeTest{
	//主方法
	public static void main(String []args){
		//使用构造器创建两个对象
		Employee empOne = new Employee("Tom");
		Employee empTwo = new Employee("Jerry");
 
		// 调用这两个对象的成员方法
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

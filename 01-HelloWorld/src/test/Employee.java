//包
package test;

//import
import java.io.*;

//类
public class Employee {
	//类变量需要static修饰
	
	//成员变量或实例变量
	//当一个对象被实例化之后实例变量的值就跟着确定
	//实例变量有默认值
	
	//public 该变量对子类可见
	public String name;
	//private 私有变量仅在该类中可见
	private int age;
	
	String designation;
	
	double salary;
   
	// Employee 类的构造器
	//所有类都有一个构造器与类同名
	public Employee(String name){
		//局部变量没有默认值
		//局部变量需要初始化
		this.name = name;
	}
   
	// 方法设置age的值
	public void empAge(int empAge){
		age =  empAge;
	}
   
	/* 方法设置designation的值*/
	public void empDesignation(String empDesig){
		designation = empDesig;
	}
   
	/* 方法设置salary的值*/
	public void empSalary(double empSalary){
		salary = empSalary;
	}
   
	/* 方法打印信息 */
	public void printEmployee(){
		System.out.println("名字:"+ name );
		System.out.println("年龄:" + age );
		System.out.println("职位:" + designation );
		System.out.println("薪水:" + salary);
	}
}


//访问控制修饰符 default private public protected
//非访问修饰符 static final abstract synchronized volatile

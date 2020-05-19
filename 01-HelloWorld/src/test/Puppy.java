//包语句在源文件首行
//包用于对类和接口进行分类
package test;

//import语句放在包语句和类定义之间
//import java.io.*;

//一个源文件只能有一个public类
//可以有多个非public类

//类Puppy
//类与源文件同名
public class Puppy {
	//类变量必须声明为static类型
	
	//成员变量
	int puppyAge;
	
	//构造方法用于创建一个新的对象
	//构造方法必须与public类同名
	public Puppy(String name) {
		//该构造方法仅有一个参数name
		System.out.println("Puppy's name is: " + name);
	}
	
	//方法setAge
	public void setAge(int age) {
		puppyAge = age;
	}
	
	//方法getAge
	public int getAge() {
		System.out.println("Puppy's age is:" + puppyAge);
		return puppyAge;
	}
	
	//主方法程序由此开始执行
	public static void main(String []args) {
		//创建对象至少会调用一个构造方法
		Puppy myPuppy = new Puppy( "Jerry" );
	
		//通过类中的方法设定年龄
		myPuppy.setAge(2);
	
		//通过类中的方法获得年龄
		myPuppy.getAge();
	
		//或者通过访问类的成员变量来获得年龄
		System.out.println("Variable from class is:" + myPuppy.puppyAge);
	}
}


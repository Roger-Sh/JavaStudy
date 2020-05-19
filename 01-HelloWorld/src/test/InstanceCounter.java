package test;

public class InstanceCounter {
	
	//实例变量
	//静态变量独立于对象
	private static int numInstances = 0;
	
	//方法
	//静态方法独立于对象
	protected static int getCount() {
		return numInstances;
	}
	
	private static void addInstance() {
		numInstances++;
	}
	
	InstanceCounter(){
		InstanceCounter.addInstance();
	}

	//主方法
	public static void main(String[] arguments) {
		System.out.println("Starting with " + 
		InstanceCounter.getCount() + " instances");
		
		for (int i = 0; i < 500; ++i) {
			new InstanceCounter();
		}
		
		System.out.println("Created " + 
		InstanceCounter.getCount() + " instances");
	}
}


//static 独立于对象
//final 变量不能被重新赋值
//static final 用于创建类常量
//abstract 抽象类不能实例化对象，将来对该类扩充
//抽象方法是一种没有任何实现的方法，该方法的的具体实现由子类提供


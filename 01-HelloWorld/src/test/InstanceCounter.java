package test;

public class InstanceCounter {
	
	//ʵ������
	//��̬���������ڶ���
	private static int numInstances = 0;
	
	//����
	//��̬���������ڶ���
	protected static int getCount() {
		return numInstances;
	}
	
	private static void addInstance() {
		numInstances++;
	}
	
	InstanceCounter(){
		InstanceCounter.addInstance();
	}

	//������
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


//static �����ڶ���
//final �������ܱ����¸�ֵ
//static final ���ڴ����ೣ��
//abstract �����಻��ʵ�������󣬽����Ը�������
//���󷽷���һ��û���κ�ʵ�ֵķ������÷����ĵľ���ʵ���������ṩ


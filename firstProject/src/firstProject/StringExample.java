package firstProject;

public class StringExample {
	public static void main(String[] args) {
		int age = 20;
		String name = "ȫ�浿";
		
		long myAge = age;  //�ڵ�����ȯ(promotion)
		age = (int) myAge;  //��������ȯ(casting)
		
		
//		age = "������";
//		name = 20;
		System.out.println(name + "�� ���̴� " + age);
		
		String myname = "������";
		int myage = 28;	
			
		System.out.println( myname + "�� ���̴� " + myage + "�Դϴ�");
	}
}

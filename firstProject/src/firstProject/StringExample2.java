package firstProject;

public class StringExample2 {
	public static void main(String[] args) {
		String name = "������";
		int age = 28;
		
		// �̸��� ������, ���̴� 28
		System.out.println("�̸��� " + name + " ���̴� " + age + "��");
		System.out.printf("�̸��� %s,���̴� %d��", name, age);
		
		//b1(byte) = 100
		//b2(byte) = 10;
		//result = b1 + b2�� ��
		//100 + 10 =110 �ֿܼ� ���
		//result > 0
		
		byte b1 = -90;
		byte b2 = 10;
		int result = (int)(b1+b2);
		
		System.out.println(result);
		
		if(result > 0) {
			System.out.println("����̴�");
		}else {
			System.out.println("�����̴�");
		}
		
		// 2200000000, 120, 16
		int number1 = 78;
		long number2 = 2200000000L;
		int number3 = 8;
		
		long avg = (number1 + number2 + number3)/3;
		System.out.println(avg);
		
		double avg2 = number1/(double)number3;
		System.out.println(avg2);
	}

}

package firstProject;

public class VariableExample2 {

	public static void main(String[] args) {
		// �̸�, ����, ��/����
		int age = 25;
		String name = "������";
		int myage = 23;
		boolean whoage;
		whoage = age <= myage;
		
		if(whoage) {
			System.out.println(name + "��" + age + "�̻��Դϴ�." );
		}
		
		
		whoage = age > myage;
		if(whoage) {
			System.out.println(name + "��" + age + "�����Դϴ�." );
		}
		
		// age < ���� => 25�� �̻�
	
		// age > ���� => 25�� ����
		
		System.out.println("end of program");
	}

}

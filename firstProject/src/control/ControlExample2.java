package control;

public class ControlExample2 {
	public static void main(String[] args) {
		// A = �����߾�� B= ���߾��, C= �����Դϴ�. D="����ϼ���" F="�Ǹ��Դϴ�."
		// switch���� �̿��ؼ� ������.
		String input = "B";
		switch(input) {
		case "A":
			System.out.println("�����߾��");
			break;
		case "B":
			System.out.println("���߾��");
			break;
		case "C":
			System.out.println("�����Դϴ�");
			break;
		case "D":
			System.out.println("����ϼ���");
			break;
		case "F":
			System.out.println("�Ǹ��Դϴ�.");
			break;
		default:
			System.out.println("�ʴ� ������ ���� �ƴϾ�");
			break;
			}
		//switch ������ �̿��ؼ� A,B,C�� pass D�� "retry", F�� "Fail"�� ������
		
		switch(input) {
		case "A":
		case "B":
		case "C":
			System.out.println("Pass");
			break;
		case "D":
			System.out.println("retry");
			break;
		case "F":
			System.out.println("Fail");
			break;
		default:
			System.out.println("�̰��� ���峭!");
			break;
		}
		
	}
}

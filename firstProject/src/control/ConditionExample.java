package control;

public class ConditionExample {
	public static void main(String[] args) {
		int Score = 70;

		if (Score >= 60) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		
		// 90�̻� A, 80�̻� B, 70�̻� C, 60�̻� D �׿� F
		// �������� ���ɼ��� �Ѱ����� �ؾ��ϴ� ���
		if (Score >= 90) {
			System.out.println("A�����Դϴ�.");
		}else if(Score >= 80){
			System.out.println("B�����Դϴ�.");
		}else if(Score >= 70){
			System.out.println("C�����Դϴ�.");
		}else if(Score >= 60){
			System.out.println("D�����Դϴ�.");
		}else {
			System.out.println("F�����Դϴ�.");
		}
		
		System.out.println("��.");
		
		//�������� ���ɼ��� �Ѳ����� ó���ؾ��ϴ� ���
		if(Score >= 90) {
			System.out.println("A�����Դϴ�.");
		}if(Score >= 80) {
			System.out.println("B�����Դϴ�.");
		}if(Score >= 70) {
			System.out.println("C�����Դϴ�.");
		}if(Score >= 60) {
			System.out.println("D�����Դϴ�.");
		}if(Score < 60 ) {
			System.out.println("F�����Դϴ�.");
		}
		System.out.println("��.");
	}
}
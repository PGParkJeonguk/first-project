package reference;

public class ForExample {
	public static void main(String[] args) {
		
		
		{
			int i = 0;
			int j = 0;
		}
		
		// for�� ����
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("��1");

		// 1~10 ¦����
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("��2");

		// 1~ 10 Ȧ���� �ջ�
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("�հ�: " + sum);
		System.out.println("��3");

		sum = 0;
		int cnt = 0; 		// Ƚ���� �޾ƿͼ� ����ϴ� �뵵.
		// int i = 0 ;
		// 1~ 10 sum�� ���� 20�� �Ѿ�� �׶��� Ƚ��.
		for (int i = 1; i <= 10; i++) {
			sum += i;
			if (sum >= 20) {
				// i���� ��ȯ�ϰų�
				cnt = i;
				break;
			}
		}
		System.out.println("Ƚ��: " + cnt);
		System.out.println("��4");
	}
}
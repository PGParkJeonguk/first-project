package control;

public class Forexe {
	public static void main(String[] args) {
		// 1~10 ��� ����
		int cnt = 0;
		for (int i = 1; i <= 10; i++) {
			cnt += 1;
			System.out.println(cnt);
		}
		System.out.println("��1\n");
		// 1~10�߿��� 2 4 6 8 10
		int cnt1 = 0;
		for (int i = 1; i <= 10; i += 2) {
			cnt1 += 2;
			System.out.println(cnt1);
		}
		System.out.println("��2\n");
		// 1~10�߿��� Ȧ��
		int cnt2 = 1;
		for (int i = 1; i < 10; i += 2) {
			cnt2 += 2;
			System.out.println(cnt2);
		}
		System.out.println("��3\n");
		// 1~10 �� ���Ѱ�
		int cnt3 = 0;
		for (int i = 1; i <= 10; i += 1) {
			cnt3 += i;
		}
		System.out.println(cnt3);
		System.out.println("��4\n");
	}
}
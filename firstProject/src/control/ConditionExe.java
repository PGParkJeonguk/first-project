package control;

public class ConditionExe {
	public static void main(String[] args) {

		// if��������
		// �� ���� 60 , 70
		// �� ���� ���� ��� 100���� �Ѿ�� �հ�, ���Ѿ�� ���հ�
		// ��. ���

		int A = 3;
		int B = 5;

		if (A + B >= 100) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}

		// �μ��� ���ؼ� ¦���̸� ¦��, Ȧ���̸� Ȧ��
		// 2��° ��
		int suv = A * B;

		if (suv % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}

		// 2�� ����̸� 2�� ���, 3�� ����̸� 3�� ��� , 2�� 3�� ����̸� 2��3�� ���
		int sub = 9;
		if (sub % 2 == 0 && sub % 3 == 0) {
			System.out.println("2�� 3�� ���");
		} else if (sub % 2 == 0) {
			System.out.println("2�� ���");
		} else if (sub % 3 == 0) {
			System.out.println("3�� ���");
		}

		// switch���ǹ� -> (1~6�߿�)1�� ���Խ��ϴ�.

		int random = (int) (Math.random() * 6) + 1;
		System.out.println(random);

		switch (random) {
		case 1:
		case 3:
		case 6:
			System.out.println(random + "�� ���Խ��ϴ�.");
			break;
		case 2:
		case 4:
		case 5:
			System.out.println(random + "�� ���Խ��ϴ�.");
			break;
		}
		System.out.println("��!");

		// 5�� if���� ��������
		int random2 = (int) (Math.random() * 100);
		System.out.println(random2 + "��");

		if (random2 >= 90) {
			System.out.println("A�����Դϴ�.");
		} else if (random2 >= 80) {
			System.out.println("B�����Դϴ�.");
		} else if (random2 >= 70) {
			System.out.println("C�����Դϴ�.");
		} else if (random2 >= 60) {
			System.out.println("D�����Դϴ�.");
		} else {
			System.out.println("F�����Դϴ�.");
		}

		System.out.println("5�� ��");
		System.out.println("--------------------------");
		System.out.println("6�� switch ����");
		int random3  = (int) (Math.random() * 100);
		int perrandom = random3 % 10;

		switch (perrandom) {
		case 9:
			System.out.println(perrandom + "��" + "A�����Դϴ�.");
			break;
		case 8:
			System.out.println(perrandom + "��" + "B�����Դϴ�.");
			break;
		case 7:
			System.out.println(perrandom + "��" + "C�����Դϴ�.");
			break;
		case 6:
			System.out.println(perrandom + "��" + "D�����Դϴ�.");
			break;
		default:
			System.out.println(perrandom + "��" + "F�����Դϴ�.");
			break;
		}
	}
}

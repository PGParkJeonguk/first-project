package control;

public class ConditionExe {
	public static void main(String[] args) {

		// if��������
		// �� ���� 60 , 70
		// �� ���� ���� ��� 100���� �Ѿ�� �հ�, ���Ѿ�� ���հ�
		// ��. ���

		int A = 60;
		int B = 70;

		int sum = A + B;

		if (sum > 100) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}

		// �μ��� ���ؼ� ¦���̸� ¦��, Ȧ���̸� Ȧ��
		// 2��° ��

		int suv = A * B;

		if (suv % 2 == 1) {
			System.out.println("¦��");
		} else
			System.out.println("Ȧ��");

		// 2�� ����̸� 2�� ���, 3�� ����̸� 3�� ��� , 2�� 3�� ����̸� 2��3�� ���

		int subValue = 12;
		if (subValue % 2 == 0 && subValue % 3 == 0) {
			System.out.println("2�� 3�� ���");
		} else if (subValue % 3 == 0) {
			System.out.println("3�� ���");
		} else if (subValue % 2 == 0) {
			System.out.println("2�� ���");
		}

		int randomValue = (int) (Math.random() * 6) + 1;
		System.out.println(randomValue);

		// switch���ǹ� -> 1�� ���Խ��ϴ�.

		switch (randomValue) {
		case 1:
		case 3:
		case 6:
			System.out.println(randomValue + "�� ���Խ��ϴ�.");
			break;
		case 2:
		case 4:
		case 5:
			System.out.println(randomValue + "�� ���Խ��ϴ�.");
			break;
		}
		System.out.println("��");

		// 5�� if���� ��������
		System.out.println("5�� if ����");
		int randomScore = (int) (Math.random() * 100);

		System.out.println(randomScore + "��");

		if (randomScore >= 90) {
			System.out.println("A����");
		} else if (randomScore >= 80) {
			System.out.println("B����");
		} else if (randomScore >= 70) {
			System.out.println("C����");
		} else if (randomScore >= 60) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
		}
		System.out.println("5�� ��");
		System.out.println("--------------------------");
		System.out.println("6�� switch ����");
		int randomScore2 = (int) (Math.random() * 100);
		int perrandomScore2 = randomScore2 % 10;

		System.out.println(perrandomScore2);

		switch (perrandomScore2) {
		case 9:
			System.out.println(perrandomScore2 + "�� " + "A����");
			break;
		case 8:
			System.out.println(perrandomScore2 + "�� " + "B����");
			break;
		case 7:
			System.out.println(perrandomScore2 + "�� " + "C����");
			break;
		case 6:
			System.out.println(perrandomScore2 + "�� " + "D����");
			break;
		default:
			System.out.println(perrandomScore2 + "�� " + "F����");
			break;
		}
	}
}

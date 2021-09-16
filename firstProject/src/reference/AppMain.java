package reference;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {
		// ������� �Է��� �޾Ƽ� �л������� �迭�� ���� �м��ϴ� ���α׷� ����

		// �л��ο� �������, �л����� �������, ��ü����Ʈ, �м�:���,�ְ���,�ּ���, ����.
		int[] scores = null;
		while (true) {
			showMenu();
			int choice = readInt("��ȣ�� �����ϼ���>>");

			if (choice == 1) {
				int size = createStudents();
				scores = new int[size];

			} else if (choice == 2) {
				inputValue(scores);

			} else if (choice == 3) {
				showList(scores);

			} else if (choice == 4) {
				analysis(scores);
			} else if (choice == 5) {
				break;
			}
		}
		System.out.println("��.");
	}

	public static void showMenu() {
		System.out.println("1: �л��ο� �������, 2: �л����� �Է±��, 3: ��ü����Ʈ, 4: �м�:���,�ְ��� 5: ����.");
	}

	public static int createStudents() {
		int cnt = readInt("�л����� �Է��ϼ���.");
		return cnt;
	}

	public static void inputValue(int[] ary) {
		if (ary == null) {
			System.out.println("���� �л����� �����ϼ���.");
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readInt("�л������� �Է��ϼ���");
		}
	}

	public static void showList(int[] ary) {
		if (ary == null) {
			System.out.println("���� �л����� �����ϼ���.");
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			// scores[0] => 88
			System.out.printf("scores[%d} => %d\n", i, ary[i]);
		}
	}

	public static void analysis(int[] ary) {
		// ���, �ְ��� =>�ܼ�.
		if (ary == null) {
			System.out.println("���� �л����� �����ϼ���.");
			return;
		}
		int max = 0;
		int avg = 0;
		boolean isfake = false;

		for (int i = 0; i < ary.length; i++) {
			isfake = max < ary[i];
			if (isfake) {
				max = ary[i];
			}
			avg = max / ary.length;
		}
		System.out.printf("�ִ�����:%d , �������:%d\n", max, avg);

	}

	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;

	}
}

package reference;

import java.util.Scanner;

public class MainExecute {

	public static void main(String[] args) {
	
		String[] man = null;
		while (true) {
			showMenu();
			int choicenu = readInt("��ȣ�� �����ϼ���.");

			if (choicenu == 1) {
				int size = createStudents();
				man = new String[size];

			} else if (choicenu == 2) {
				inputValue(man);

			} else if (choicenu == 3) {
				showList(man);

			} else if (choicenu == 4) {
				break;
			}
		}
		System.out.println("�����ϼ̽��ϴ�.");
	}

	public static void showMenu() {
		System.out.println("1: �л��� ����Դϱ�?, 2: �л��̸��� �����Դϱ�, 3: ��ü����Ʈ, 4: ����.");
	}

	public static int createStudents() {
		int cnt = readInt("�л����� �Է��ϼ���.");
		return cnt;
	}

	public static void inputValue(String[] ary) {
		if (ary == null) {
			System.out.println("���� �л����� �����ϼ���.\n");
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readStirng("�л� �̸��� �Է��ϼ���");
		}
	}

	public static void showList(String[] ary) {
		if (ary == null) {
			System.out.println("���� �л����� �����ϼ���.");
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			System.out.printf("%d�л��� �̸��� %s\n", i, ary[i]);
		}
	}
	
	public static String readStirng(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		String menu = scn.nextLine();
		return menu;
		
	}
	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;

	}

}
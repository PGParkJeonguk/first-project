package reference;

import java.util.Scanner;

public class MainExecute {

	public static void main(String[] args) {
		// �迭����
		// 1. �л������� 2.�л��̸��Է� 3.��� 4.����
		String[] names = null;
		while (true) {
			showmenu();
		String choice = readString("��ȣ�� �����ϼ���");
		}
	}
	public static void showmenu() {
		System.out.println("1. �л������� 2.�л��̸��Է� 3.��� 4.����");
	}
	
	public static String readString(String msg) {
		Scanner scn = new Scanner(System.in);
		if(msg.equals("����")) {
			scn.close();
			return "";
		}else {
		String choice = scn.nextLine();
		return choice;
		}
	}
	
}

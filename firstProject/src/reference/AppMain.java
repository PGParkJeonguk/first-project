package reference;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {
		// ������� �Է��� �޾Ƽ� �л������� �迭�� ���� �м��ϴ� ���α׷� ����

		// �л��ο� �������, �л����� �������, ��ü����Ʈ, �м�:���,�ְ���,�ּ���, ����.

		int scores[] = null;
		while (true) {
			showmenu();
			int choose = readint("��ȣ�� �����ϼ���.");

			if (choose == 1) {
				int size = readint("�л��� ����ΰ���.");
				scores = new int[size];
			}else if (choose == 2) {
				inputValue(scores);
			}else if(choose == 3) {
				showList(scores);
			}else if(choose == 4) {
				analyze(scores);
			}else if(choose == 5)
				break;
		}
		System.out.println("����");

	}

	public static void showmenu() {
		System.out.println("1.�л��ο� �������, 2.�л����� �������, 3.��ü����Ʈ, 4.�м�:���,�ְ��� 5.����.");
	}

	public static void inputValue(int[] ary) {
		if(ary == null) {
			System.out.println("�л����� ���� �Է��Ͻÿ�");
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readint("�л� ������ �Է��ϼ���");
		}
	}
	
	public static void showList(int[]ary) {
		if(ary == null) {
			System.out.println("�л����� ���� �Է��Ͻÿ�");
			return;
		}
		for(int i = 0; i < ary.length; i++) {
			System.out.printf("������ %d => % d\n", i, ary[i]);
		}
	}
	
	public static void analyze(int[]ary) {
		if(ary == null) {
			System.out.println("�л����� ���� �Է��Ͻÿ�");
			return;
		}
		int max = 0;
		int avg = 0;
		int sum = 0;
		boolean isfake = false;
		for(int i = 0; i < ary.length; i++) {
			sum += ary[i];
			isfake = max < ary[i];
			if (isfake) {
				max = ary[i];
			}
			avg = sum / ary.length;
		}
		System.out.printf("�ִ�����:%d , �������:%d\n", max, avg);
	}

	public static int readint(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;
	}

}

package reference;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {
		// 사용자의 입력을 받아서 학생점수를 배열에 놓고 분석하는 프로그램 제작

		// 학생인원 지정기능, 학생점수 지정기능, 전체리스트, 분석:평균,최고점,최소점, 종료.
		int[] scores = null;
		while (true) {
			showMenu();
			int choice = readInt("번호를 선택하세요>>");

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
		System.out.println("끝.");
	}

	public static void showMenu() {
		System.out.println("1: 학생인원 지정기능, 2: 학생점수 입력기능, 3: 전체리스트, 4: 분석:평균,최고점 5: 종료.");
	}

	public static int createStudents() {
		int cnt = readInt("학생수를 입력하세요.");
		return cnt;
	}

	public static void inputValue(int[] ary) {
		if (ary == null) {
			System.out.println("먼저 학생수를 지정하세요.");
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readInt("학생점수를 입력하세요");
		}
	}

	public static void showList(int[] ary) {
		if (ary == null) {
			System.out.println("먼저 학생수를 지정하세요.");
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			// scores[0] => 88
			System.out.printf("scores[%d} => %d\n", i, ary[i]);
		}
	}

	public static void analysis(int[] ary) {
		// 평균, 최고점 =>콘솔.
		if (ary == null) {
			System.out.println("먼저 학생수를 지정하세요.");
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
		System.out.printf("최대점수:%d , 평균점수:%d\n", max, avg);

	}

	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;

	}
}

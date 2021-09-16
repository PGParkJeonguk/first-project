package reference;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {
		// 사용자의 입력을 받아서 학생점수를 배열에 놓고 분석하는 프로그램 제작

		// 학생인원 지정기능, 학생점수 지정기능, 전체리스트, 분석:평균,최고점,최소점, 종료.

		int scores[] = null;
		while (true) {
			showmenu();
			int choose = readint("번호를 선택하세요.");

			if (choose == 1) {
				int size = readint("학생은 몇명인가요.");
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
		System.out.println("종료");

	}

	public static void showmenu() {
		System.out.println("1.학생인원 지정기능, 2.학생점수 지정기능, 3.전체리스트, 4.분석:평균,최고점 5.종료.");
	}

	public static void inputValue(int[] ary) {
		if(ary == null) {
			System.out.println("학생수를 먼저 입력하시오");
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readint("학생 점수를 입력하세요");
		}
	}
	
	public static void showList(int[]ary) {
		if(ary == null) {
			System.out.println("학생수를 먼저 입력하시오");
			return;
		}
		for(int i = 0; i < ary.length; i++) {
			System.out.printf("점수는 %d => % d\n", i, ary[i]);
		}
	}
	
	public static void analyze(int[]ary) {
		if(ary == null) {
			System.out.println("학생수를 먼저 입력하시오");
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
		System.out.printf("최대점수:%d , 평균점수:%d\n", max, avg);
	}

	public static int readint(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;
	}

}

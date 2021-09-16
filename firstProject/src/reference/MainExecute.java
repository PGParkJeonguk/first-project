package reference;

import java.util.Scanner;

public class MainExecute {

	public static void main(String[] args) {
	
		String[] man = null;
		while (true) {
			showMenu();
			int choicenu = readInt("번호를 선택하세요.");

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
		System.out.println("수고하셨습니다.");
	}

	public static void showMenu() {
		System.out.println("1: 학생은 몇명입니까?, 2: 학생이름은 무엇입니까, 3: 전체리스트, 4: 종료.");
	}

	public static int createStudents() {
		int cnt = readInt("학생수를 입력하세요.");
		return cnt;
	}

	public static void inputValue(String[] ary) {
		if (ary == null) {
			System.out.println("먼저 학생수를 지정하세요.\n");
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readStirng("학생 이름을 입력하세요");
		}
	}

	public static void showList(String[] ary) {
		if (ary == null) {
			System.out.println("먼저 학생수를 지정하세요.");
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			System.out.printf("%d학생의 이름은 %s\n", i, ary[i]);
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
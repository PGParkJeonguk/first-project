package reference;

import java.util.Scanner;

public class MainExecute {

	public static void main(String[] args) {
		// 배열선언
		// 1. 학생수지정 2.학생이름입력 3.출력 4.종료
		String[] names = null;
		while (true) {
			showmenu();
		String choice = readString("번호를 선택하세요");
		}
	}
	public static void showmenu() {
		System.out.println("1. 학생수지정 2.학생이름입력 3.출력 4.종료");
	}
	
	public static String readString(String msg) {
		Scanner scn = new Scanner(System.in);
		if(msg.equals("종료")) {
			scn.close();
			return "";
		}else {
		String choice = scn.nextLine();
		return choice;
		}
	}
	
}

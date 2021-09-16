package control;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		String name = "박정욱";
		String age = "28";
		String phone = "010 6694 6648";
				
		Scanner scn = new Scanner(System.in);
		// 사용자의 Scanner 사용
		// 1 => 이름, 2=> 나이, 3=> 연락처, 4=>반복문종료
		while(true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1.이름 2.나이 3.연락처 4.종료");
			
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.println(name);
			}else if(menu == 2) {
				System.out.println(age);
			}else if(menu == 3) {
				System.out.println(phone);
			}else if(menu == 4) {
				break;
			}
		}
			System.out.println("종료");
	}
}
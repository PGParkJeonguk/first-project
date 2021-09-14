package firstProject;
import java.util.Scanner;

public class ParkJeongUk {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		System.out.println(num1+num2);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("영어성적을 입력하세요.");
		int english = scn.nextInt();
		scn.nextLine();
		System.out.println("역사성적을 입력하세요.");
		int history = scn.nextInt();
		scn.nextLine();
		System.out.println("수학성적을 입력하세요.");
		int math = scn.nextInt();
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		scn.nextLine();
		
		System.out.printf("%s님의, 총합성적은 %d, 평균은 %d 입니다.",name , english+history+math, (english+history+math)/3);
	}
}

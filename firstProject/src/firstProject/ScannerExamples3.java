package firstProject;
import java.util.Scanner;

public class ScannerExamples3 {
	public static void main(String[] args) {
		//영어점수입력:
		//수학점수입력:
		//이름입력:
		//홍길동님의 영어, 수학점수의 합은 ? 평균은 ?
		
		Scanner scn = new Scanner(System.in);
		System.out.println("영어점수를 입력하세요.");
		int english = scn.nextInt();
		scn.nextLine();
		System.out.println("수학점수를 입력하세요.");
		int math = scn.nextInt();
		scn.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		
		System.out.printf("%s님의, 영어, 수학점수의 합은 %d 입니다. 평균은 %d입니다.%n",name , english+math ,(math+english)/2);
		
		Boolean pass = math+english >=120;
		
		if(pass) {
			System.out.println(name+"님은 합격하였습니다.");
		}else {
			System.out.println(name+"님은 불합격하였습니다.");
		}
	}
}

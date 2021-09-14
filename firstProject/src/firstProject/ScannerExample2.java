package firstProject;
import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		// 변수: 사용자 입력(10, 20)
		// 10 + 20 = 30
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요...");
		int number1 = scn.nextInt();
		scn.nextLine();
		System.out.println("숫자를 입력하세요...");
		int number2 = scn.nextInt();
		System.out.println(number1 + number2);
		System.out.printf("%d + %d = %d%n", number1 ,number2, number1+number2);
		}
	}

package firstProject;
import java.util.Scanner;

public class ParkJeongUk {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		System.out.println(num1+num2);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �Է��ϼ���.");
		int english = scn.nextInt();
		scn.nextLine();
		System.out.println("���缺���� �Է��ϼ���.");
		int history = scn.nextInt();
		scn.nextLine();
		System.out.println("���м����� �Է��ϼ���.");
		int math = scn.nextInt();
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scn.nextLine();
		scn.nextLine();
		
		System.out.printf("%s����, ���ռ����� %d, ����� %d �Դϴ�.",name , english+history+math, (english+history+math)/3);
	}
}

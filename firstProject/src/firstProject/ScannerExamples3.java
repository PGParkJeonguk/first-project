package firstProject;
import java.util.Scanner;

public class ScannerExamples3 {
	public static void main(String[] args) {
		//���������Է�:
		//���������Է�:
		//�̸��Է�:
		//ȫ�浿���� ����, ���������� ���� ? ����� ?
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ���.");
		int english = scn.nextInt();
		scn.nextLine();
		System.out.println("���������� �Է��ϼ���.");
		int math = scn.nextInt();
		scn.nextLine();
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scn.nextLine();
		
		System.out.printf("%s����, ����, ���������� ���� %d �Դϴ�. ����� %d�Դϴ�.%n",name , english+math ,(math+english)/2);
		
		Boolean pass = math+english >=120;
		
		if(pass) {
			System.out.println(name+"���� �հ��Ͽ����ϴ�.");
		}else {
			System.out.println(name+"���� ���հ��Ͽ����ϴ�.");
		}
	}
}

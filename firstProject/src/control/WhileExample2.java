package control;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		String name = "������";
		String age = "28";
		String phone = "010 6694 6648";
				
		Scanner scn = new Scanner(System.in);
		// ������� Scanner ���
		// 1 => �̸�, 2=> ����, 3=> ����ó, 4=>�ݺ�������
		while(true) {
			System.out.println("�޴��� �������ּ���.");
			System.out.println("1.�̸� 2.���� 3.����ó 4.����");
			
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
			System.out.println("����");
	}
}
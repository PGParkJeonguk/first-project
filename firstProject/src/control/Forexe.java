package control;

public class Forexe {
	public static void main(String[] args) {
		// 1~10 ��� ����
		int cnt = 0;
		for (int i = 1; i <= 10; i++) { // i = i+1 => i+=1;
			cnt += 1;
			System.out.println(cnt);
		}
		System.out.println("��1\n");

		// 1~10�߿��� 2 4 6 8 10
		int cnt1 = 0;
		for (int i = 1; i <= 10; i += 2) { // i = i+1 => i+=1;
			cnt1 += 2;
			System.out.println(cnt1);
		}
		System.out.println("��2\n");

		int cnt2 = 0;
		for (int i = 1; i <= 10; i += 2) { // i = i+1 => i+=1;
			cnt2 += 1;
			System.out.println(cnt2);
		}
		System.out.println("��3\n");
		

		int cnt3 = 0;
		for (int i = 1; i <= 10; i += 1) { // i = i+1 => i+=1;
			cnt3 += i;
		}
		System.out.println(cnt3);
		System.out.println("��4\n");

	}
}
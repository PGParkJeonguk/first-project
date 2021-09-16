package control;

public class Forexe {
	public static void main(String[] args) {
		// 1~10 출력 구문
		int cnt = 0;
		for (int i = 1; i <= 10; i++) {
			cnt += 1;
			System.out.println(cnt);
		}
		System.out.println("끝1\n");
		// 1~10중에서 2 4 6 8 10
		int cnt1 = 0;
		for (int i = 1; i <= 10; i += 2) {
			cnt1 += 2;
			System.out.println(cnt1);
		}
		System.out.println("끝2\n");
		// 1~10중에서 홀수
		int cnt2 = 1;
		for (int i = 1; i < 10; i += 2) {
			cnt2 += 2;
			System.out.println(cnt2);
		}
		System.out.println("끝3\n");
		// 1~10 다 더한값
		int cnt3 = 0;
		for (int i = 1; i <= 10; i += 1) {
			cnt3 += i;
		}
		System.out.println(cnt3);
		System.out.println("끝4\n");
	}
}
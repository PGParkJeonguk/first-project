package control;

public class DoWhileExe {
	public static void main(String[] args) {
		// 1 부터 10까지 출력
		// 끝1.

		int cnt = 0;
		do {
			cnt++;
			System.out.println(cnt);
			if (cnt >= 10) {
				break;
			}
		} while (true);
		System.out.println("끝.");

		// 짝수만 출력
		int cnt1 = 0;
		do {
			cnt1++;
			if (cnt1 % 2 == 1) {
				continue; // 다음순으로 skip하고 다음순번으로 간다.
			}
			System.out.println(cnt1);
			if (cnt1 >= 10) {
				break;
			}
		} while (true);
		System.out.println("끝2.\n");

		// 홀수만 합계
		int cnt2 = 0;
		int sum = 0;
		do {
			cnt2++;
			if (cnt2 % 2 == 0) {
				continue; // 다음순으로 skip하고 다음순번으로 간다.
			}
			if (cnt2 >= 10) {
				break;
			}
			sum += cnt2;
		} while (true);
		System.out.println(sum);
		System.out.println("끝3.");

		// 교수님 버젼
		int cnt3 = 0;
		int sum1 = 0;
		do {
			if (cnt3 >= 10) {
				break;
			}
			if (cnt3 % 2 == 0) {
				cnt3++;
				continue;
			}
			sum1 += cnt3++;
		} while (true);
		System.out.println("sum: " + sum1);
		System.out.println("끝4.");
	
	}
}

package control;

public class WhileExample { // Ƚ���� ������������ for, ������ while
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.printf("i�� ���� %d\n", i);
			i++;
		}

		Boolean run = true;
		int cnt = 0;
		while (run) {
			cnt = (int) (Math.random() * 10) + 1;
			System.out.println(cnt);
			if (cnt == 8) {
				run = false;
			}
			System.out.println("��.");
		}

		int cnt1 = 0;
		while (true) {
			cnt1 = (int) (Math.random() * 10) + 1;
			System.out.println(cnt1);
			if (cnt1 == 8) {
				break;
			}
			System.out.println("��.");
		}
	}
}
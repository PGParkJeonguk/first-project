package control;

public class DoWhileExe {
	public static void main(String[] args) {
		// 1 ���� 10���� ���
		// ��1.
		int cnt = 0;
		do {
			cnt++;
			System.out.println(cnt);
			if(cnt >= 10) {
				break;
			}
		}while(true);
		System.out.println("��.");
		
		// ¦���� ���
		int cnt1 = 0;
		do {
			cnt1+=1;
			if(cnt1 %2 == 0) {
				continue;
			}
				System.out.println(cnt1);
			if(cnt1 >= 10) {
				break;
			}
		}while(true);
		System.out.println("��.");
		
		// Ȧ���� �հ�
		
		int cnt2 = 0;
		int sum = 0;
		do {
			cnt2++;
			if(cnt2 %2 == 0) {
				continue;
			}
			if(cnt2 >= 10) {
				break;
			}
			sum += cnt2;
		}while(true);
		System.out.println(sum);
		System.out.println("��.");
		
		// ������ ����
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
		System.out.println("��4.");
		
	}
}

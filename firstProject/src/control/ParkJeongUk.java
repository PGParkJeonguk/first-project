package control;

public class ParkJeongUk {
	public static void main(String[] args) {
		int cnt2 = 0;
		int sum = 0;
		int sum1 = 0; 
		do {
			cnt2++;
			if (cnt2 % 2 == 0) {
				continue;
			}
			if (cnt2 >= 10) {
				break;
			}
			sum += cnt2;
		} while (true);
		System.out.println(sum);
		System.out.println("��1.");
		
		for(sum = sum; sum <= 100; sum += 1) {
			sum1 +=sum;
		}
		System.out.println(sum1);
		if(sum >= 10) {
			System.out.println("�����̴�");
		}else if(sum >= 20) {
			System.out.println("�Ʊ���");
		}else if (sum >= 30){
			System.out.println("�Ǽ��߳�?");
		}else {
			System.out.println("�����ߴ�");
		}
		System.out.println("��2.");
		
			

		
		
	}
	
}

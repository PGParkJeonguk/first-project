package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 1 ~ 10���� ������ ���� ����
		// �л��� 10���� �ִ�.
		int scores[] = new int[10];
		System.out.println(scores.length);
		for (int i = 0; i < scores.length; i++) {
			int temp = (int) ((Math.random() * 10) + 1);
			scores[i] = temp;
			System.out.printf("����Ȱ�[%d] => %d\n", i, scores[i]);
		}
		// scores �迭Ÿ��. scores[0]�� int Ÿ��.

		// ���
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] =>%d\n", i, scores[i]);
		}
		System.out.println("�� 1 ");
		
		scores = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		// �迭�� ����ִ� ��ҵ��� ��.
		int sum = 0;
		// �迭�� �հ� 55
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("�迭�� �հ�:" + sum);
		System.out.println("�� 2 ");
		
		// �迭�� ����� 5���� ū���� �հ�.
		int bigsum = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >5 ) {
				bigsum += scores[i];
			}
		}
		System.out.println("�迭�� ����� 5���� ū ���� �հ�:" + bigsum);
		
		// �迭�� ����� ¦����° ���� �հ�
		int sum2 = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] %2 == 0) {
				sum2 += scores[i];
			}
		}
		System.out.println("�迭�� ����� ¦����° ���� �հ�:" + sum2);
	}
}

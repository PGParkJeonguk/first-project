package reference;

public class MathodExample3 {

	public static void main(String[] args) {

		int[] intAry = { 30, 40, 50, 60, 70 };
		int sum = 0;
		for (int num : intAry) {
			sum += num;
		}
		System.out.println("��:" + sum);

		// �հ踦 ����ϴ� �޼ҵ�
		sum = 0;
		int[] intAry2 = { 30, 40 };
		sum = sumArray(intAry2);
		System.out.println("��:" + sum);

		// ����� ����ϴ� �޼ҵ�
		double avg = 0;
		avg = avgArray(intAry2);
		System.out.println("���:" + avg);
	}

	// �迭�� �Ű������� �Ͽ���
	public static int sumArray(int[] intAry) {
		int sum = 0;
		for (int num : intAry) {
			sum += num;
		}
		return sum;
	}

	// �迭�� �Ű������� -> ���.
	public static double avgArray(int[] intAry) {
		int sum1 = 0;
		double avg = 0;
		for (int num : intAry) {
			sum1 += num;
		}
		avg = sum1 / intAry.length;
		return avg;
		
		
		// �迭�� �Ű������� -> ���. avgArray()
//	public static double avgArray(int[] intAry) {
//		int sum = sumArray(intAry);
//		double avg = (double) sum / intAry.length;
//		return avg;
//	}
		
	}

}

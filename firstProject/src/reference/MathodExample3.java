package reference;

public class MathodExample3 {

	public static void main(String[] args) {

		int[] intAry = { 30, 40, 50, 60, 70 };
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("�հ�: " + sum);
		
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
	
		public static int sumArray(int[]intAry) {
			int sum = 0;
			for(int num : intAry) {
				sum += num;
			}
			return sum;
		}
		
		public static int avgArray(int[]intAry) {
			int sum = 0;
			int avg = 0;
			for(int num : intAry) {
				sum += num;
			}
			avg = sum / intAry.length;
			return avg;
		}
		// �迭�� �Ű������� -> ���. avgArray()
//		public static double avgArray(int[] intAry) {
//			int sum = sumArray(intAry);
//			double avg = (double) sum / intAry.length;
//			return avg;
//		}
}

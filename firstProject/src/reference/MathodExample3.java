package reference;

public class MathodExample3 {

	public static void main(String[] args) {

		int[] intAry = { 30, 40, 50, 60, 70 };
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("합계: " + sum);
		
		// 합계를 계산하는 메소드
		sum = 0;
		int[] intAry2 = { 30, 40 };
		sum = sumArray(intAry2);
		System.out.println("합:" + sum);
		// 평균을 계산하는 메소드
		double avg = 0;
		avg = avgArray(intAry2);
		System.out.println("평균:" + avg);
		
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
		// 배열을 매개변수로 -> 평균. avgArray()
//		public static double avgArray(int[] intAry) {
//			int sum = sumArray(intAry);
//			double avg = (double) sum / intAry.length;
//			return avg;
//		}
}

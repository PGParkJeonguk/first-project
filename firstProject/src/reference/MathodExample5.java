package reference;

public class MathodExample5 {
	public static void main(String[] args) {
		int[] scores = { 88, 67, 92, 73, 58 };
		// �ּҰ��� ���ϴ� �ڵ�.
		int minVal = 2147483647;
		boolean isTrue = false;

		for (int i = 0; i < scores.length; i++) {
			isTrue = minVal > scores[i];
			if (isTrue) {
				minVal = scores[i];
			}
		}
		System.out.println("�ּҰ�: " + minVal);
		System.out.println("��1.");
		
		int[] happyAry = { 55, 82, 34, 19, 18, 89 };
		minVal = getMinValue(happyAry);
		System.out.println("�ּҰ�: " + minVal);
		System.out.println("��2.");
	}

	public static int getMinValue(int[] ary) {
		int minVal = 2147483647;
		boolean isTrue = false;

		for (int i = 0; i < ary.length; i++) {
			isTrue = minVal > ary[i];
			if (isTrue) {
				minVal = ary[i];
			}
		}
		return minVal;
	}
}

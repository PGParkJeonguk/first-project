package reference;

public class MathodExample5 {
	public static void main(String[] args) {
		int[] scores = { 88, 67, 92, 73, 58 };
		// �ּҰ��� ���ϴ� �ڵ�
		int minValue = 2147483647;
		boolean isTrue = false;

		for (int i = 0; i < scores.length; i++) {
			if (isTrue) {
				minValue = scores[i];
			}
		}
		System.out.println("�ּҰ�: " + minValue);
		System.out.println("��1.");

		int[] happyAry = { 55, 82, 34, 19, 18, 89 };
		minValue = getMinValue(happyAry);
		System.out.println("�ּҰ�: " + minValue);
		System.out.println("��2.");
	}

	public static int getMinValue(int[] Ary) {
		int minValue = 2147483647;
		boolean isTrue = false;

		for (int i = 0; i < Ary.length; i++) {
			if (isTrue) {
				minValue = Ary[i];
			}
		}
		return minValue;
	}
}

package reference;

public class MethodExample4 {
	public static void main(String[] args) {
		int[] scores = { 88, 67, 92, 73, 58 };
		// �ִ밪 ���غ���.
		int maxValue = 0;
		boolean isTrue = false;
		
		for(int i =0 ; i < scores.length; i++){
			isTrue = maxValue < scores[i];
			if(isTrue) {
				maxValue = scores[i];
			}
		}
		System.out.println("�ִ밪: " + maxValue);
		System.out.println("�� 1");
		
		
		int[] anotherAry = { 55, 82, 34, 19, 47, 89 };
		maxValue = getMaxValue(anotherAry);
		System.out.println("�ִ밪: " + maxValue);
		System.out.println("�� 2");
	}
	
	public static int getMaxValue(int[] ary) {
		int maxValue = 0;
		boolean isTrue = false;
		
		for(int i =0 ; i < ary.length; i++){
			isTrue = maxValue < ary[i];
			if(isTrue) {
				maxValue = ary[i];
			}
		}
		return maxValue;
	}
	
}

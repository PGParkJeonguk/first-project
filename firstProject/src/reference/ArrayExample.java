package reference;

public class ArrayExample {
	public static void main(String[] args) {
		// �л� 30��
		// int s1 ~s30;
		// int num, String str;
		int[] intAry = {1,2,3,4,5};
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		
		System.out.println("=======�ٽ�======");
		
		intAry[0] = 6;
		intAry[1] = 7;
		intAry[2] = 8;
		intAry[3] = 9;
		intAry[4] = 10;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
		}
		
		byte[] byteAry = {1, 2, 3};
		for(int i=0; i<3; i++) {
			System.out.println("byte�迭: "+ byteAry[i]);
		}
		
		String[] strAry = {"Hello", "World", "Nice"};
		for(int i  = 0; i<3; i++) {
			System.out.println("Stirng�迭: " + strAry[i]);
		}
		//String�� ���ڿ��� , int�� ������!
		strAry = new String[] {"Hong","kim","Park"};
		for(int i  = 0; i<3; i++) {
			System.out.println("Stirng�迭: " + strAry[i]);
		}
		//�ٸ����� ������ ����ó�� �Ѵ�.
		
		double[] dblAry;
		dblAry = new double[] {1, 2.3, 5};
		
		System.out.println("=======float�迭======");
		float[] fltAry = new float[5]; // {0F, 0F, 0F, 0F, 0F} = �ʱⰪ
		for(int i=0; i < fltAry.length; i++) {
			System.out.println(fltAry[i]);
		}
		
	}
}
package reference;

public class ArrayExample {
	public static void main(String[] args) {
		// 학생 30명
		// int s1 ~s30;
		// int num, String str;
		int[] intAry = {1,2,3,4,5};
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		
		System.out.println("=======다시======");
		
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
			System.out.println("byte배열: "+ byteAry[i]);
		}
		
		String[] strAry = {"Hello", "World", "Nice"};
		for(int i  = 0; i<3; i++) {
			System.out.println("Stirng배열: " + strAry[i]);
		}
		//String은 문자열만 , int는 정수만!
		strAry = new String[] {"Hong","kim","Park"};
		for(int i  = 0; i<3; i++) {
			System.out.println("Stirng배열: " + strAry[i]);
		}
		//다른값을 담을때 위에처럼 한다.
		
		double[] dblAry;
		dblAry = new double[] {1, 2.3, 5};
		
		System.out.println("=======float배열======");
		float[] fltAry = new float[5]; // {0F, 0F, 0F, 0F, 0F} = 초기값
		for(int i=0; i < fltAry.length; i++) {
			System.out.println(fltAry[i]);
		}
		
	}
}

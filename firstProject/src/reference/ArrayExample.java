package reference;

public class ArrayExample {
	public static void main(String[] args) {
		// �л� 30��
		// int s1 ~s30;
		// int num, String str;
		int [] Ary = {1,2,3,4,5};
		System.out.println(Ary[0]);
		System.out.println(Ary[1]);
		System.out.println(Ary[2]);
		System.out.println(Ary[3]);
		System.out.println(Ary[4]);
		
		System.out.println("=======�ٽ�======");
		
		//intAry[0] = 6;
		//intAry[1] = 7;
		//intAry[2] = 8;
		//intAry[3] = 9;
		//intAry[4] = 10;
		
		for(int i = 0; i<5; i++) {
			System.out.println(Ary[i]);
		}
		System.out.println("=======�ٽ�======");
		
		byte[] byteAry = {1,2,3};
		for(int i = 0; i<3 ; i++) {
			System.out.println(byteAry[i]);
		}
		System.out.println("=======�ٽ�======");
		
		String[] strAry = {"A" , "B", "C" };
		for(int i =0; i<3 ; i++) {
			System.out.println(strAry[i]);
		}
		System.out.println("=======�ٽ�======");
		
		strAry = new String[] {"Hong","kim","Park"};
		for(int i = 0; i<3; i++) {
			System.out.println(strAry[i]);
		}
		
		double[] dblAry;
		dblAry = new double[] {1, 2.3, 5};
		
		System.out.println("=======float�迭======");
		float[] fltAry = new float[5]; // {0F, 0F, 0F, 0F, 0F} = �ʱⰪ
		for(int i=0; i < fltAry.length; i++) {
			System.out.println(fltAry[i]);
		}
	}
}

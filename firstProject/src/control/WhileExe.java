package control;

public class WhileExe {
	public static void main(String[] args) {
		
		// while 구문을 사용해서 1 ~ 10까지 출력
		int i = 0;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("==============끝1");
		//while 구문을 사용해서 10까지 짝수 출력
		int i2 = 2;
		while(i2 <=10) {
			System.out.println(i2);
			i2 += 2;
		}
		
		System.out.println("==============끝2");
		//while 구문을 사용해서 10까지 홀수 출력
		int i3 = 1;
		while(i3 <=10) {
			System.out.println(i3);
			i3 += 2;
		}

		System.out.println("==============끝3");
		//while 구문을 사용해서 1~10까지 모든 더한 값
		int i4 =0;
		int sum = 0;
		while(i4 <=10) {
			sum = sum + i4;
			i4++;
		}
		System.out.println(sum);
		
		System.out.println("==============끝4");
	}
}

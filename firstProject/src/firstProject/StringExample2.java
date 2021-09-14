package firstProject;

public class StringExample2 {
	public static void main(String[] args) {
		String name = "박정욱";
		int age = 28;
		
		// 이름은 박정욱, 나이는 28
		System.out.println("이름은 " + name + " 나이는 " + age + "살");
		System.out.printf("이름은 %s,나이는 %d살", name, age);
		
		//b1(byte) = 100
		//b2(byte) = 10;
		//result = b1 + b2의 합
		//100 + 10 =110 콘솔에 출력
		//result > 0
		
		byte b1 = -90;
		byte b2 = 10;
		int result = (int)(b1+b2);
		
		System.out.println(result);
		
		if(result > 0) {
			System.out.println("양수이다");
		}else {
			System.out.println("음수이다");
		}
		
		// 2200000000, 120, 16
		int number1 = 78;
		long number2 = 2200000000L;
		int number3 = 8;
		
		long avg = (number1 + number2 + number3)/3;
		System.out.println(avg);
		
		double avg2 = number1/(double)number3;
		System.out.println(avg2);
	}

}

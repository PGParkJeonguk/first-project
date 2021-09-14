package firstProject;

public class VariableExample {
	public static void main(String[] args) {
		int number1 = 10; // 변수 <--> 상수
		number1 = 20;
		number1 = 30;
		System.out.println("결과: " + number1);
		
		int number3 = 90;
		int result;
		final int number2 = 20;
//		number2 = 30; 이건 상수이기 때문에 에러떠서 주석처리함
		//데이터를 받을 수 있는 범위 byte < shor < int < long < float <double
		result = number1 + number2;
		double result1 = number3 / 20.0;
		
		System.out.println("결과값:" + result1);
		
	}
}

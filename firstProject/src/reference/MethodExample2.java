package reference;

public class MethodExample2 {

	public static void main(String[] args) {

		sum(24, 55); // 메소드 실행(값)
		int a = 45, b = 77;
		sum(a, b);

		multi(35, 88);

		getArea(3.5);

		int res = getMAX(a, b);
		System.out.println("큰수는 : " + res);

		System.out.println("나눈값 : " + divide(17, 3));
	}

	// 두 정수를 입력받아서 두 수의 합을 console 출력
	// 메소드 정의(type)
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("두수의 합: " + sum);
	}

	// 두 정수를 입력받아서 두 수의 곱을 console 출력
	public static void multi(int i1, int i2) {
		int multi = i1 * i2;
		System.out.println("두수의 합: " + multi);
	}

	// 정사각형 너비를 계산해주는 메소드.
	public static void getArea(double side) {
		double Anw = side * side;
		System.out.println("정사각형의 넓이: " + Anw);
	}

	// 두수중에서 큰 값을 반환해주는 메소드. (반환은 return)
	public static int getMAX(int num1, int num2) {
		int result = (num1 >= num2) ? num1 : num2;
		return result;
	}

	// 두 정수를 입력받아서 첫번째 값을 두번째값으로 나눈 결과를 반환해주는 메소드
	public static double divide(int a, int b) {
		return (double) a / b;
	}

}

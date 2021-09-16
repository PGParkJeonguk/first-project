package control;

public class ConditionExe {
	public static void main(String[] args) {

		// if구문연습
		// 두 정수 60 , 70
		// 두 수를 합한 결과 100점을 넘어서면 합격, 못넘어서면 불합격
		// 끝. 출력

		int A = 3;
		int B = 5;

		if (A + B >= 100) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

		// 두수를 곱해서 짝수이면 짝수, 홀수이면 홀수
		// 2번째 끝
		int suv = A * B;

		if (suv % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

		// 2의 배수이면 2의 배수, 3의 배수이면 3의 배수 , 2와 3의 배수이면 2와3의 배수
		int sub = 9;
		if (sub % 2 == 0 && sub % 3 == 0) {
			System.out.println("2와 3의 배수");
		} else if (sub % 2 == 0) {
			System.out.println("2의 배수");
		} else if (sub % 3 == 0) {
			System.out.println("3의 배수");
		}

		// switch조건문 -> (1~6중에)1이 나왔습니다.

		int random = (int) (Math.random() * 6) + 1;
		System.out.println(random);

		switch (random) {
		case 1:
		case 3:
		case 6:
			System.out.println(random + "이 나왔습니다.");
			break;
		case 2:
		case 4:
		case 5:
			System.out.println(random + "가 나왔습니다.");
			break;
		}
		System.out.println("끝!");

		// 5번 if에서 학점문제
		int random2 = (int) (Math.random() * 100);
		System.out.println(random2 + "점");

		if (random2 >= 90) {
			System.out.println("A학점입니다.");
		} else if (random2 >= 80) {
			System.out.println("B학점입니다.");
		} else if (random2 >= 70) {
			System.out.println("C학점입니다.");
		} else if (random2 >= 60) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}

		System.out.println("5번 끝");
		System.out.println("--------------------------");
		System.out.println("6번 switch 구문");
		int random3  = (int) (Math.random() * 100);
		int perrandom = random3 % 10;

		switch (perrandom) {
		case 9:
			System.out.println(perrandom + "점" + "A학점입니다.");
			break;
		case 8:
			System.out.println(perrandom + "점" + "B학점입니다.");
			break;
		case 7:
			System.out.println(perrandom + "점" + "C학점입니다.");
			break;
		case 6:
			System.out.println(perrandom + "점" + "D학점입니다.");
			break;
		default:
			System.out.println(perrandom + "점" + "F학점입니다.");
			break;
		}
	}
}

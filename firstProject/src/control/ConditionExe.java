package control;

public class ConditionExe {
	public static void main(String[] args) {

		// if구문연습
		// 두 정수 60 , 70
		// 두 수를 합한 결과 100점을 넘어서면 합격, 못넘어서면 불합격
		// 끝. 출력

		int A = 60;
		int B = 70;

		int sum = A + B;

		if (sum > 100) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// 두수를 곱해서 짝수이면 짝수, 홀수이면 홀수
		// 2번째 끝

		int suv = A * B;

		if (suv % 2 == 1) {
			System.out.println("짝수");
		} else
			System.out.println("홀수");

		// 2의 배수이면 2의 배수, 3의 배수이면 3의 배수 , 2와 3의 배수이면 2와3의 배수

		int subValue = 12;
		if (subValue % 2 == 0 && subValue % 3 == 0) {
			System.out.println("2와 3의 배수");
		} else if (subValue % 3 == 0) {
			System.out.println("3의 배수");
		} else if (subValue % 2 == 0) {
			System.out.println("2의 배수");
		}

		int randomValue = (int) (Math.random() * 6) + 1;
		System.out.println(randomValue);

		// switch조건문 -> 1이 나왔습니다.

		switch (randomValue) {
		case 1:
		case 3:
		case 6:
			System.out.println(randomValue + "이 나왔습니다.");
			break;
		case 2:
		case 4:
		case 5:
			System.out.println(randomValue + "가 나왔습니다.");
			break;
		}
		System.out.println("끝");

		// 5번 if에서 학점문제
		System.out.println("5번 if 구문");
		int randomScore = (int) (Math.random() * 100);

		System.out.println(randomScore + "점");

		if (randomScore >= 90) {
			System.out.println("A학점");
		} else if (randomScore >= 80) {
			System.out.println("B학점");
		} else if (randomScore >= 70) {
			System.out.println("C학점");
		} else if (randomScore >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		System.out.println("5번 끝");
		System.out.println("--------------------------");
		System.out.println("6번 switch 구문");
		int randomScore2 = (int) (Math.random() * 100);
		int perrandomScore2 = randomScore2 % 10;

		System.out.println(perrandomScore2);

		switch (perrandomScore2) {
		case 9:
			System.out.println(perrandomScore2 + "점 " + "A학점");
			break;
		case 8:
			System.out.println(perrandomScore2 + "점 " + "B학점");
			break;
		case 7:
			System.out.println(perrandomScore2 + "점 " + "C학점");
			break;
		case 6:
			System.out.println(perrandomScore2 + "점 " + "D학점");
			break;
		default:
			System.out.println(perrandomScore2 + "점 " + "F학점");
			break;
		}
	}
}

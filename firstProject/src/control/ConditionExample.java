package control;

public class ConditionExample {
	public static void main(String[] args) {
		int Score = 70;

		if (Score >= 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		// 90이상 A, 80이상 B, 70이상 C, 60이상 D 그외 F
		// 많은수의 가능성중 한가지만 해야하는 경우
		if (Score >= 90) {
			System.out.println("A학점입니다.");
		}else if(Score >= 80){
			System.out.println("B학점입니다.");
		}else if(Score >= 70){
			System.out.println("C학점입니다.");
		}else if(Score >= 60){
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
		
		System.out.println("끝.");
		
		//많은수의 가능성을 한꺼번에 처리해야하는 경우
		if(Score >= 90) {
			System.out.println("A학점입니다.");
		}if(Score >= 80) {
			System.out.println("B학점입니다.");
		}if(Score >= 70) {
			System.out.println("C학점입니다.");
		}if(Score >= 60) {
			System.out.println("D학점입니다.");
		}if(Score < 60 ) {
			System.out.println("F학점입니다.");
		}
		System.out.println("끝.");
	}
}
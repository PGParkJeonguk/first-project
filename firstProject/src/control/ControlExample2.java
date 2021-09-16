package control;

public class ControlExample2 {
	public static void main(String[] args) {
		// A = 참잘했어요 B= 잘했어요, C= 보통입니다. D="노력하세요" F="실망입니다."
		// switch문을 이용해서 만들어라.
		String input = "B";
		switch(input) {
		case "A":
			System.out.println("참잘했어요");
			break;
		case "B":
			System.out.println("잘했어요");
			break;
		case "C":
			System.out.println("보통입니다");
			break;
		case "D":
			System.out.println("노력하세요");
			break;
		case "F":
			System.out.println("실망입니다.");
			break;
		default:
			System.out.println("너는 자유의 몸이 아니야");
			break;
			}
		//switch 구문을 이용해서 A,B,C는 pass D는 "retry", F는 "Fail"를 만들어라
		
		switch(input) {
		case "A":
		case "B":
		case "C":
			System.out.println("Pass");
			break;
		case "D":
			System.out.println("retry");
			break;
		case "F":
			System.out.println("Fail");
			break;
		default:
			System.out.println("이것은 불장난!");
			break;
		}
		
	}
}

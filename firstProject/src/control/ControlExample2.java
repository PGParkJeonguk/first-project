package control;

public class ControlExample2 {
	public static void main(String[] args) {
		String inputValue = "A";
		
		switch(inputValue) {
		case "A":
			System.out.println("�����߾��");
			break;
		case "B":
			System.out.println("���߾��");
			break;
		case "C":
			System.out.println("�����Դϴ�");
			break;
		case "D":
			System.out.println("����ϼ���");
			break;
			default:
				System.out.println("�Ǹ��Դϴ�");
		}
		
		//
		switch(inputValue) {
		case "A":
		case "B":
		case "C":
			System.out.println("Pass");
			break;
		case "D":
			System.out.println("retry");
			break;
		default:
			System.out.println("Fail");
		}
	}
}
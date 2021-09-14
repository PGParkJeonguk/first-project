package firstProject;

public class VariableExample2 {

	public static void main(String[] args) {
		// 이름, 나이, 참/거짓
		int age = 25;
		String name = "박정욱";
		int myage = 23;
		boolean whoage;
		whoage = age <= myage;
		
		if(whoage) {
			System.out.println(name + "은" + age + "이상입니다." );
		}
		
		
		whoage = age > myage;
		if(whoage) {
			System.out.println(name + "은" + age + "이하입니다." );
		}
		
		// age < 나이 => 25세 이상
	
		// age > 나이 => 25세 이하
		
		System.out.println("end of program");
	}

}

package firstProject;

public class StringExample {
	public static void main(String[] args) {
		int age = 20;
		String name = "홍길동";
		
		long myAge = age;  //자동형변환(promotion)
		age = (int) myAge;  //강제형변환(casting)
		
		
//		age = "박정욱";
//		name = 20;
		System.out.println(name + "의 나이는 " + age);
		
		String myname = "박정욱";
		int myage = 28;	
			
		System.out.println( myname + "의 나이는 " + myage + "입니다");
	}
}

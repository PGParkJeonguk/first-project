package firstProject;

public class CharExample {
	public static void main(String[] args) {
		// int=정수, String=문자열, boolean=참/거짓, char=캐릭타입(정수형)
		// byte(1byte) < char, short(2byte) < int(4byte) < long(8byte)
		char myFirstCharType = 97;
		
		System.out.println(myFirstCharType);
		
		byte b1 = 10;		// 1byte(8bit) || 
		// 0 0 0 0 0 0 0 0 => 1byt
		// 2*8 => 256가지. (-128 ~ +127)
		//
		b1 =127;
		b1++; // b1 = b1 + 1;
		System.out.println(b1);
		
		short s1 = 0;
		//short = -32768 ~ 32767 까지
		int result = (int)(b1 + s1); // short + short
		System.out.println(Integer.MAX_VALUE);
		//정수는 그냥 int type으로
		
		long fakelong = 214748364L;
		
		
		
	}
}

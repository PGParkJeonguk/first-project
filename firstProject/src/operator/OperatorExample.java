package operator;

public class OperatorExample {
	public static void main(String[] args) {
		 // +, -, *, /, %=나머지, &(논리곱연산자), |(논리합연산) , ^(배타적논리합), ~(마스트) 연산자를 사용하면 int타입으로 변한다.
		int num1, num2, result; //한꺼번에 선언할때 이렇게 해도 된다.
		num1 = 10;
		num2 = 5;
		
//		result = num2 =num1;
		
		result = num1 *num2; // 할당(대입)연산자 = 				오른쪽부터 처리한다.
		//num1 * num2 = result; => 얘는 계산 안됨 
		result = -result;
		System.out.printf("-연산열과: %d\n",result);
		
		result = num1 % 3;
		System.out.printf("연산열과: %d\n",result);
		
		result = num1 & num2;
		System.out.printf("& 연산열과: %d\n",result);
		
		result = num1 | num2;
		System.out.printf("| 연산열과: %d\n",result);
		
		result = num1 ^ num2;
		System.out.printf("^ 연산열과: %d\n",result);
		
		result = ~num1; // 2진수 => 비트반전 ~ + 1 = 0 
		// 3 + (-3) = 0
		System.out.printf("~ 연산열과: %d\n",result);
		
		// >>, >>>, << = (비트연산자) => 딱히 쓸일없음.. 잊어버려도 무방
		result = num1 >> 2;
		System.out.printf(">> 연산열과: %d\n",result);
		
		// &&(참), ||(거짓), !(반대) (논리연산자) = 좌우의 값이 boolean type의 변수가 와야한다.
		boolean b1 = false;
		boolean b2 = !b1;
		
		boolean b3 = b1 || b2;
		System.out.printf("b3 : %s, b1: %s b2: %s",b3 ,b1 ,b2);
		// 얘네 많이 쓴다. 기억하자
	}
}

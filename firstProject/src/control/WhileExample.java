package control;

public class WhileExample {		//횟수가 정해져있으면 for, 없으면 whi
	public static void main(String[] args) {
		int i =1;
		while (i <= 10) {
			System.out.printf("i의 값은 %d\n", i);
			i++;
		}
		
		Boolean run = true;
		int cnt = 0;
		while(run) {
			cnt =(int)(Math.random() * 10) +1 ;
			System.out.println(cnt);
			if(cnt == 8 ) {
				run = false;
			}
		}
		
		System.out.println("끝.");
		//Boolean run = true;
		int cnt1 = 0;
		while(true) {
			cnt1 =(int)(Math.random() * 10) +1 ;
			System.out.println(cnt1);
			if(cnt1 == 8 ) {
				break;
//				run = false;
			}
		}
		
		System.out.println("끝.");
		
	}
}

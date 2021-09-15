package control;

public class DoWhileExample {
	public static void main(String[] args) {
		
		// Do..While
		Boolean run = false;
		
//		while(run) {
//			System.out.println("실행문1");
//		}
		int cnt = 0;
		do {
			cnt++;
			if(cnt % 2 == 1) {
				continue; //다음순으로 skip하고 다음순번으로 간다.
			}
			System.out.println(cnt);
			if(cnt >= 4) {
				break;
			}
//			System.out.println("실행문2");
		} while(true);
		System.out.println("끝.");
	}
}

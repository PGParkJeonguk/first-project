package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 1 ~ 10까지 임의의 수를 생성
		// 학생이 10명이 있다.
		int[] scores = new int[10];
		System.out.println(scores.length);
		for (int i = 0; i < scores.length; i++) {
			int temp = (int) (Math.random() * 10) + 1;
			scores[i] = temp;
			System.out.printf("저장된값[%d] => %d\n", i, scores[i]);
		}
		
		// scores 배열타입. scores[0]은 int 타입.

		// 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] =>%d\n", i, scores[i]);
		}
		System.out.println("끝 1 ");
		//배열에 들어있는 요소들의 합.
		int sum = 0;
		// 배열의 합계 : 55
		for( int i = 0; i <scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("배열의 합계는 " + sum);
		System.out.println("끝 2 ");
		
		// 배열의 요소중 5보다 큰값만 합계.
		int bigsum = 0;
		for( int i = 0; i <scores.length; i++) {
			if(scores[i] > 5 ) {
				bigsum+=scores[i];
			}
		}
		System.out.println("5보다 큰값만 합계한 값: " + bigsum);
		System.out.println("끝 3 ");
		
		// 배열의 요소중 짝수번째 값만 합계
		int sum2 = 0;
		for( int i = 0; i <scores.length; i++) {
			if(scores[i] % 2 == 0) {
				sum2 += scores[i];
			}
		}
		System.out.println("배열의 짝수만 합계한 값: " + bigsum);
		System.out.println("끝 4 ");
	}
}

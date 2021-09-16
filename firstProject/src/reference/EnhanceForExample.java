package reference;

public class EnhanceForExample {
	
	public static void main(String[] args) {
		String[] strAry = null;
		strAry = new String[5];
		strAry = new String[]{"Hong","Park","Choi","Kim","Hwang"};
		System.out.println(strAry.length);
		
		strAry[2] = "Hong";		// 정수형 == , 문자열 equals
		for(int i=0; i < strAry.length; i++) {
			if(strAry[i].equals("Hong")){
				System.out.println(strAry[i]);
			}
		}
		System.out.println("=======다시======");
		//Enhanced for(배열에 있는 만큼 반복하겠다.)
		for(String str : strAry) {
			System.out.println(str);
		}
		
		int scores[] = {60,70,80,90};
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("점수: "+ sum);
		System.out.println("=======다시======");
		
		//학생 3명. 4.2 3.5 2.8
		//합계
		double[] student = {4.2,3.5,2.8};
		double sum1 = 0;
		for(double students : student) {
			sum1 += students;
		}
		System.out.println("합계: "+ sum1);
		
		//평균을 계산해서 출력하라
		double avg = 0;
		double sum2 = 0;
		for(double cnt : student) {
			sum2 += cnt;
		}
		avg = sum2 / student.length;
		System.out.println("평균: " + avg);
		
	}
}

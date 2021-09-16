package reference;

public class MetohdExample {
	
	public static void main(String[] args) {
		
		// 메소드 실행
		double w1 = 76.5, h1 =1.78;
		checkBMI(w1, h1);
		double w2 = 65, h2 =1.78;
		checkBMI(w2, h2);
		checkBMI(65.8, 179.8);
		
		
		
// 		비만도를 계산하는 공식.
//		double bmi = weight / (height*height);
//		bmi < 18.5 저체중.
//		18.5 ~ 23 정상.
//		23 ~ 25 과체중.
//		25 ~ 30 비만.
//		30 < 고도비만
		
		
		
		
		
	}
	
	//메소들 정의할때 매개변수
	public static void checkBMI(double weight, double height) {
		double bmi = weight / (height * height);
		if(bmi < 18.5) {
			System.out.println("저체중.");
		}else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("적정체중.");
		}else if(bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		}else if(bmi >= 25){
			System.out.println("비만");
		}else {
			System.out.println("인간입니까?");
		}
	}

}

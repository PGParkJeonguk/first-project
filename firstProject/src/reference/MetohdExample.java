package reference;

public class MetohdExample {
	
	public static void main(String[] args) {
		
		// �޼ҵ� ����
		double w1 = 76.5, h1 =1.78;
		checkBMI(w1, h1);
		double w2 = 65, h2 =1.78;
		checkBMI(w2, h2);
		checkBMI(65.8, 179.8);
		
		
		
// 		�񸸵��� ����ϴ� ����.
//		double bmi = weight / (height*height);
//		bmi < 18.5 ��ü��.
//		18.5 ~ 23 ����.
//		23 ~ 25 ��ü��.
//		25 ~ 30 ��.
//		30 < ����
		
		
		
		
		
	}
	
	//�޼ҵ� �����Ҷ� �Ű�����
	public static void checkBMI(double weight, double height) {
		double bmi = weight / (height * height);
		if(bmi < 18.5) {
			System.out.println("��ü��.");
		}else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("����ü��.");
		}else if(bmi >= 23 && bmi < 25) {
			System.out.println("��ü��");
		}else if(bmi >= 25){
			System.out.println("��");
		}else {
			System.out.println("�ΰ��Դϱ�?");
		}
	}

}

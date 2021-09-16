package reference;

public class EnhanceForExample {
	
	public static void main(String[] args) {
		String[] strAry = null;
		strAry = new String[5];
		strAry = new String[]{"Hong","Park","Choi","Kim","Hwang"};
		System.out.println(strAry.length);
		
		strAry[2] = "Hong";		// ������ == , ���ڿ� equals
		for(int i=0; i < strAry.length; i++) {
			if(strAry[i].equals("Hong")){
				System.out.println(strAry[i]);
			}
		}
		System.out.println("=======�ٽ�======");
		//Enhanced for(�迭�� �ִ� ��ŭ �ݺ��ϰڴ�.)
		for(String str : strAry) {
			System.out.println(str);
		}
		
		int scores[] = {60,70,80,90};
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("����: "+ sum);
		System.out.println("=======�ٽ�======");
		
		//�л� 3��. 4.2 3.5 2.8
		//�հ�
		double[] student = {4.2,3.5,2.8};
		double sum1 = 0;
		for(double students : student) {
			sum1 += students;
		}
		System.out.println("�հ�: "+ sum1);
		
		//����� ����ؼ� ����϶�
		double avg = 0;
		double sum2 = 0;
		for(double cnt : student) {
			sum2 += cnt;
		}
		avg = sum2 / student.length;
		System.out.println("���: " + avg);
		
	}
}

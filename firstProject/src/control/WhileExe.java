package control;

public class WhileExe {
	public static void main(String[] args) {
		
		// while ������ ����ؼ� 1 ~ 10���� ���
		int i =1;
		while (i <= 10) {
			System.out.printf("i�� ���� %d\n", i);
			i++;
			}
		System.out.println("==============��1");
		//while ������ ����ؼ� 10���� ¦�� ���
		int i2 =2;
		while (i2 <= 10) {
			System.out.printf("i�� ���� %d\n", i2);
			i2+=2;
		}
		System.out.println("==============��2");
		int i3 =1;
		while (i3 <= 10) {
			System.out.printf("i�� ���� %d\n", i3);
			i3+=2;
		}
		System.out.println("==============��3");
		int i4 =0;
		int sum = 0;
		while (i4 <= 10) {
			sum = sum + i4;
			i4++;
		}
		System.out.println(sum);
		System.out.println("==============��4");
	}
}

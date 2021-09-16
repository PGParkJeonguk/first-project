package reference;

public class MethodExample2 {

	public static void main(String[] args) {

		sum(24, 55); // �޼ҵ� ����(��)
		int a = 45, b = 77;
		sum(a, b);

		multi(35, 88);

		getArea(3.5);

		int res = getMAX(a, b);
		System.out.println("ū���� : " + res);

		System.out.println("������ : " + divide(17, 3));
	}

	// �� ������ �Է¹޾Ƽ� �� ���� ���� console ���
	// �޼ҵ� ����(type)
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("�μ��� ��: " + sum);
	}

	// �� ������ �Է¹޾Ƽ� �� ���� ���� console ���
	public static void multi(int i1, int i2) {
		int multi = i1 * i2;
		System.out.println("�μ��� ��: " + multi);
	}

	// ���簢�� �ʺ� ������ִ� �޼ҵ�.
	public static void getArea(double side) {
		double Anw = side * side;
		System.out.println("���簢���� ����: " + Anw);
	}

	// �μ��߿��� ū ���� ��ȯ���ִ� �޼ҵ�. (��ȯ�� return)
	public static int getMAX(int num1, int num2) {
		int result = (num1 >= num2) ? num1 : num2;
		return result;
	}

	// �� ������ �Է¹޾Ƽ� ù��° ���� �ι�°������ ���� ����� ��ȯ���ִ� �޼ҵ�
	public static double divide(int a, int b) {
		return (double) a / b;
	}

}

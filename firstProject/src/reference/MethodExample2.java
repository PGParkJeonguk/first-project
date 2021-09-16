package reference;

public class MethodExample2 {

	public static void main(String[] args) {

		sum(24, 55); // �޼ҵ� ����(��)
		int a = 45, b = 77;
		sum(a, b);

		multi(35, 88);

		getArea(3.5);

		System.out.println("ū���� : " + getMax(10, 50));
		
		
		System.out.println("������ : " + divide(17, 3));
	}

	// �� ������ �Է¹޾Ƽ� �� ���� ���� console ���
	// �޼ҵ� ����(type)
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("�μ��� ��: " + sum);
	}

	// �� ������ �Է¹޾Ƽ� �� ���� ���� console ���
	public static void multi(int n1, int n2) {
		int multi = n1 * n2;
		System.out.println("�μ��� ��: " + multi);
	}

	// ���簢�� �ʺ� ������ִ� �޼ҵ�.
	public static void getArea(double side) {
		double anw = side * side;
		System.out.println("���簢���� ����: " + anw);
	}

	// �μ��߿��� ū ���� ��ȯ���ִ� �޼ҵ�. (��ȯ�� return)
	public static int getMax(int n1, int n2) {
		int result = (n1 >= n2) ? n1 : n2;
		return result;
	}

	// �� ������ �Է¹޾Ƽ� ù��° ���� �ι�°������ ���� ����� ��ȯ���ִ� �޼ҵ�
	public static double divide(int a, int b) {
		return (double) a / b;
	}

}
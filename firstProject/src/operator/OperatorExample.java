package operator;

public class OperatorExample {
	public static void main(String[] args) {
		 // +, -, *, /, %=������, &(����������), |(���տ���) , ^(��Ÿ������), ~(����Ʈ) �����ڸ� ����ϸ� intŸ������ ���Ѵ�.
		int num1, num2, result; //�Ѳ����� �����Ҷ� �̷��� �ص� �ȴ�.
		num1 = 10;
		num2 = 5;
		
//		result = num2 =num1;
		
		result = num1 *num2; // �Ҵ�(����)������ = 				�����ʺ��� ó���Ѵ�.
		//num1 * num2 = result; => ��� ��� �ȵ� 
		result = -result;
		System.out.printf("-���꿭��: %d\n",result);
		
		result = num1 % 3;
		System.out.printf("���꿭��: %d\n",result);
		
		result = num1 & num2;
		System.out.printf("& ���꿭��: %d\n",result);
		
		result = num1 | num2;
		System.out.printf("| ���꿭��: %d\n",result);
		
		result = num1 ^ num2;
		System.out.printf("^ ���꿭��: %d\n",result);
		
		result = ~num1; // 2���� => ��Ʈ���� ~ + 1 = 0 
		// 3 + (-3) = 0
		System.out.printf("~ ���꿭��: %d\n",result);
		
		// >>, >>>, << = (��Ʈ������) => ���� ���Ͼ���.. �ؾ������ ����
		result = num1 >> 2;
		System.out.printf(">> ���꿭��: %d\n",result);
		
		// &&(��), ||(����), !(�ݴ�) (��������) = �¿��� ���� boolean type�� ������ �;��Ѵ�.
		boolean b1 = false;
		boolean b2 = !b1;
		
		boolean b3 = b1 || b2;
		System.out.printf("b3 : %s, b1: %s b2: %s",b3 ,b1 ,b2);
		// ��� ���� ����. �������
	}
}

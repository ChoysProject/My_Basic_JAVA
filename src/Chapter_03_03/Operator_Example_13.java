package Chapter_03_03;

public class Operator_Example_13 {

	public static void main(String[] args) {

		// �Է°��� NaN �˻�
		
		// �ε� �Ҽ��� (�Ǽ�)�� �Է¹��� ���� �ݵ�� NaN�˻縦 �ؾ��Ѵ�. 
		// 3���ο��� �ε��Ҽ������� ��ȯ�� ������ ���ڿ��� �Է¹޴´ٰ� �����غ���. 
		// ���Ǽ� �ִ� ����ڴ� ���ڷ� ��ȯ�� �� �Ǵ� "NaN"�� �Է��� ���� �ִ�.
		
		// "NaN" ���ڿ��� ������
		
		String userInput = "NaN"; // ����ڷκ��� �Է¹��� ��
		double val = Double.valueOf(userInput); // �Է°��� double Ÿ������ ��ȯ
		
		double currentBalance = 10000.0;
		
		currentBalance = 10000.0;
		
		currentBalance += val; // currentBalance�� NaN�� �����.
		System.out.println("currentBalance = " + currentBalance);
	
		// "NaN" ���ڿ��� Double.valueOf() �޼��忡 ���� double Ÿ������ ��ȯ�Ǹ� NaN�� �ȴ�.
		// ���� val���� NaN�� ����ȴ�. ������ NaN�� ��������� �����ϴٴ� ���̴�. 
		// NaN�� � ���� ������ ����Ǹ� �����Ͱ� �����̵ȴ�. 
		// �׷��� ������ ����ڷκ��� ���ڿ��� �Է¹��� ������ �ݵ�� "NaN" ���� �����ϰ� ���� NaN�̶�� NaN�� ��� ������ �����ؼ��� �ȵȴ�.
		
		
	}

}

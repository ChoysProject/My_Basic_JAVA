package Chapter_05_06;

public class Arrangement_Type_Example_05 {

	public static void main(String[] args) {

		// main() �޼ҵ��� �Ű�����
		
		if(args.length != 2) { // �Էµ� ������ ������ �� ���� �ƴ� ���.
			System.out.println("���α׷��� ����");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0); // ���α׷� ���� ����
		}
		
		
		String strNum1 = args[0]; // ù��° ������ ���
		String strNum2 = args[1]; // �ι�° ������ ���
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println("num1 : " + num1 +" / " + "num2 :" + num2);
		
		
		// �� ������ �׳� �����ϸ� ���ڰ� �ƴ� ���ڿ��� ��µ�.
		// �� ������ ������ �� �Ű����� ���� �ʾұ� ������ ���� 0�� String �迭�� �Ű������� ���޵ȴ�. 
		// ���� args.length�� 0�̹Ƿ� 3������ if ���ǽ��� true�� �Ǿ� if���� ����� ����� ���̴�.
		// ��Ŭ�������� ���α׷��� ������ �� �Ű����� �ְ� �����Ϸ��� �޴����� Run-> Run Configurations�� �����ؼ� 
		// p.161�� ����
		// ��ȭ������ Main�ǿ��� Project�� Main Class�� Ȯ��
		// Arguments ���� Ŭ���ϰ� Program arguments �Է¶��� 10�� �Է��ϰ� ��ĭ�� ���� 20�� �Է� �� Run��ư�� Ŭ���ϸ�
		// ���ڰ� ��µȴ�.
		
		
	}

}

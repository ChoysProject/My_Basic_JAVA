package Chapter_02_03;

public class Change_the_Type_02 {

	public static void main(String[] args) {

		
		// �ڵ� Ÿ�� ��ȯ(Promotion)�� ���α׷� ���� ���߿� �ڵ������� Ÿ�� ��ȯ�� �Ͼ�� ���� ���Ѵ�.
		// �ڵ� Ÿ�� ��ȯ�� ���� ũ�⸦ ������ Ÿ���� ū ũ�⸦ ������ Ÿ�Կ� ����� �� �߻��Ѵ�.
		
		// ū ũ�� Ÿ�԰� ���� ũ�� Ÿ���� ������ ����ϴ� �޸� ũ���̴�. 
		// ���� ��� byte Ÿ���� 1byte -> 4byte ũ�⸦ ���� int�� ���� ��� �ִ�.
		
		// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		// float�� 4byte ũ���ε�, int(4byte)�� long(8byte) ���� �� ū Ÿ������ ǥ���ߴ�.
		// �������� ǥ���� �� �ִ� ���� ������ float�� �� ũ�� �����̴�. �̰͸� �����ϸ� ������ Ÿ���� ũ�⸦ ���ϴ� ���� ����� �ʴ�.
		
		byte byteValue = 10;
		int intValue = byteValue; // �ڵ� Ÿ�� ��ȯ�� �Ͼ��.
		
		
		int intValue2 = 200;
		double doubleValue = intValue2; // 200.0
		
		char charValue = 'A';
		int intValue3 = charValue; // 65�� ����
		
		byte byteValue2 = 65;
//		char charValue2 = byteValue2; // ������ ����
//		char charData ] (char) byteData;  // ���� Ÿ�� ��ȯ �ʿ�.
		
	}

}

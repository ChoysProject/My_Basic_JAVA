package Chapter_02_03;

public class Change_the_Type_04 {

	public static void main(String[] args) {
		// ����Ŀ����� �ڵ� Ÿ�� ��ȯ
		
		int intValue = 10;
		double doubleValue = 5.5;
		double result = intValue + doubleValue; // result �� 15.5�� ����
		
		// ���� int Ÿ������ �� ������ �ؾ��Ѵٸ�, double Ÿ���� int Ÿ������ ���� ��ȯ�ϰ� ���� ������ �����ϸ� �ȴ�.
		
		int intValue2 = 10;
		double doubleValue2 = 5.5;
		int result2 = intValue + (int)doubleValue2; // result�� 15�� ����
		
		
		char ai = 'A';
		int result3 = ai + 1; // 'A'�� �����ڵ庸�� 1�� ū �����ڵ尡 ����
		char na = (char) result; // 'B'�� �����
		
	}

}

package Chapter_02_03;

public class Change_the_Type_03 {

	public static void main(String[] args) {

		
		// ū ũ���� Ÿ���� ���� ũ���� Ÿ������ �ڵ�Ÿ�� ��ȯ�� �� �� ����.
		// ���� ���, 4byte�� int Ÿ���� 1byte�� byte Ÿ�Կ� ���� �� ����.
		// ��ġ ū �׸��� ���� ���� �׸� �ȿ� ��� ���� �� ���°Ͱ� ������ ��ġ�̴�.
		// ������ ū �׸��� ���� �׸� ������� �ɰ�� �� ������ �����׸��� �ִ´ٸ� �����ϴ�.
		// �� int Ÿ�� 5���� byte�� �ɰ� ����, �����ִ� 1byte�� byte Ÿ�� ������ �����ϴٴ� ���� �����ϴ�.
		// �̿� ���� ���������� ū ������ Ÿ���� ���� ������ Ÿ������ �ɰ�� �����ϴ� ���� ����Ÿ�Ժ�ȯ(Casting)�̶�� �Ѵ�.
		// ���� Ÿ�� ��ȯ�� ĳ���� ������ ()�� ����Ѵ�. ��ȣ �ȿ� ��žƴ� Ÿ���� �ɰ��� �����̴�.
		int intValue = 103029770;
		byte byteValue = (byte) intValue; // ����Ÿ�� ��ȯ (ĳ����)
		
		// ������ ���Ͱ��� �Ѵٸ� ������ int ���� �������� �ʴ´�.
		// ������ int ���� �� 1byte�θ� ǥ���� �����ϴٸ� byte Ÿ������ ��ȯ�ص� ���� ���� ������ �� �ִ�. �̷���� ����Ÿ�Ժ�ȯ�� �ǹ��ְԵȴ�.
		
		// �ٸ� ���� long Ÿ�� ������ 300�� ����Ǿ� ���� �ܿ�, 8byte �� ���� 4byte �� ���� 4byte�� 300�� ����� ǥ�� �� �� �����Ƿ� �̰��� int Ÿ������ ���� Ÿ�� ��ȯ�ϸ� ���� 4byte�� ��������
		// ���� 4byte�� int Ÿ�� ������ ����Ǿ� 300�� �״�� �����ȴ�.
		
		long longValue = 300;
		int intVlaue = (int) longValue; // intValue�� 300�� �״�� ����ȴ�.
		
		// int Ÿ���� char Ÿ������ �ڵ� ��ȯ���� �ʱ� ������ ���� Ÿ�� ��ȯ�� ����ؾ� �Ѵ�. int Ÿ�Կ� ����� ���� �����ڵ� ���� (0~65535)
		// ��� ������ ���� ĳ���� �����ڸ� ����ؼ� Ÿ�Ժ�ȯ �� �� �ִ�. 
		
		int intVlaue2 = 'A';
		char charValue = (char) intVlaue2;
		System.out.println("charValue =" + charValue);
		
		double doubleValue = 3.14;
		int intValue3 = (int)doubleValue;
		
		
		
//			�⺻Ÿ��			�ִ밪 ���			�ּҰ� ���
//		  	byte 			Byte.MAX_VALUE		Byte.MIN_VALUE
//		  	short			Short.MAX_VALUE		Short.MIN_VALUE
//		  	int				Integer.MAX_VALUE	Integer.MIN_VALUE
//		  	long			Long.MAX_VALUE		Long.MIN_VALUE
//		  	float			Float.MAX_VALUE		Float.MIN_VALUE
//		  	double			Double.MAX_VALUE	Double.MIN_VALUE
		
		
		
		
	}

}

package Chapter_02_03;

public class Change_the_Type_Example_03 {

	public static void main(String[] args) {

		int i = 128;
		
		if( (i<Byte.MIN_VALUE || (i>Byte.MAX_VALUE) )) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���.");
		}else {
			byte b = (byte) i;
			System.out.println("b = " + b);
		}
		
		
	}

}
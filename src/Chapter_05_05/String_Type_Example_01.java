package Chapter_05_05;

public class String_Type_Example_01 {

	public static void main(String[] args) {

		// ���ڿ� ��
		
		String strVar1 = "������";
		String strVar2 = "������";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1 �� strVar2�� ������ ����");
		}else {
			System.out.println("strVar1 �� strVar2�� ������ �ٸ�");
		}
		
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		
		String strVar3 = new String("������");
		String strVar4 = new String("������");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		}else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
		
		
		
	}

}

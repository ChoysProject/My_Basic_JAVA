package Chapter_06_11;

public class Final_Example_02 {

	public static void main(String[] args) {

		Final_Example_01 p1 = new Final_Example_01("123456-1234567", "������");
		
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa"; // final �ʵ�� �� ���� �Ұ�.
		// p1.ssn = "654231-6543210" // final �ʵ�� �� ���� �Ұ�
		p1.name = "��������";
		System.out.println("�ٲ� �� = " + p1.name);
	}

}

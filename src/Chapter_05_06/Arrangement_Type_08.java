package Chapter_05_06;

public class Arrangement_Type_08 {

	public static void main(String[] args) {

		
		// ��ü�� �����ϴ� �迭
		
		// �⺻Ÿ�� (byte, char, short, int, long, float, double, boolean) �迭�� �� �׸� ���� ���� ���� ������,
		// ���� Ÿ��(Ŭ����, �������̽�) �迭�� �� �׸� ��ü�� ������ ������ �ִ�.
		// ������� String�� Ŭ���� Ÿ���̹Ƿ� String[] �迭�� �� �׸� ���ڿ��� �ƴ϶�, String ��ü�� �ּҸ� ������ �ִ�.
		// �� String ��ü�� �����ϰ� �ȴ�.
		
		// String[] strArray = new String[3];
		// strArray[0] = "java";
		// strArray[1] = "C++";
		// strArray[2] = "C#";
		
		// �� �ڵ�� �迭 ���� strArray���� �����ϰ� 3���� ���ڿ��� �����ϴ� �迭�� �����Ѵ�.
		// ���� String[] �迭�� �׸� �ᱹ String ������ �����ϰ� ��޵Ǿ�� �Ѵ�.
		// ���� ��� String[] �迭 �׸� ���� ���ڿ��� ���ϱ� ���ؼ��� == ������ ��� equals() �޼��带 ����ؾ��Ѵ�.
		// ==�� ��ü�� ���� ���̱� ������ ���ڿ� �񱳿� ����� �� ����.
		
		// Stirng[] strArray = new String[3];
		// strArray[0] = "Java";
		// strArray[1] = "Java";
		// strArray[2] = new String("Java");
		
//		System.out.println(strArray[0] == strArray[1]); // true (���� ��ü�� ����)
//		System.out.println(strArray[0] == strArray[2]); // false (�ٸ� ��ü�� ����)
//		System.out.println(strArray[0].equals(strArray[2])); // true (���ڿ� ����)	

		// strArray[0]�� strArray[1] �迭 �׸��� == �����ϸ� ����� true �� ���´�. 
		// ������ ������ String ��ü�� �����ϱ� �����̴�. �ݸ鿡 String ��ü�� new �����ڷ� �����ϸ�, ������ ���ο� String ��ü�� �����Ǳ� ������ 
		// strArray[0]�� strArray[2] �迭 �׸��� == �����ϸ� ����� false�� ���´�.
		// strArray[0]�� strArray[2]�� ���� �ٸ� ��ü�� �����ϱ� �����̴�.
		// ������ ���ڿ��� ���ϴ� strArray[0].equals(strArray[2])�� true ���� ���ϵȴ�.
	
	}
}

package Chapter_05_06;

public class Arrangement_Type_Example_08 {

	public static void main(String[] args) {

		
		// for������ �迭 ����
		
		
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i =0; i<oldIntArray.length;i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		
		for(int i=0; i<newIntArray.length;i++) {
			System.out.print("newIntArray value : " + newIntArray[i] + ", ");
		}
	
		
		// �� �ڵ�� ������ ���� �迭�� �����Ų��.
		// ������� ���� �׸��� int[] �迭�� �⺻ �ʱⰪ 0�� �״�� �����ȴ�.
		// �̹����� System.arraycopy() �޼ҵ带 �̿��ؼ� �迭�� �����غ���. System.arraycopy()�� ȣ���ϴ� ����� ������ ����.
		// System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
		
		// src �Ű����� ���� �迭�̰�, srcPost�� ���� �迭���� ������ �׸��� ���� �ε����̴�.
		// dest �Ű����� �� �迭�̰�, destPos�� �� �迭���� �ٿ����� ���� �ε����̴�.
		// ���������� length�� ���� �� �����̴�.
		// ������� ���� �迭�� arr1�̰� �� �迭�� arr2�� ��� arr1�� ��� �׸��� arr2�� �����Ϸ��� ������ ���� System.arraycopy() �޼��带 ȣ���ϸ�ȴ�.
		
		

	}

}

package Chapter_05_06;

public class Arrangement_Type_Example_09 {

	public static void main(String[] args) {

		// System.arraycopy()�� �迭 ����
		
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		
		for(int i=0; i<newStrArray.length;i++) {
			System.out.println(newStrArray[i] + ", ");
		}
		
		
		// �� �ڵ�� ������ ���� �迭�� �����Ų��. ������� ���� �׸��� String[] �迭�� �⺻ �ʱⰪ null�� �״�� �����ȴ�.
		
		// ���� Ÿ�� �迭�� ���, �迭 ���簡 �Ǹ� ����Ǵ� ���� ��ü�� �����̹Ƿ� �� �迭�� �׸��� ���� �迭�� �׸��� �����ϴ� ��ü�� �����ϴ�.
		// �̰��� ���� ���� (shallow copy)��� �Ѵ�.
		// �ݴ�� ���� ����(deep copy)�� �����ϴ� ��ü�� ������ �����ϴ� ���� ���Ѵ�.
		
		
		
	}

}

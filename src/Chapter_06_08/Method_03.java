package Chapter_06_08;

public class Method_03 {

	
	// Return��
	
	// ���ϰ��� �ִ� �޼ҵ�
	// �޼ҵ� ���� ���� Ÿ���� �ִ� �޼ҵ�� �ݵ�� ����(return)���� ����ؼ� ���ϰ��� �����ؾ� �Ѵ�.
	// ���� return���� ���ٸ� ������ ������ �߻��Ѵ�.
	// return ���� ����Ǹ� �޼ҵ�� ��� ����ȴ�.
	
	// return ���ϰ�;
	
	// return���� ���ϰ��� ���� Ÿ���̰ų� ���� Ÿ������ ��ȯ �� �� �־�� �Ѵ�.
	// ���� ��� ����Ÿ���� int�� plus() �޼ҵ忡�� byte, short, int Ÿ���� ���� ���ϵǾ �������.
	// byte�� short�� int�� �ڵ� Ÿ�� ��ȯ�Ǿ� ���ϵǱ� �����̴�.
	
//	int plus(int x, int y) {
//		int result = x + y;
//		return result
//	}
	
//	int plus (int x, int y) {
//		byte result = (byte) (x+y);
//		return result;
//	}
	
	// return���� ����� �� ������ ���� return�� ���Ŀ� ���๮�� ���� "Unreachable code" ��� ������ ������ �߻��Ѵ�.
	// �ֳ��ϸ� return�� ������ ���๮�� ���� ������� �ʱ� �����̴�.
	// ���� ������ �߸��� �ڵ��̴�.
	
//	int plus (int x, int y) {
//		int result = x + y;
//		return result;
//		System.out.println(result); // Unreachable code
// }	
	
	
	// ������ ������ ���� ���, ������ ������ �߻����� �ʴ´�. 2�� return false; ������ ������, if���� ���ǽ��� false�� �� ��� ���������� 2�� ����Ǳ� ������ 2�� Unreachable code ������ �߻���Ű�� ������.
	// if���� ���ǽ��� true�� �Ǹ� 1�� ����ǰ� return false;�� ����Ǿ� �޼ҵ�� ��� �����Ѵ�.
	// �翬�� 2�� ������� �ʴ´�.
	
//	boolean isLeftGas() {
//		if(gas ==0) {
//			System.out.println("gas�� �����ϴ�.");
//			return false;
//		}
//		System.out.println("gas�� �ֽ��ϴ�.");
//		return true;
//	}
	
	
	// ���ϰ��� ���� �޼ҵ� (void)
	
	// void�� ����� ���ϰ��� ���� �޼ҵ忡���� return���� ����� �� �ִ�.
	// ������ ���� return���� ����ϸ� �޼ҵ� ������ ���� ���� ��Ų��.
	
	// return;
	
	// ������ gas���� 0���� Ŭ ��� ����ؼ� while���� �����ϰ�, 0�� ��� return���� �����ؼ� run() �޼ҵ带 ��� �����Ѵ�.
	// while���� �� �� ������ ������ gas�� 1�� �����ϱ� ������ �������� 0�� �Ǿ� run() �޼ҵ带 �����Ѵ�.
	// �� ���������� return�� ��� break���� ����� �� �ִ�.
	
	// ���� while�� �ڿ� ���๮�� �߰������� �� ���� ���, break���� �ݵ�� ����ؾ� �Ѵ�.
	// return���� ��� �޼ҵ带 �����Ű�� �����̴�.
	
//	void run() {
//		while(true) {
//			if(gas > 0) {
//				System.out.println("�޸��ϴ�. ( gas �ܷ�:" + gas + ")");
//				gas -= 1;
//			}else {
//				System.out.println("����ϴ�. ( gas �ܷ�:" + gas + ")");
//			return;
//			}
//		}
//	}
	
	
	// CarExample Ŭ������ 5���ο��� Car ��ü�� setGas(5) �޼ҵ带 ȣ���ؼ� Car ��ü�� gas �ʵ尪�� 5�� �����ߴ�.
	// 7���ο����� isLeftGas() �޼ҵ带 ȣ���ؼ� ���ϰ��� gasState ������ �����Ѵ�.
	// 8���ο��� gasState �������� true�� ��� 10���ο��� run() �޼ҵ带 ȣ���Ѵ�.
	// 13������ ���� if���� ���ǽ����� isLeftGas() �޼ҵ� ȣ���� ��ž� �ִµ�, �̰��� ������ ������ �޼ҵ尡 boolean���� �����ϱ� �����̴�.
	// ���ϰ��� true�� ��� if ����� �����ϰ� false�� ��� else ����� �����Ѵ�.
	
	
}

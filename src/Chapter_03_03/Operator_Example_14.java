package Chapter_03_03;

public class Operator_Example_14 {

	public static void main(String[] args) {

		// NaN�� üũ�ϰ� ���� ����
		
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) { // NaN�� �˻���
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����"); // NaN�϶� ����Ǵ� �ڵ�
			val = 0.0;
		}
		currentBalance += val; // NaN�� �ƴҶ� ���Ǵ� val�� ��.
		System.out.println("currentBalance = " + currentBalance);
		
	}

}

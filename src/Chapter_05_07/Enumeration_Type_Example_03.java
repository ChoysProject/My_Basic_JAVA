package Chapter_05_07;

public class Enumeration_Type_Example_03 {

	
	public static void main(String[] args) {
		
		
		// ���� ��ü�� �޼ҵ�
		
		// name() �޼ҵ�
		
		Enumeration_Type_Example_01 today = Enumeration_Type_Example_01.SUNDAY;
		
		String name = today.name();
		System.out.println("name method = " + name);
		
		// ordinal() �޼ҵ�
		
		int ordinal = today.ordinal();
		System.out.println("ordinal method  = " + ordinal);
		
		// compareTo() �޼ҵ�
		
		Enumeration_Type_Example_01 day1 = Enumeration_Type_Example_01.MONDAY;
		Enumeration_Type_Example_01 day2 = Enumeration_Type_Example_01.WENSEDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		
		// valueOf() �޼ҵ�
		
		if(args.length ==1) {
			String strDay = args[0];
			Enumeration_Type_Example_01 weekDay = Enumeration_Type_Example_01.valueOf(strDay);
			if(weekDay == Enumeration_Type_Example_01.SATURDAY || weekDay == Enumeration_Type_Example_01.SUNDAY) {
				System.out.println("�ָ��̱���!");
			}else {
				System.out.println("�����̱���!");
			}
		}
		
		
		// value() �޼ҵ�
		
		Enumeration_Type_Example_01[] days = Enumeration_Type_Example_01.values();
		for(Enumeration_Type_Example_01 day : days) {
			System.out.println("day value = " + day);
		}
		
		
		
		
		
	}
	
}

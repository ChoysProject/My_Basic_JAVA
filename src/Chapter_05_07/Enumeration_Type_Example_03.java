package Chapter_05_07;

public class Enumeration_Type_Example_03 {

	
	public static void main(String[] args) {
		
		
		// 열거 객체의 메소드
		
		// name() 메소드
		
		Enumeration_Type_Example_01 today = Enumeration_Type_Example_01.SUNDAY;
		
		String name = today.name();
		System.out.println("name method = " + name);
		
		// ordinal() 메소드
		
		int ordinal = today.ordinal();
		System.out.println("ordinal method  = " + ordinal);
		
		// compareTo() 메소드
		
		Enumeration_Type_Example_01 day1 = Enumeration_Type_Example_01.MONDAY;
		Enumeration_Type_Example_01 day2 = Enumeration_Type_Example_01.WENSEDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		
		// valueOf() 메소드
		
		if(args.length ==1) {
			String strDay = args[0];
			Enumeration_Type_Example_01 weekDay = Enumeration_Type_Example_01.valueOf(strDay);
			if(weekDay == Enumeration_Type_Example_01.SATURDAY || weekDay == Enumeration_Type_Example_01.SUNDAY) {
				System.out.println("주말이군요!");
			}else {
				System.out.println("평일이군요!");
			}
		}
		
		
		// value() 메소드
		
		Enumeration_Type_Example_01[] days = Enumeration_Type_Example_01.values();
		for(Enumeration_Type_Example_01 day : days) {
			System.out.println("day value = " + day);
		}
		
		
		
		
		
	}
	
}

package Chapter_05_07;

import java.util.Calendar;

public class Enumeration_Type_Example_02 {

	public static void main(String[] args) {

		Enumeration_Type_Example_01 today = null; // ����Ÿ�� ���� ����
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // ��(1) ~ ��(7)������ ���ڸ� ����
		
		switch(week) {
		
		case 1:
			today = Enumeration_Type_Example_01.SUNDAY; break;
		case 2: 
			today = Enumeration_Type_Example_01.MONDAY; break;
		case 3: 
			today = Enumeration_Type_Example_01.THURSDAY; break;
		case 4: 
			today = Enumeration_Type_Example_01.WENSEDAY; break;
		case 5: 
			today = Enumeration_Type_Example_01.THURSDAY; break;
		case 6:
			today = Enumeration_Type_Example_01.FRIDAY; break;
		case 7: 
			today = Enumeration_Type_Example_01.SATURDAY; break;
		
		}
		
		System.out.println("���� ���� : " + today);
		
		
		if(today == Enumeration_Type_Example_01.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		}else {
			System.out.println("������ �ڹ� �����մϴ�.");
		}
		
		
		
	}

}

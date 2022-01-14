package Chapter_05_07;

import java.util.Calendar;

public class Enumeration_Type_Example_02 {

	public static void main(String[] args) {

		Enumeration_Type_Example_01 today = null; // 열거타입 변수 선언
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일(1) ~ 토(7)까지의 숫자를 리턴
		
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
		
		System.out.println("오늘 요일 : " + today);
		
		
		if(today == Enumeration_Type_Example_01.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부합니다.");
		}
		
		
		
	}

}

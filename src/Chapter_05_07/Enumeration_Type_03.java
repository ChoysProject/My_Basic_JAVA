package Chapter_05_07;

import java.util.Calendar;

import javax.print.CancelablePrintJob;

public class Enumeration_Type_03 {

	public static void main(String[] args) {
		
		
		// 열거 타입 변수

		// 열거 타입을 선언했다면 이제 열거 타입을 사용할 수  있다.
		// 열거 타입도 하나의 데이터 타입이므로 변수를 선언하고 사용해야한다.
		// 다음은 열거 타입 변수를 선언하는 방법이다.
		
		// 열거타입 변수;
		
		// 예를 들어 열거 타입 Week로 변수를 선언하면 다음과 같다.
		
		// Week today;
		// Week reservationDay;
		
		// 열거 타입 변수를 선언했다면 다음과 같이 열거 상수를 저장할 수 있다.
		// 열거 상수는 단독으로 사용할 수는 없고 반드시 열거타입. 열거상수로 사용된다.
		
		// 열거타입 변수 = 열거타입.열거상수;
		
		// 예를 들어 today 열거 변수에 열거 상수인 SUNDAY를 저장하면 다음과 같다.
		
		// Week today = Week.SUNDAY;
		
		// 열거 타입 변수는 NULL 값을 저장할 수 있는데 열거 타입도 참조 타입이기 때문이다.
		
		// Week birthday = null;
		
		// 참조타입 변수는 객체를 참조하는 변수라고 알고있는데, 그렇다면 열거 상수는 객체일까? 그렇다.
		// 열거 상수는 열거 객체로 생성된다. 열거 타입 Week의 경우 MONDAY부터 SUNDAY까지의 열거상수는 다음과 같이 총 7개의 Week 객체로 생성된다.
		// 그리고 메서드 영역에 생성된ㄷ 열거 상수가 해당 Week를 각각 참조하게 된다.
		
		// 그렇다면 이 코드를 어떻게 이해하면 좋을까 ?
		
		// Week today = Week.SUNDAY;
		
		// 열거 타입 변수 today는 스택 영역에 생성된다. today에 저장된는 값은 Week.SUNDAY 열거 상수가 참조하는 객체의 번지이다.
		// 따라서 열거 상수 Week.SUNDAY와 today 변수는 서로 같은 Week 객체를 참조하게 된다.
		
		// 그렇기 떄문에 today변수와 Week.SUNDAY상수의 == 연산의 결과는 true가 된다.
		
		// today == Week.SUNDAY // true
		
		// 그렇다면 이제 여러분은 다음 코드에서 변수 week1과 week2의 == 연산의 결과가 왜 true가 나오는지 이해할 수 있을 것이다.
		// week1과 week2 모두 Week.SATURDAY 상수와 같이 동일한 Week 객체를 참조하기 때문이다.
		
		// Week week1 = Week.SATURDAY;
		// Week week2 = Week.SATURDAY;
		// week1 == week2 // true;
		
		// 자바는 컴퓨터의 날짜 및 요일, 시간 프로그램에서 사용할 수 있도록 하기 위해 Date. Calendar, LocalDateTime 등의 클래스를 제공한다. LocalDateTime은 자바 8부터 지원하는 API이다.
		// 이전 버전과의 호환성을 위해 Calendar를 이용해서 날짜와 시간을 얻는 방법을 알아보자.
		
		// 우선 Calendar 변수를 선언하고 Calendar.getInstance() 메서드가 리턴하는 Calendar 객체를 얻는다.
		
		// Calendar now = Calendar.getInstance() 메소드가 리턴하는 Calendar 객체를 얻는다.
		
		Calendar now = Calendar.getInstance();
		
		// Calendar 객체를 얻었다면 get() 메서드를 이용해서 년, 월, 일 요일, 시간, 분, 초를 다음과 같이 얻을 수 있다.
		
		int year = now.get(Calendar.YEAR);	//년
		int month = now.get(Calendar.MONTH +1);	//월(1~12)
		int day = now.get(Calendar.DAY_OF_MONTH); // 일
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일(1~7)
		int hour = now.get(Calendar.HOUR); // 시
		int minute = now.get(Calendar.MINUTE); // 분
		int second = now.get(Calendar.SECOND); // 초
		
		// 그럼 Calendar를 이용해서 오늘의 요일을 얻고 나서 열거 타입 변수 today에 해당 열거 상수를 대입하는 예제를 살펴보자.
		// Calendar를 사용하기 위해서는 1라인의 imprt문이 필요하다.
		// import문은 6장에서 설명된다.
		// 7라인에 Calendar를 얻고 8라인에서 요일별 숫자를 얻는다.
		// 10~25라인은 switch문을 이용해서 열거 타입 변수 today에 열거 상수를 대입힌다.
		// 29~33라인은 if문을 이용해서 일요일인지 확인하고 출력할 내용을 결정한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

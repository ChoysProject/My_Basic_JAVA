package Chapter_05_07;

public class Enumeration_Type_04 {

	public static void main(String[] args) {

		// 열거 객체의 메서드
		
		// 열거 객체는 열거 상수의 문자열을 내부 데이터로 가지고있다.
		// 아래 그림(page 177)은 열거 객체가 가지는 데이터 및 메서드들을 보여준다.
		// 메서드는 java.lang.Enum 클래스에 선언된 메서드인데, 열거 객체에서 사용할 수 있는 잉는 모든 열거 타입은 컴파일 시에 Enum 클래스를 상속하게 되어있기 때문이다.
		// 아직 상속에 대해서 잘 몰라도 상관없으니 그냥 넘어가도록 하자.
		
		
		// 리턴타입			메소드(매개 변수)			설명
		// String			name()					열거 객체의 문자열을 리턴
		// int				ordinal()				열거 객체의 순번(0부터 시작)을 리턴
		// int				compareTo()				열거 객체를 비교해서 순번 차이를 리턴
		// 열거타입			valueOf(String name)	주어진 문자열의 열거 객체를 리턴
		// 열거 배열			values()				모든 열거 객체들을 배열로 리턴
		
		// name() 메소드
		
		// name() 메소드는 열거 객체가 가지고 있는 문자열을 리턴한다.
		// 이때 리턴되는 문자열은 열거타입을 정의할 때 사용한 상수 이름과 동일하다.
		// 아래 코드는 today가 참조하는 열거객체에서 name()메소드를 호출하여 문자열을 얻어낸다.
		// name() 메소드는 열거 객체 내부의 문자열인 "SUNDAY"를 리턴하고 name변수에 저장한다.
		
//		Week today = Week.SUNDAY;
//		String name = today.name();
		
		// ordinal() 메소드
		
		// ordinal() 메소드는 전체 열거 객체 중 몇 번째 열거 객체인지 알려준다.
		// 열거 객체의 순번은 열거타입을 정의할 대 주어진 순번을 말하는데.
		// 0번부터 시작한다.
		// 예를들어 열거타입 Week의 열거객체 순번은 다음과 같이 결정된다.
		// 아래 코드는 today가 참조하는 열거 객체가 전체 열거 객체에서 몇번째 순번인지 알아내는 코드이다.
		// ordinal() 메소드는 6을 리턴해서 ordinal 변수에 저장한다.
		
		// Week today = Week.SUNDAY;
		// int ordinal = today.ordinal();
		
		// compareTo() 메소드
		
		// compareTo() 메소드는 매개값으로 주어진 열거 객체를 기준으로 전후로 몇 번째 위치하는지를 비교한다.
		// 만약 열거 객체가 매개값의 열거 객체보다 순번이 빠르다면 음수가, 순번이 늦담ㄴ 양수가 리턴된다.
		// 아래 코드는 day1과 day2의 상대적 위치를 비교하는 코드이다.
		// day1, compareTo(day2)는 day2를 기준으로 day1의 상대적 위치를 리턴한다.
		// day1(순번:0)이 day2(순번2)보다 앞의 위치하고 순번 차이가 2이므로 result1은 음수 -2가 저장된다.
		// 그러나 day2.compareTo(day1)은 day1을 기준으로 day2의 상대적 위치를 리턴한다.
		// 따라서 day2가 day1보다 뒤에 위치하고 순번 차이가 2이므로 result2는 양수가 2가 저장된다.
		
//		Week day1 = Week.MONDAY;
//		Week day2 = Week.WENSDAY;
//		int result1 = day1.compareTo(day2);
//		int result2 = day2.compareTo(day1);
		
		
		// valueOf() 메소드
		
		// valueOf() 메소드는 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체흘 리턴한다.
		// 이 메소드는 외부로부터 문자열을 입력받아 열거 객체로 변환할 때 유용하게 사용할 수 있다.
		// 다음 코드에서 weekDay 변수는 Week.SATURDAY 열거 객체를 참조하게 된다.
		
		// Week weekDay = Week.valueOf("SATURDAY");
		
		
		// value() 메소드
		
		// values() 메소드는 열거 타입의 모든 열거 객체들을 배열로 만들어 리턴한다.
		// 다음은 Week 열거 타입의 모든 열거 객체를 배열을 만들어 향상된 for문을 이용해서 반복하는 코드이다
		
//		Week[] days = Week.value();
//		for(Week day : days) {
//			System.out.println(day);
//		}
		
		// Week배열은 다음과 같이 생선된다. 배열이 인덱스는 열거 객체의 순번과 같고 각 인덱스 값은 해당 순번의 열거 객체 번지이다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

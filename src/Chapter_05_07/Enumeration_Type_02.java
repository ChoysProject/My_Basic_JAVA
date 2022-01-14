package Chapter_05_07;

public class Enumeration_Type_02 {

	public static void main(String[] args) {

		
		// 열거 타입 선언
		
		// 열거타입을 선언하기 위해서는 먼저 열거 타입의 이름을 정하고 열거 타입 이름으로 소스 파일(.java)을 생성해야한다.
		// 열거 타입 이름은 관례적으로 첫 문자를 대문자로 하고 나머지는 소문자로 구성한다. 
		// 만약 여러단ㅓ로 구성된 이름이라면 단어 첫 문자는 대문자로 하는 것이 관례이다.
		// 다음은 잘 만들어진 열거 타입 소스 파일들의 이름이다.
		
		// Week.java
		// MemberGrade.java
		// ProductKind.java
		
		// 소스 파일의 내용으로는 다음과 같이 열거 타입 선언이 온다.
		// public enum 키워드는 열거 타입을 선언하기 위한 키워드이다.
		// 반드시 소문자로 작성해야 한다.
		// 열거 타입 이름은 소스 파일명과 대소문자가 모두 일치해야 한다.
		
		// public enum 열거타입이름 { --- }
		
		// 열거 타입을 선언했다면 이제는 열거 상수를 선언하면 된다.
		// 열거 상수는 열거 타입의 값으로 사용되는데, 관례적으로 열거 상수는 모두 대문자로 작성한다.
		
		// public 열거타입이름 { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
		
		// 만약 열거 상수가 여러 단어로 구성될 경우에는 단어 사이를 밑줄(_)로 연결하는것이 관례이다.
		// 예를들면 다음과 같다.
		
		// public enum LoginResult {LOGIN_SUCCESS, LOGIN_FAILED}
		
		// 열거 타입을 이클립스에서 생성해보자.
		// Package Explorer 뷰에서 프로젝트를 선택한 다음 메뉴에서 [File -> New -> Enum]을 선택한다.
		// 다음 그림과 같이 [New Enum Type] 대화상자의 [Package] 입력란에는 열거 타입이 속할 패키지 명을 입력하고, [Name]입력란에는 열거 타입 이름인 Week를
		// 입력한 후 [Finish] 버튼을 클릭한다.
		// 그리고 다음과 같이 열거 상수를 작성하면 된다.
		
		
		
		
		
		
	}

}

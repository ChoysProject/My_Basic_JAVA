package Chapter_06_03;

public class Class_01 {

	public static void main(String[] args) {

		// 클래스 선언
		
		// 이제부터 클래스를 선언하는 방법에 대해 알아볼 것이다.
		// 사용하고자 하는 객체를 구상했다면,
		// 그 객체의 대표 이름을 하나 결정하고 이것을 클래스 이름으로 한다.
		// 예를 들어 사람 객체의 클래스는 Person으로, 자동차 객체의 클래스는 Car라는 이름으로 줄 수 있다.
		// 클래스 이름은 다른 클래스와 식별할 목적으로 사용되므로 자바의 식별자작성 규칙에 따라서 만들어야 한다.
		
		// 번호		작성규칙							예
		// 1		하나 이상의 문자로 이루어져야 한다.		Car, SportsCar
		// 2		첫 번째 글자는 숫자가 올 수 없다		Car, 3Car(3)x
		// 3		'$','_'외의 특수 문자는 사용할 수 없다.	$Car,_Car, @Car(x),#Car(x)
		// 4		자바 키워드는 사용할 수 없다.			int(x), for(x)
		
		// 클래스 이름은 한글이든 영어든 상관없지만, 한글로 클래스 이름을 만드는 경우는 거의 없다,
		// 자바 언어는 영어 대소문자를 다른 문자로 취급하기 때문에 클래스 이름도 영어 대소문자를 구분한다.
		// 관례적으로 클래스 이름이 단일 단어라면 첫 자를 대문자로 하고 나머지는 소문자로 작성한다.
		// 만약 서로 다른 단어가 혼합된 이름을 사용한다면 각 단어의 첫 머리 글자는 대문자로 작성하는 것이 관례이다.
		
		// Calculator, Car, Member, ChatClient, ChatServer, WEB_bROWSER
		
		// 클래스 이름을 정했다면 "클래스 이름.java"로 소스 파일을 생성해야 한다.
		// 소스 파일 이름 역시 대소문자를 구분하므로 반드시 클래스 이름과 대소문자가 같도록 해야한다.
		// 소스 파일을 생성했다면 소스 파일을 열고 다음과 같이 클래스를 선언해준다.
		
		// public class 클래스이름{
		//}
		
		// 여기서 public class 키워드는 클래스를 선언할 때 사용하며 반드시 소문자로 작성해야 한다.
		// 클래스 이름 뒤에는 반드시 중괄호{}를 붙여주는데, 중괄호 시작 { 은 클래스 선언의 시작을 알려주고
		// 괄호 끝} 클래스 선언의 끝을 알려준다.
		// 다음 Car 클래스 선언한 것이다.
		
		// public class Car{
		// }

		// 일반적으로 소스 파일당 하나의 클래스를 선언한다. 하지만, 두 개 이상의 클래스 선언도 가능하다.
		
		// public class Car{
		//}
		// class Tire{
		//}
		
		// 두 개 이상의 클래스가 선언된 소스 파일을 컴파일 하면 바이트 코드 파일은(.class) 클래스를 선언한 개수 만큼 생긴다.
		// 결국 소스 파일은 클래스 선언을 담고 있는 저장 단위일 뿐, 클래스 자체가 아니다.
		// 상기 코드를 컴파일하면 Car.class와 Tire.class가 각각 생성된다.
		// 주의할 점은 파일 이름과 동일한 이름의 클래스 선언에만 pulic 접근 제한자를 붙일 수 있다.
		// 아직 pulic 접근 제한자의 의미는 ㅁ른다고 하더라도 소스 파일을 생성할 때 꼭 기억해야 할 내용이다.
		// 만약 파일 이름과 일치하지 않는 클래스 선언에 pulic 접근 제한자를 붙이면 컴파일 에러가 발생한다.
		// 가급적이면 소스파일 하나당 동일한 이름의 클래스 하나를 선언하는 것이 좋다.
	
	
	}

}
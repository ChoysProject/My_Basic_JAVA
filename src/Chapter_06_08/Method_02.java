package Chapter_06_08;

public class Method_02 {

	public static void main(String[] args) {

		// 메소드 선언
		
		// 메소드 선언은 선언부 (리턴타입, 메소드이름, 매개변수선언)와 실행 블록으로 구성된다.
		// 메소드 선언부를 메소드 시그너처라고도 한다.
		
		
		
		// 리턴타입
		
		// 리턴타입은 메소드가 실행 후 리턴하는 값의 타입을 말한다.
		// 메소드는 리턴값이 있을 수도 있고 없을 수도 있다.
		// 메소드가 실행 후 결과를 호출한 곳에 넘겨줄 경우에는 리턴값이 있어야 한다.
		// 예를들어 전자계산기 객체에서 전원을 켜는 powerOn() 메소드와 두 수를 나누는 기능인 divide() 메소드가 있다고 가정해보자.
		// divide() 메소드는 나눗셈의 결과를 리턴해야 하지만
		// powerOn()는 리턴값이 있다고 봐야한다. 리턴값이 없는 메소드는 리턴타입에 void가 와야하며 리턴값이 있는 메소드는 리턴값의 타입이 와야한다.
		// divide() 메소드의 결과가 double 값이라면 double을 리턴 타입으로 사용해야 한다.
		
//		void powerOn() {}
//		double divide(int x, int y) {}
 		
		// 리턴값이 있느냐 없느냐에 따라 메소드를 호출하는 방법이 조금 다르다.
		// 위의 두 메소드는 다음과 같이 호출할 수 있다.
		
//		powerOn();
//		double result = divide(10,20);
		
		// powerOn() 메소드는 리턴값이 없기 때문에 변수에 저장할 내용이 없다.
		// 단순히 메소드만 호출하면 된다.
		// 그러나 divide() 메소드는 10을 20으로 나눈 후 0.5를 리턴하므로 이것을 저장할 변수가 있어야 한다.
		// 리턴값을 받게 위해 변수는 메소드의 리턴 타입인 double 타입으로 선언되어야 한다.
		
		// 만약 result 변수를 int 타입으로 선언하게 되면 double 값을 저장할 수 없기 떄문에 컴파일 에러가 발생한다.
		
		// int result = divide(10,20); // 컴파일 에러
		
		// 리턴 타입이 있다고 해서 반드시 리턴값을 변수에 저장할 필요는 없다.
		// 리턴값이 중요하지않고, 메소드 실행이 중요할 경우에는 다음과 같이 변수 선언 없이 메소드를 호출할 수도 있다.
		
//		devide(10,20);
		
		
		
		// 메소드 이름
		
		// 메소드 이름은 자바 식별자 규칙에 맞게 작성하면 되는데, 다음 사항에 주의하면 된다.
		
//		- 숫자로 시작하면 안 되고, $와_를 제외한 특수문자를 사용하지 말하야 한다.
//		- 관례적으로 메소드명은 소문자로 작성한다.
//		- 서로 다른 단어가 혼합된 이름이라면 뒤이어 오는 단어의 첫머리 글자는 대문자로 작성한다.
		
		// 다음은 잘 작성된 메소드 이름을 보여준다.
		
//		void run() {}
//		void startEngine() {}
//		String getName() {}
//		int[] getScores() {}

		// 메소드 이름은 이 메소드가 어떤 기능을 수행하는지 쉽게 알 수 있도록 기능 이름으로 지어주는 것이 좋다.
		// 메소드명의 길이는 프로그램 실행과는 무관하니, 너무 짧게 주지 않도록 한다.
		
		
		// 매개 변수 선언
		
		// 매개 변수는 메소드가 실행할 때 필요한 데이터를 외부로부터 받기 위해 사용된다.
		// 매개 변수도 필요한 경우가 있고 필요 없는 경우가 있다.
		// 예를들어 powerOn() 메소드는 그냥 전원만 켜면 그만이지만,
		// divde() 메소드는 나눗셈할 두 수가 필요하다.
		// 다음은 매개 변수가 있는 divide() 메소드 선언 예를 보여준다.
		
//		double divide(int x, int y) {}
		
		// 이렇게 선언된 dicide() 메소드를 호출할 때에는 반드시 두 개의 int 값을 주어야 한다.
		
//		double rewsult divide(10,20);
		
		// 호출 시 넘겨준 매개값인 10과 20은 해당 위치의 매개 변수인 x와 y에 각각 저장되고, 이 매개 변수들을 이용해서 메소드 블록을 실행하게 된다.
		// 매개값은 반드시 매개 변수의 타입에 부합되는 값이어야 한다.
		//divide() 메소드가 int 타입 매개 변수를 가지고 있다면 호출 시 매개값으로 int 값이나 int 타입으로 변환될 수 있는 값을 넘겨주어야 한다.
		// 다음은 잘못된 매개값을 사용해서 컴파일 오류가 발행한다.
		
//		double result = devide(10.5, 20.0);
		
		// 10.5와 20.0은 double 값이므로 int 타입으로 변환될 수 없다.
		//하지만 다음 코드는 컴파일 오류가 생기지 않고 정상적으로 실행된다.
		// 매개값의 타입(byte)과 매개 변수의 타입(int)이 달라도 byte 타입은 int 타입으로 자동 타입 변환되기 떄문에 컴파일 오류가 생기지 않는다.
		
//		byte b1=10;
//		byte b2=20;
//		double result = divide(b1,b2);
		
		// 다음은 Calculator 클래스에서 powerOn(), plus(), divide(),powerOff() 메소드를 선언한 것이다. plus()와 divide() 메소드에서 사용된 return 문은 다음 절에서 설명한다.
		
		// 외부 클래스에서 Example 클래스의 메소드를 호출하기 위해서는 다음 예제와 같이 3라인에서 객체를 생성하고 참조 변수인 myCalc를 이용해야 한다.
		// myCalc 변수에 도트(.)와 함께 메소드이름(매개값,..) 형태로 호출하면 메소드 블록이 실행된다.
		
		
		// 매개 변수의 수를 모를 경우
		
		// 메소드의 매개 변수는 개수가 이미 정해져 있는 것이 일반적이지만, 경우에 따라서는 메소드를 선언할 때 매개 변수의 개수를 알 수 없는 경우가 있다.
		// 예를 들어 여러개의 수를 모두 합산하는 메소드를 선언해야 한다면, 몇개의 매개 변수가 입력 될지 알 수 없기 때문에 매개 변수의 개수를 결정할 수 없을 것이다.
		
//		int sum1(int[] value) {}
//		int result = sum1(value);
//		int result = sum1(new int[] {1,2,3,4,5});
		
		// 매개 변수를 배열 타입으로 선언하면, 메소드를 호출하기 전에 배열을 생성해야 하는 불편한 점이 있다.
		// 그래서 배열을 생성하지 않고 값의 리트만 넘겨주는 방법도 있다.
		// 다음과 같이 sum2() 메소드의 매개변수를 ---를 사용해서 선언하게 되면, 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용된다.
		
//		int sum2(int -- value) {}
		
//		---로 선언된 매개 변수의 값은 다음과 같이 메소드 호출 시 리스트로 나열해주면 된다.
		
		// int result = sum2 (1,2,3);
		// int result = sum2(1,2,3,4,5,6);
		
		// --- 로 선언된 매개 변수는 배열 타입으로 다음과 같이 배열을 직접 매개값으로 사용해도 좋다.
		
		
//		int[] values= {1,2,3};
//		int result = sum2(values);
//		int result = sum2(new int[] {1,2,3,4,5});
	
		
		// 다음 예제는 매개 변수를 배열로 선언한 sum1()과 매개 변수를 ---로 선언한 sum2()의 작성방법을 보여준다.
		// 둘 다 항목의 값을 모두 더해서 리턴한다.
		
		
	}

}

package Chapter_05_03;

public class Reference_Variable_01 {

	public static void main(String[] args) {

		// 참조 변수의 ==. != 연산
		
		// 기본 타입 변수의 ==. != 연산은 변수의 값이 같은지, 아닌지를 조사하지만 참조타입 변수들 간의 ==, != 연산은 동일한 객체를 참조하는지,
		// 다른 객체를 참조하는지 알아볼 때 사용된다. 
		// 참조 타입 변수의 값은 힙 영역의 객체 주소이므로 결국 주소 값을 비교하는 것이 된다.
		// 동일한 주소 값을 갖고 있다는 것은 동일한 객체를 참조한다는 의미이다. 
		// 따라서 동일한 객체를 참조하고 있을 경우 == 연산의 결과는 true이고, != 연산의 결과는 false 이다.
		
		// refVar1 == refVar2  결과 : false 
		// refVar1 != refVar2  결과 : true
		
		// refVar2 == refVar3 결과 : true
		// refVar2 != refVar3 결과 : false
		
		// ==와 != 연산자로 객체를 비교하는 코드는 일반적으로 if문에서 많이 사용된다.
		// 다음은 변수 refVar2와 refVar이 같은 객체를 참조할 경우 if 블록을 실행하도록 코딩한 것이다.
		
		// if ( refVar2 == refVar3) {'''}
		
		
		
		
	}

}

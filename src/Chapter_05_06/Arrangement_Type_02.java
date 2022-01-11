package Chapter_05_06;

public class Arrangement_Type_02 {

	public static void main(String[] args) {

		// 배열 선언
		
		// 배열을 사용하기 위해서는 우선 배열 변수를 선언해야한다. 배열 변수 선언은 다음과 같이 두가지 형태로 작성할 수 있다.
		
		// 타입 [ ] 변수; 
		// 타입 변수 [ ]
		// 대괄호 [ ] 는 배열 변수를 선얺나ㅡㄴ 기호로 사용되는데, 타입 뒤에 붙을 수도 있고 변수 뒤에 붙은수도 있다. 
		// 타입은 배열에 저장될 데이터의 타입을 말한다.
		// 다음은 각 타입별로 배열을 선언하는 예를 보여준다.
		
		// int[] intArray;
		// double[] doubleArray;
		// String[] strArray;
		
		// int intArray[];
		// double doubleArray[];
		// String strArray[];
		
		// 배열 변수는 참조 변수에 속한다. 뱌열도 객체이므로 힙 영역에 생성되고 배열 변수는 힙 영역의 배열 객체를 참조하게 된다.
		// 참조할 배열 객체가 없다면 배열 변수는 null 값으로 초기화될 수도 있다.
		
		// 타입[] 변수 = null;
		
		// 만약 배열 변수가 null 값을 가진 상태에서 변수[index]로 값을 읽거나 저장하게 되면 NullPointException이 발생한다.
		// 배열 변수는 배열을 생성하는 참조하는 상태에서 값을 저장하거나 읽어야한다.
		
	}

}

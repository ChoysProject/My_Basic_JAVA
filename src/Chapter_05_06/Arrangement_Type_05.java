package Chapter_05_06;

public class Arrangement_Type_05 {

	public static void main(String[] args) {

		// 배열 길이
		
		// 배열의 길이란 배열에 저장할 수 있는 전체 항목 수를 말한다. 코드에서 배열의 길이를 얻으려면 다음과 같이 배열 객체의 length 필드를 읽으면 된다.
		// 참고로 필드는 객체 내부의 데이터를 말한다.
		// 배열의 length 필드를 읽기 위해서는 배열 변수에 도트(.) 연산자를 붙이고 length를 적어주면 된다.
		
		// 배열변수.length;
		
		// 다음은 배열 intArray의 길이를 알아보는 코드이다.
		// 배열 intArray가 3개의 값을 가지고 있기 때문에 변수 num에는 3이 저장된다.
		
		int[] intArray = {10,20,30};
		int num = intArray.length;
		
		// length 필드는 읽기 전용 필드이기 떄문에 값을 바꿀 수가 없다.
		// 그래서 다음과 같이 작성하면 안된다.
		
		// intArray.length = 10; // 잘못된 코드
		// 배열의 length 필드는 for문을 사용해서 배열 전체를 루핑할 때 매우 유용하게 사용할 수 있다.
		
		
		// for문의 조건식에서 < 연산자를 사용한 이유는 배열의 마지막 인덱스는 배열 길이보다 1이 적기 떄문이다. 배열의 인덱스 범위는 0~(길이-1)이다. 만약 인덱스를 초과해서 사용하면 ArrayIndexOutOfBoundsException이 발생한다.
		
		
	}

}

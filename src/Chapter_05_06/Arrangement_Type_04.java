package Chapter_05_06;

public class Arrangement_Type_04 {

	public static void main(String[] args) {

		// New 연산자로 배열 생성
		
		// 값의 목록을 가지고 있지만, 향후 값들을 저장할 배열을 미리 만들고 싶다면 new 연산자로 다음과 같이 배열 객체를 생성시킬 수 있다.
		
		// 타입[] 변수 = new 타입[길이];
		
		// 길이는 배열이 저장할 수 있는 값의 수를 말한다. new 연산자로 배열을 생성할 경우에는 이미 배열 변수가 선언된 후에도 가능하다.
		
		// 타입[] 변수 = null;
		// 변수 = new 타입[길이];
		
		// 다음은 길이 5인 int[] 배열을 생성한다.
		
		// int[] intArray = new int[5];
		
		// 자바는 intArray[0] ~ intArray[4]까지 값이 저장될 수 있는 공간을 확보하고 배열의 생성 번지를 리턴한다.
		// 리턴된 번지는 intArray 변수에 저장된다. 각각의 항목 크기는 다음과 같이 int 타입의 크기인 4byte이다.
		
		// new 연산자로 배열을 처음 생성할 경우, 배열은 자동적으로 기본값으로 초기화 된다. 
		// 학생 30명의 점수를 저장할 배열을 다음과 같이 생성한다고 가정해보자.
		
		// int[] scores = new int[30];
		
		// socres 배열은 int 타입 배열이므로 다음과 같이 scores[0] ~ scores[29]까지 모두 기본값0으로 초기화된다.
		
		// 만약 String 배열을 생성했다면 name[0]에서 name[29] 까지 모두 null값으로 초기화된다.
		
		// String[] names = new String[30];
		
		// 다음은 타입별로 배열의 초기값을 보여준다.
		
		// 분류				데이터타입					초기값
		// 기본타입(정수)		byte[]					0
		// 기본타입(정수)		char[]					'\u0000'
		// 기본타입(정수)		short[]					0
		// 기본타입(정수)		int[]					0
		// 기본타입(정수)		long					0L
		// 기본타입(실수)		float					0.0F
		// 기본타입(실수)		double					0.0
		// 기본타입(논리)		boolean					false
		// 참조타입			클래스[]					null
		// 참조타입			Stirng[]				null
		
		
		// 배열이 생성되고 나서 새로운 값을 저장하려면 대입 연산자를 사용하면 된다.
		
		// 변수[인덱스] = 값;
		
		// 예를들어 배열 scores의 0,1,2 인덱스에 각각 83,90,75를 저장하는 코드는 다음과 같다.
		
		// int[] scores = new int[3];
		// scores[0] = 83;
		// scores[1] = 90;
		// socres[2] = 75;
		
		
		
	}

}

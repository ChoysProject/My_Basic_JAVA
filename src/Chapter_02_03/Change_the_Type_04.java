package Chapter_02_03;

public class Change_the_Type_04 {

	public static void main(String[] args) {
		// 연산식에서의 자동 타입 변환
		
		int intValue = 10;
		double doubleValue = 5.5;
		double result = intValue + doubleValue; // result 에 15.5가 저장
		
		// 만약 int 타입으로 꼭 연산을 해야한다면, double 타입을 int 타입으로 강제 변환하고 덧셈 연산을 수행하면 된다.
		
		int intValue2 = 10;
		double doubleValue2 = 5.5;
		int result2 = intValue + (int)doubleValue2; // result에 15가 저장
		
		
		char ai = 'A';
		int result3 = ai + 1; // 'A'의 유니코드보다 1이 큰 유니코드가 저장
		char na = (char) result; // 'B'가 저장됨
		
	}

}

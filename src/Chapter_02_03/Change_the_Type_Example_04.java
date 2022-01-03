package Chapter_02_03;

public class Change_the_Type_Example_04 {

	public static void main(String[] args) {

		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println("result = " + result);
		
		// 실형결과보면 0이 아니라 엉뚱한 결과가 나온다.
		// 이유는 int 값을 float 타입으로 자동 변환하면서 문제가 발생했기 때문이다. float 타입은 다음과 같이 비트 수가 할당 되어있다.
		
		// float : 부호(1비트) + 지수(8비트) + 가수(23비트)
		
		// int 값을 손실 없이 float 타입의 값으로 변환할 수 있으려면 가수 23비트로 표현 가능한 값이어야한다.
		// 123456780 은 23비트로 표현 할 수 없기 때문에 근사치로 변환됨.
		// 즉 정밀도 손실이 발생한다. 그렇기 떄문에 float값을 다시 int 타입으로 변환하면, 원래 int 값을 얻지 못한다.
		// 따라서 9라인에서 num1과 num2는 동일한 값이 아니다. 해결책은 모든 int 값을 실수 타입으로 안전하게 변환시키는 double 타입을 사용해야한다.
		
		// double 타입 : 부호(1비트) + 지수(11비트) + 가수 (52비트)
		
		//double 은 32비트이무로 어떠한 값도 안한하게 손실없이 타입변환이 가능하다.
		
	}

}

package Chapter_03_01;

public class Operator_01 {

	public static void main(String[] args) {

		// 프로그램에서 데이터를 처리하여 결과를 산출하는 거을 연산(Operations)라고 한다. 
		// 연산에서 사용되는 표시나 기호를 연산자(Operator)라고 하고, 연산되는 데이터는 피연산자(operand)라고 한다.
		// 연산자와 피연산자를 이용하여 연산의 과정을 기술한 것을 연산식(expressions)이라고 부른다.
		// 예를 들어 다음 연산식에서 + - * == 은 연산자이고, x y z 변수는 피연산자이다.
		
		// x + y
		// x - y 
		// x * y + z
		// x == y
		
		// 자바 언어에서는 다양한 연산자를 제공하고 있다. 이 연산자들은 피연산자를 연산해서 값을 산출하는데, 산출되는 값의 타입은 연산자 별로 다르다.
		// 예를 들어 산술 연산자일 경우는 숫자 타입 (byte, short, int, long, float, double)으로 결과값이 나오고, 비교 연산자와 논리 연산자는 논리 타입으로 나온다.
		
		// 단항 연산자 : ++x;
		// 이항 연산자 : x+y;
		// 삼항 연나자 : (sum>90) ? "A" : "B";
		
		// 연산식은 반드시 하나의 값을 산출한다.
		// 연산자 수가 아무리 많아도 두 개 이상의 값을 산출하는 연산식은 없다.
		// 그렇기 때문에 하나의 값이 올 수 있는 곳이면 어디든지 값 대신에 연산식을 사용할 수 있다.
		// 보통 연산식의 값은 변수에 저장하는데, 다음과 같이 x와 y 변수의 값을 더하고 나서 result 변수에 저장한다.
		
		// int rsult = x+y;
		
		// 연산식은 다른 연산식의 피연산자 위치에도 올 수 있다. 
		// 다음과 같이 비교 연ㅅ나자인 < 의 좌측 피연산자로 (x+y)라는 연산식이 사용되어, x와 y변수의 값을 더하고 나서 5보다 작은지 검사한 후 결과값 (true 또는 false)을 result 변수에 저장한다.
		
		// boolean result = (x+y) < 5;
		
		
		
	}

}

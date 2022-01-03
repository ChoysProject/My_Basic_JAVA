package Chapter_03_03;

public class Operator_Example_07 {

	public static void main(String[] args) {

		// 오버 플로우
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;

		System.out.println("z = " + z);
		
		// 정상적인 값이 들어가지 않고 int가 수용할 수 있는 범위의 수를 넘어서기 떄문에 올바른 예제라고 할 수 없다.
		
		// 올바른 값이 들어가게 하기 위해서, 변수 x와 변수 y중 하나라도 long 타입이 되어야하고, 변수 z는 long타입이 되어야 한다.
		
	}

}

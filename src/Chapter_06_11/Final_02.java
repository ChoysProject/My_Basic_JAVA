package Chapter_06_11;

public class Final_02 {

	public static void main(String[] args) {

		
		// 상수 (static final)
		
		// 일반적으로 불변의 값을 상수라고 부른다.
		// 불변의 값은 수학에서 사용되는 원주율 파이나, 지구의 무게 및 둘레등이 해당된다.
		// 이런 불변의 값을 저장하는 필드를 자바에서는 상수(constant)라고 한다.
		// final 핗ㄹ드는 한 번 초기화되면 수정할 수 없는 필드라고 했다.
		// 그렇다면 final 필드를 상수라고 불러도 되지 않을까? 
		// 하지만 final 필드를 상수라고 부르진 않는다.
		// 왜냐하면 불변의 값은 객체마다 저장할 필요가 없는 공용성을 띠고 있으며,
		// 여러가지 값으로 초기화될 수 없기 떄문이다.
		// final 필드는 객체마다 저장되고, 생성자의 매개값을 통해서 여러 가지 값을 가질 수 있기 때문에 상수가 될 수 없다.
		// 객체마다 저장할 필요가 없는 공용성을 띤다는 말에 힌트를 얻었는지 모르겠다.
		// 상수는 static이면서 final이어야 한다.
		// static final 필드는 객체마다 저장되지 않고, 클래스에만 포함된다.
		// 그리고 한 번 초기값이 저장되면 변경할 수 없다.
		
//		static final 타입 상수 [ = 초기값];
		
		// 초기값이 단순 값이라면 선언 시에 주는 것이 일반적이지만, 복잡한 초기화일 경우 정적 블록에서도 할 수 있다.
		
//		static final 타입 상수;
//		static {
//			상수 = 초기값;
//		}
		
		// 상수 이름은 모두 대문자로 작성하는 것이 관례이다.
		// 만약 서로 다른 단어가 혼합된 이름이라면 언더바(_)로 단어들을 연결해 준다.
		// 다음은 상수 필드를 올바르게 선언한 예를 보여준다.
		
//		static final double PI = 3.14159;
//		static final double EARTH_SURFACE_AREA;
		
		
		
		
		
		
		
		
		 
	}

}

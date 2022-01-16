package Chapter_06_01;

public class Object_05 {

	public static void main(String[] args) {

		
		
		// 객체 지향 프로그래밍의 특징
		
		// 객체 지향 프로그램의 특징으로는 캡슐화, 상속, 다형성을 들 수 있다.
		// 이들의 특징은 자바 언어를 학습하면서 자연스럽게 알게 되는데,
		// 여기서는 이 특징들의 개념만 간단히 살펴보기로 하자.
		
		// 캡슐화 (Encapsulation)
		
		// 캡슐화란 객체의 필드, 메소드를 하나로 묶고, 실제 구현 내용을 감추는 것을 말한다.
		// 외부 객체는 객체 내부의 구조를 알지 못하며 객체가 노출해서 제공하는 필드와 메소드만 이용할 수 있다.
		
		// 필드와 메소드를 캡슐화하여 보호하는 이유는 외부의 잘못된 사용으로 인해 객체가 손상되지 않도록 하는데 있다.
		// 예를 들어 TV의 중요한 부품이 바깥으로 노출되어 있다면, 사용자의 실수로 인해 고장날 수도 있다.
		// 이런 중요한 부품은 TV 안쪽으로 캡슐화하여 숨겨두어야 한다.
		// 함부로 만지지못하도록 말이다.
		
		// 자바 언어는 캡슐화된 멤버를 노출시킬 것인지, 숨길 것인지를 결정하기 위해 접근 제한자(Access Modifier)를 사용한다.
		
		// 접근 제한자는 객체의 필드와 메소드의 사용 범위를 제한함으로써 외부로부터 보호한다.
		
		
		// 상속 (Ingeritance)
		
		// 일반적으로 상속은 부모가 가지고 있는 재산을 자식에게 물려주는 것을 말한다. 
		// 자식은 특별한 노력없이 부모가 물려준 재산을 갖게 된다. 객체 지향 프로그래밍에서도 부모 역할을 상위 객체와 자식 역할의 하위객체가 있다.
		// 상위 객체는 자기가 가지고 있는 필드와 메소드를 하위 객체에게 물려주어 하위 객체가 사용할 수 있도록 해준다.
		
		// 상속 상위 객체를 재사용해서 하위 객체를 쉽고 빨리 설계할 수 있도록 도와주고, 이미 잘 개발된 객체를 재사용해서 새로운 객체를 만들기 때문에 반복된 코드의 중복을 줄여준다.
		// 예를 들어 필드1, 필드, 메소드1, 메소드2를 가지는 객체를 설계한다고 생각해보자.
		
		// 4개를 모두 처음으로부터 설계하는 것보다는 이미 필드1과 메소드1이 있는 객체가 있다면, 이것을 상속하고, 필드2와 메소드2만 설계하는 것이 보다 효율적이고 개발시간을 절약시켜준다.
		// 상속은 상위 개체의 수정으로 모든 하위 객체들의 수정 효과를 가져오므로 유지 보수 시간을 최소화 시켜주기도 한다.
		// 예를 들어 객체가 B,C가 객체 A를 상속할경우 A의 필드와 메소드를 수정함으로써 객체 B, C를 수정하지 않아도 객체 A의 수정된 필드와 메소드를 사용할 수 있다.
		
		
		// 다형성 (Polymorphism)
		
		// 다형성은 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질을 말한다.
		// 코드 측면에서 보면 다형성은 하나의 타입에 여러 객체를 대입함으로써 다양한 기능을 이용할 수 있도록 해준다.
		// 자바는 다형성을 위해 부모클래스 또는 인터페이스의 타입에는 모든 구현 객체가 대입될 수 있다.
		// 다형성의 효과로 객체는 부품화가 가능하다.
		// 예를 들어 자동차를 설계할 때 타이어 인터페이스 타입을 적용했다면 이 인터페이스를 구현한 실제 타이어들은 어떤 것이든 상관없이 장착(대입)이 가능하다.
		
	}

}

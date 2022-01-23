package Chapter_06_07;

public class Constructor_05 {

	public static void main(String[] args) {

		
		// 생성자 오버로딩 (Overloading)
		
		// 외부에서 제공되는 다양한 데이터들을 이용해서 객체를 초기화 하려면 생성자도 다양화될 필요가 있다.
		// Car 객체를 생성할 때 이부에서 제공되는 데이터가 없다면 기본 생성자로 Car 객체를 생성해야 하고, 외부에서 model 데이터가
		// 제공되거나 model과 color가 제공될 경우에도 Car 객체를 생성할 수 있어야 한다.
		// 새성자가 하나뿐이라면 이러한 요구 조건을 수용할 수 없다.
		// 그래서 자바는 다양한 방법으로 객체를 생성할 수 있도록 생성자 오버로딩을 제공한다.
		// 생성자 오버로딩이란 매개 변수를 달리하는 생성자를 여러개 선언하는 것을 말한다.
		
//		public class 클래스{
//			클래스 (타입 매개변수){
//				
//			}
//
//			클래스 (타입 매개변수){
//				
//			}
//			
//			매개 변수의 타입, 개수 순서가 다르게 선언
//		}

		// 다음은 Car클래스에서 생성자를 오버로딩한 예를 보여준다.
		
//		public class Car {
//			Car(){}
//			Car(String model){}
//			Car(String model, String color){}
//			Car(String model, String color, int maxSpeed){}
//		
//		}
		
		// 생성자 오버로딩 시 주의할 점은 매개 변수의 타입과 개수 그리고선언된 순서가 똑같을 경우 매개변수 이름만 바꾸는 것은 생성자 오버로딩이라고 볼수 없다.
		// 다음과 같은 경우에 해당된다.
		
//		Car(String model, String color){}
//		Car(String color, String model){} // 오버로딩이 아님
		
		// Car car1 = new Car();
		// Car car2 = new Car("그랜져");
		// Car car3 = new Car("그랜져", "흰색");
		// Car car4 = new Car("그랜져", "검정색", 3000);
		
		// new Car()는 기본 생성자로 객체를 생성하고, new Car(그랜저)는 Car (String model) 생성자로 객체를 생성한다.
		// new Car("그랜저", "흰색")는 Car (Stirng model, String color) 생성자로 객체를 생성하고 new Car("그랜저","흰색", 3000)는 Car(String model, String color, int maxSpeed)
		// 생성자로 객체를 생성한다.
		// 다음 예제는 Car 생성자를 오버로딩해서 CarExample 클래스에서 다양한 방법으로 Car 객체를 생성하도록 했다.
		
		
		
	}

}

package Chapter_06_06;

public class Field_Example_02 {

	public static void main(String[] args) {

		
		// 외부 클래스에서 Car 필드값 읽기와 변경
		
		
		// 객체 생성
		Field_Example_01 myCar = new Field_Example_01();
		
		// 필드값 읽기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("컬러 : " + myCar.color);
		System.out.println("최대 속도 : " + myCar.maxSpeed);
		System.out.println("현재 속도 : " + myCar.speed);
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("현재 속도 : " + myCar.speed);
		
	}

}

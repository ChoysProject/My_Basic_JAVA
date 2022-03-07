package Chapter_06_10;

public class Static_Example_07 {

	public static void main(String[] args) {

		// 싱글톤 객체
		
		/*
		 * Static_Example_06 obj1 = new Static_Example_06(); // 컴파일 에러
		 * Static_Example_06 obj2 = new Static_Example_06(); // 컴파일 에러
		 * 
		 */
		
		Static_Example_06 obj1 = Static_Example_06.getInstance();
		Static_Example_06 obj2 = Static_Example_06.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
		
	}

}

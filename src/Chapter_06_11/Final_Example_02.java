package Chapter_06_11;

public class Final_Example_02 {

	public static void main(String[] args) {

		Final_Example_01 p1 = new Final_Example_01("123456-1234567", "조영상");
		
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa"; // final 필드는 값 수정 불가.
		// p1.ssn = "654231-6543210" // final 필드는 값 수정 불가
		p1.name = "을지문덕";
		System.out.println("바뀐 값 = " + p1.name);
	}

}

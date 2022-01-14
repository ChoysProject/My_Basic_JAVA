package Chapter_05_06;

public class Arrangement_Type_Example_07 {

	public static void main(String[] args) {

		
		// 객체를 참조하는 배열
		
		String[] strArray = new String[3];
		
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println("Result_1 : " + strArray[0]==strArray[1]);
		System.out.println("Result_2 : " + strArray[0]==strArray[2]);
		System.out.println("Result_3 : " + strArray[0].equals(strArray[2]));
		
		
	}

}

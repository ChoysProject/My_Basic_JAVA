package Chapter_06_10;

public class Static_Example_03 {

	// 정적 초기화 블록
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
	
	
	
}

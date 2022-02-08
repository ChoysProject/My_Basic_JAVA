package Chapter_06_08;

public class Method_Example_07 {

	int plus(int x , int y) {
		int result = x + y;
		return result;
	}
	
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	
	
	void excute() {
		double result = avg(7,10);
		printIn("실행결과 : " + result);
	}
	
	void printIn(String message) {
		System.out.println(message);
	}
}

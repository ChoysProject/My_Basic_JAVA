package Chapter_03_03;

public class Operator_Example_22 {

	public static void main(String[] args) {

		int score = 66;
		
		char grade = (score > 90) ? 'A' : (score > 85) ? 'B' : (score > 80) ? 'C' : (score > 75) ? 'D' : 'F'; 
		
		System.out.println("학점 : " + grade + "     점수 : " + score);
		
	}

}

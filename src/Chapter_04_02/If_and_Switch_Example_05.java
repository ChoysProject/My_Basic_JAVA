package Chapter_04_02;

public class If_and_Switch_Example_05 {

	public static void main(String[] args) {

		// ��ø if��
		
		int score = (int)(Math.random()*20) + 81;
		System.out.println("���� : " + score);
		
		String grade;
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			}else {
			grade = "A";	
			}
		}else {
			if(score>=85) {
				grade ="B+";
			}else {
				grade = "B";
			}
		}
		System.out.println("���� : " + grade);
		
	}

}

package Chapter_05_06;

public class Arrangement_Type_Example_04 {

	public static void main(String[] args) {

		// �迭�� length �ʵ�
		
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		
		for(int i =0; i<scores.length;i++) {
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
		
		
		double avg = (double)sum / scores.length;
		
		System.out.println("��� : " + avg);
	}

}

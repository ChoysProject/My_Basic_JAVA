package Chapter_04_03;

public class For_and_While_Example_11 {

	public static void main(String[] args) {

		// �ٱ��� �ݺ��� ����
		
		Outter: for(char upper ='A'; upper<='Z'; upper++) {
			for(char lower='a';lower<='z'; lower++) {
				System.out.println(upper + " - " + lower);
			if(lower == 'g') {
				break Outter;
				}
			}
		}
		System.out.println("���α׷� ���� ����");
	}

}

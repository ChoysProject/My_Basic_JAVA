package Chapter_04_03;

public class For_and_While_Example_12 {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println("i value = " + i);
		}
		
	}

}

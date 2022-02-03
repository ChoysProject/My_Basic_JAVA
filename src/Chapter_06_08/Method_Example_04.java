package Chapter_06_08;

public class Method_Example_04 {

	public static void main(String[] args) {

		Method_Example_03 myCom = new Method_Example_03();
		
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 :" + result1);
		
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : "+ result2);
		
	}

}

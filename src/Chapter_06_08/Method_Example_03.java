package Chapter_06_08;

public class Method_Example_03 {

		// 매개 변수의 수를 모를 경우
		

	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
//	int sum2 (int ...is values) {
//		int sum = 0;
//		for(int i=0; i<values.length;i++) {
//			sum+= values[i]
//		}
//		return sum;
//	}
	

}

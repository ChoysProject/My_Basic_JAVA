package Chapter_05_06;

public class Arrangement_Type_Example_08 {

	public static void main(String[] args) {

		
		// for문으로 배열 복사
		
		
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i =0; i<oldIntArray.length;i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		
		for(int i=0; i<newIntArray.length;i++) {
			System.out.print("newIntArray value : " + newIntArray[i] + ", ");
		}
	
		
		// 위 코드는 다음과 같이 배열을 복사시킨다.
		// 복사되지 않은 항목은 int[] 배열의 기본 초기값 0이 그대로 유지된다.
		// 이번에는 System.arraycopy() 메소드를 이용해서 배열을 복사해보자. System.arraycopy()를 호출하는 방법은 다음과 같다.
		// System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
		
		// src 매개값은 원본 배열이고, srcPost는 원본 배열에서 복사할 항목의 시작 인덱스이다.
		// dest 매개값은 새 배열이고, destPos는 새 배열에서 붙여넣을 시작 인덱스이다.
		// 마지막으로 length는 복사 할 개수이다.
		// 예를들어 원본 배열이 arr1이고 새 배열이 arr2일 경우 arr1의 모든 항목을 arr2에 복사하려면 다음과 같이 System.arraycopy() 메서드를 호출하면된다.
		
		

	}

}

package Chapter_05_06;

public class Arrangement_Type_Example_09 {

	public static void main(String[] args) {

		// System.arraycopy()로 배열 복사
		
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		
		for(int i=0; i<newStrArray.length;i++) {
			System.out.println(newStrArray[i] + ", ");
		}
		
		
		// 위 코드는 다음과 같이 배열을 복사시킨다. 복사되지 않은 항목은 String[] 배열의 기본 초기값 null이 그대로 유지된다.
		
		// 참조 타입 배열일 경우, 배열 복사가 되면 복사되는 값이 객체의 번지이므로 새 배열의 항목은 이전 배열의 항목이 참조하는 객체와 동일하다.
		// 이것을 얕은 복사 (shallow copy)라고 한다.
		// 반대로 깊은 복사(deep copy)는 참조하는 객체도 별도로 생성하는 것을 말한다.
		
		
		
	}

}

package Chapter_02_03;

public class Change_the_Type_03 {

	public static void main(String[] args) {

		
		// 큰 크기의 타입은 작은 크기의 타입으로 자동타입 변환을 할 수 없다.
		// 예를 들어, 4byte인 int 타입을 1byte인 byte 타입에 담을 수 없다.
		// 마치 큰 그릇의 물을 작은 그릇 안에 모두 넣을 수 없는것과 동일한 이치이다.
		// 하지만 큰 그릇을 작은 그릇 사이즈로 쪼개어서 한 조각만 작은그릇에 넣는다면 가능하다.
		// 즉 int 타입 5개의 byte로 쪼갠 다음, 끝에있는 1byte만 byte 타입 변수에 저장하다는 것은 가능하다.
		// 이와 같이 강제적으로 큰 데이터 타입을 작은 데이터 타입으로 쪼개어서 저장하는 것을 강제타입변환(Casting)이라고 한다.
		// 강제 타입 변환은 캐스팅 연산자 ()를 사용한다. 괄호 안에 들거아는 타입은 쪼개는 단위이다.
		int intValue = 103029770;
		byte byteValue = (byte) intValue; // 강제타입 변환 (캐스팅)
		
		// 하지만 위와같이 한다면 원래의 int 값은 보존되지 않는다.
		// 하지만 int 값이 끝 1byte로만 표현이 가능하다면 byte 타입으로 변환해도 같은 값이 유지될 수 있다. 이럴경우 강제타입변환이 의미있게된다.
		
		// 다른 예로 long 타입 변수에 300이 저장되어 있을 겨웅, 8byte 중 끝의 4byte 중 끝의 4byte로 300을 충분히 표현 할 수 있으므로 이것을 int 타입으로 강제 타입 변환하면 앞의 4byte는 버려지고
		// 끝의 4byte만 int 타입 변수에 저장되어 300이 그대로 유지된다.
		
		long longValue = 300;
		int intVlaue = (int) longValue; // intValue는 300이 그대로 저장된다.
		
		// int 타입은 char 타입으로 자동 변환되지 않기 떄문에 강제 타입 변환을 사용해야 한다. int 타입에 저장된 값이 유니코드 범위 (0~65535)
		// 라면 다음과 같이 캐스팅 연산자를 사용해서 타입변환 할 수 있다. 
		
		int intVlaue2 = 'A';
		char charValue = (char) intVlaue2;
		System.out.println("charValue =" + charValue);
		
		double doubleValue = 3.14;
		int intValue3 = (int)doubleValue;
		
		
		
//			기본타입			최대값 상수			최소값 상수
//		  	byte 			Byte.MAX_VALUE		Byte.MIN_VALUE
//		  	short			Short.MAX_VALUE		Short.MIN_VALUE
//		  	int				Integer.MAX_VALUE	Integer.MIN_VALUE
//		  	long			Long.MAX_VALUE		Long.MIN_VALUE
//		  	float			Float.MAX_VALUE		Float.MIN_VALUE
//		  	double			Double.MAX_VALUE	Double.MIN_VALUE
		
		
		
		
	}

}

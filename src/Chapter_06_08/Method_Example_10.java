package Chapter_06_08;

public class Method_Example_10 {

	public static void main(String[] args) {

		Method_Example_09 myCar = new Method_Example_09();
		
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도 : " + speed + "km/h");
		
	}

}

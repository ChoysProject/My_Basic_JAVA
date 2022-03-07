package Chapter_06_11;

public class Final_Example_03 {

	
	
	// 상수선언 
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	
	static {
		EARTH_SURFACE_AREA = 4* Math.PI * EARTH_RADIUS* EARTH_RADIUS;
	}
	
	
}

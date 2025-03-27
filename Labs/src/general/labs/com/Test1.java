package general.labs.com;

public class Test1 {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.name = "BMW";
		
		Car carNew = new Car();
		
		Plane plane = new Plane();
		plane.name = "Bombadier";
		
		//Plane planeNew = null;
		
		System.out.println(car.equals(null));
		
	}

}

class Car {
	
	public String name;
	
	@Override
	public boolean equals(Object obj) {
		
//		if (obj instanceof Car) {
//			System.out.println("This is a Car object");
//		}
//		if (obj instanceof Object) {
//			System.out.println("This is a Object object");
//		}

		
		if (!(obj instanceof Car))
		    return false;
		
		return true;
	}
}

class Plane {
	
	public String name;
}
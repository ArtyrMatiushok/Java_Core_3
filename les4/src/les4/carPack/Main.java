package les4.carPack;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(240, new Wheel(50), new SteeringWheel(30),
				new CarBody("Light Blue"));
		System.out.println(car);
		car.changeWheelSize(2);
		System.out.println(car);
		car.changeSteeringWheelDeiameter(2);
		System.out.println(car);
		car.addContrast("0x2FFF");
		System.out.println(car);
	}

}

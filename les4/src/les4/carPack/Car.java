package les4.carPack;

public class Car {
	private int maxSpeed;
	private Wheel wheel;
	private SteeringWheel steeringWheel;
	private CarBody carBody;
	
	public Car(int maxSpeed, Wheel wheel, SteeringWheel steeringWheel, CarBody carBody) {
		this.maxSpeed = maxSpeed;
		this.wheel = wheel;
		this.steeringWheel = steeringWheel;
		this.carBody = carBody;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public CarBody getCarBody() {
		return carBody;
	}

	public void setCarBody(CarBody carBody) {
		this.carBody = carBody;
	}

	@Override
	public String toString() {
		return "Car [maxSpeed=" + maxSpeed + ", wheel=" + wheel + ", steeringWheel=" + steeringWheel + ", carBody="
				+ carBody + "]";
	}
	
	
	public void changeWheelSize(int x) {
		wheel.changeWheelSize(x);
	}
	
	public void changeSteeringWheelDeiameter(int x) {
		steeringWheel.changeSteeringWheelDeiameter(x);
	}
	
	public void addContrast(String contrast) {
		carBody.addContrast(contrast);
	}
}

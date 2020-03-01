package les4.carPack;

public class SteeringWheel {
	private int diameter;

	public SteeringWheel(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "SteeringWheel [diameter=" + diameter + "]";
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	public void changeSteeringWheelDeiameter(int x) {
		this.diameter *= x;
	}

}

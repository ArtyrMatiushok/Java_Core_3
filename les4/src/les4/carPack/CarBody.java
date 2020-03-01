package les4.carPack;

public class CarBody {
	private String color;

	public CarBody(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CarBody [color=" + color + "]";
	}
	
	public void addContrast(String contrast) {
		this.color += (" " + contrast);
	}
}

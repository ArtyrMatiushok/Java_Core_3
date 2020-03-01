package les4.carPack;

public class Wheel {
	private int size;
	
	public Wheel() { }
	
	public Wheel(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void changeWheelSize(int x) {
		this.size *= x;
	}

	@Override
	public String toString() {
		return "Wheel [size=" + size + "]";
	}
}

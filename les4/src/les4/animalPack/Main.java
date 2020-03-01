package les4.animalPack;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal("Leopard", 100, 3);
		System.out.println("Animal name = " + animal.getAnimalName() + 
				", Animal speed = " + animal.getAnimalSpeed() + "km/h" +
				", Animal age = " + animal.getAnimalAge());
		animal.setAnimalName("Cat");
		System.out.println("Animal name = " + animal.getAnimalName() + 
				", Animal speed = " + animal.getAnimalSpeed() + "km/h" +
				", Animal age = " + animal.getAnimalAge());
		animal.setAnimalSpeed(30);
		System.out.println("Animal name = " + animal.getAnimalName() + 
				", Animal speed = " + animal.getAnimalSpeed() + "km/h" +
				", Animal age = " + animal.getAnimalAge());
		animal.setAnimalAge(1);
		System.out.println("Animal name = " + animal.getAnimalName() + 
				", Animal speed = " + animal.getAnimalSpeed() + "km/h" +
				", Animal age = " + animal.getAnimalAge());
	}
}

package les4.robPack;

import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.work();
		CoffeRobot coffeRobot = new CoffeRobot();
		coffeRobot.work();
		RobotDancer robotDancer = new RobotDancer();
		robotDancer.work();
		RobotCoocker robotCoocker = new RobotCoocker();
		robotCoocker.work();
		
		System.out.println();
		System.out.println("********************************************************");
		System.out.println();
		
		System.out.print("Enter array length: ");
		int length = in.nextInt();
		Robot[] arr = new Robot[length];
		int r = 0;
		for (int i = 0; i < arr.length; i++) {
			r = (int)(Math.random()*4);
			switch(r) {
			case 0:
				arr[i] = new Robot();
				break;
			case 1:
				arr[i] = new CoffeRobot();
				break;
			case 2:
				arr[i] = new RobotDancer();
				break;
			case 3:
				arr[i] = new RobotCoocker();
				break;
			}
		}
		for (Robot rob : arr)
			rob.work();
	}

}

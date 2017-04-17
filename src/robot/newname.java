package robot;

import org.jointheleague.graphical.robot.Robot;

public class newname {

	public static void main(String[] args) {
		Robot DrawL=new Robot("mini");
		DrawL.moveTo(50, 100);
		DrawL.penDown();
		DrawL.turn(180);
		DrawL.move(100);
		DrawL.turn(-90);
		DrawL.move(40);
		
		Robot DrawO=new Robot("mini");
		DrawO.moveTo(120, 100);
		DrawO.penDown();
		DrawO.turn(180);
		DrawO.move(100);
		DrawO.turn(-90);
		DrawO.move(40);
		DrawO.turn(-90);
		DrawO.move(100);
		DrawO.turn(-90);
		DrawO.move(40);
		
		
	}
}
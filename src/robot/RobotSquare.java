package robot;

import org.jointheleague.graphical.robot.Robot;


public class RobotSquare {
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
    	Robot potatotron2000=new Robot("mini");
        // 3. Put the robot's pen down
    	potatotron2000.penDown();
        // 6. Make the robot move as fast as possible
    	potatotron2000.setSpeed(10);
        // 5. Do everything below here 4 times
    	for (int i=0; i<4; i++) {
        //         2. Move your robot 200 pixels
    		potatotron2000.move(200);
        //         4. Turn the robot 90 degrees to the right (90 degrees)
    		potatotron2000.turn(90);
    	}
    }
}

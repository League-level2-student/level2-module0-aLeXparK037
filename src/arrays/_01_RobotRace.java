package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot [] rob = new Robot [6];

	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.
	for (int i = 0; i < rob.length; i++) {
		rob[i] = new Robot();
	}
int xaxis = 100;
		//4. make each robot start at the bottom of the screen, side by side, facing up
	for (int i = 0; i < rob.length; i++) {
		rob[i].setSpeed(10);
	rob[i].setX(xaxis);
	rob[i].setY(500);
	xaxis += 150;
	}

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	boolean finish = true;
	while(finish) {
	for (int i = 0; i < rob.length; i++) {
		
		Random ran = new Random();
		int num = ran.nextInt(50);
		rob[i].move(num);
		if (rob[i].getY()<50) {
			finish =false;
			System.out.println("Robot #" + i +" won!!!");
		}
		
	}
	}

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	
	
}
}
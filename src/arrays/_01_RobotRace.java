package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	//2. create an array of 5 robots.
		Robot[] bots = new Robot[5];	
		
	//3. use a for loop to initialize the robots.
		for (int i=0; i<5; i++) {
			bots[i] = new Robot();
			bots[i].miniaturize();
			bots[i].setSpeed(10);
			bots[i].moveTo(100*i+100, 500);
		//4. make each robot start at the bottom of the screen, side by side, facing up
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		for (int y=500; y>0; y--) {
			for (int x=0; x<5; x++) {
				Random gen = new Random();
				int er = gen.nextInt(50)+1;
				bots[x].move(er);
				
				if (bots[x].getY()<50) {
					
				}
			}
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}

package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		_01_RobotRace rr = new _01_RobotRace();
		rr.line();
		// 2. create an array of 5 robots.
		Robot[] bots = new Robot[5];

		int i = 0;
		// 3. use a for loop to initialize the robots.
		for (i = 0; i < 5; i++) {
			bots[i] = new Robot();
			bots[i].miniaturize();
			bots[i].setSpeed(10);
			bots[i].moveTo(100 * i + 100, 500);
		}

		for (i = 0; i < 5; i++) {
			Random ran = new Random();
			int dom = ran.nextInt(256);
			bots[i].setPenColor(dom, dom, dom);
			bots[i].setPenWidth(8);
			bots[i].penDown();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		for (int y = 500; y > 50; y--) {
			for (int x = 0; x < 5; x++) {
				Random gen = new Random();
				int er = gen.nextInt(50) + 1;
				bots[x].move(er);

				int n = bots[0].getY();
				int u = bots[1].getY();
				int d = bots[2].getY();
				int t = bots[3].getY();
				int q = bots[4].getY();

				if (n < 25 || u < 25 || d < 25 || t < 25 || q < 25) {
					JOptionPane.showMessageDialog(null, "Robot has won!");
					break;

				}
			}

		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

	}

	public void line() {
		Robot jud = new Robot();
		jud.miniaturize();
		jud.setSpeed(50);
		jud.moveTo(50, 25);
		jud.turn(90);
		jud.setPenColor(255, 0, 0);
		jud.penDown();
		jud.move(500);
	}

}

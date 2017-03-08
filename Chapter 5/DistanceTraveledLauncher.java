import java.util.Scanner;
public class DistanceTraveledLauncher {

public static void main(String[] args) {
	int speed;
	int time;
	int loop = 5;
	Scanner keyboard = new Scanner(System.in);
	do {
System.out.println("How fast are you traveling? (MPH)");
speed = keyboard.nextInt();
if (speed < 0 ) {
System.out.println("The speed can not be a negitive number dude !!!!!!!!!!!!!!!!!!!");
} else {
System.out.println("How long did it take you to get to your destination going at that speed? (Hours)");
time = keyboard.nextInt();
if (time < 1) {
System.out.println("enter a greater number 1");
} else {
DistanceTraveled travel1 = new DistanceTraveled(time, speed);
System.out.println("Hour \t \t Distance Traveled");
System.out.println("-------------------------------------");
travel1.getDistance();
				}
			}
		} while (loop != 1);
		keyboard.close();
	}
}

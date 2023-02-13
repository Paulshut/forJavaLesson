package task7;

public class Start {
    static Robot[] robots = new Robot[9];

    public static void showRobots() {
        Robot[] robots = new Robot[9];
        for (int i = 0; i < robots.length; i++) {
            robots[i] = new Robot();
            System.out.println(robots[i]);
        }
    }
}
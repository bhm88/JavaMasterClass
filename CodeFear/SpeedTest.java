package CodeFear;

public class SpeedTest {
    public static void main(String[] args) {

        System.out.println(fine(60, false));
    }

    public static int fine(int speed, boolean holiday) {
        int minSpeed = 60;
        int maxSpeed = 80;
        int fine = 0;

        if (holiday) {
            minSpeed += 5;
            maxSpeed += 5;
        }
        if (minSpeed > 60 && maxSpeed <= 80) {
            fine = 100;
        }
        if (minSpeed <= 60) {
            fine = 0;
        }
        if (maxSpeed >= 80) {
            fine = 200;
        }
        return fine;
    }
}
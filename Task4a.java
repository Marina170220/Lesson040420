package KompjuterIya.Lesson040420;
import java.util.Random;

public class Task4a {
    public static void main(String[] args) {
        Random r = new Random();
        String randomString = new String();

        for (int i = 0; i <= 10; i++) {
            char randomCharacter = (char) (97 + r.nextInt(122 - 98));
            int randomNumber = r.nextInt(10);
            if (randomNumber % 2 == 0) {
                randomString = randomString + randomCharacter + randomNumber;
            }
        }
        System.out.println(randomString);
    }
}








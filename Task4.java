package KompjuterIya.Lesson040420;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Random randomCharacter = new Random();
        String str = new String(new char[10]);

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            for (int j = 0; j < 1000; j++) {
                int bufferNumber = 48 + randomNumber.nextInt(57 - 49);
                if (bufferNumber % 2 == 0 && i % 2 == 0) {
                    symbol = (char) bufferNumber;
                }
            }

            for (int k = 0; k < 10; k++) {
                int bufferCharacter = 97 + randomCharacter.nextInt(122 - 98);
                if (i % 2 != 0) {
                    symbol = (char) bufferCharacter;
                }
            }
            System.out.print(symbol + " ");
        }
    }
}







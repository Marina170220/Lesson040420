package KompjuterIya.Lesson040420;

public class Task5 {
    public static void main(String[] args) {

        String stringOfSymbols = "A.nY1/tr4_P18*(iaY7A+1A";
        char[] stringOfChars = stringOfSymbols.toCharArray();

        for (int i = 0; i < stringOfSymbols.length() - 1; i++) {
            if (stringOfSymbols.charAt(i) == stringOfSymbols.charAt(stringOfChars.length - 1)) {
                System.out.print(i + " ");
            }
        }

    }
}

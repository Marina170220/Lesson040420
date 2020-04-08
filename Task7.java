package KompjuterIya.Lesson040420;

public class Task7 {
    public static void main(String[] args) {

        String stringOfSymbols = "A.nY1/tr4_P18*(iaY7A+1A/7^bO$A//*";
        int numberOfElements = 0;
        char specificSymbol = '/';

        for (int i = 0; i < stringOfSymbols.length(); i++) {
            if (stringOfSymbols.charAt(i) == specificSymbol) {
                numberOfElements++;
            }
        }

        System.out.print("Symbol " + specificSymbol + " meets " + numberOfElements + " times");
    }
}

package KompjuterIya.Lesson040420;

public class Task6 {
    public static void main(String[] args) {
        String symbolsLine = new String(new char[]{'s', 'o', 'm', 'e', 't', 'h', 'i', 'n', 'g', 'h', 'a', 'p', 'p', 'e', 'n', 'i', 'n', 'g'});
        for (int i = 2; i < symbolsLine.length(); i += 3) {
            System.out.print(symbolsLine.charAt(i) + ", ");
        }
    }
}

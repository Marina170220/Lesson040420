package KompjuterIya.Lesson040420;

public class Task6 {
    public static void main(String[] args) {
        String characterString = new String(new char[]{'s', 'o', 'm', 'e', 't', 'h', 'i', 'n', 'g', 'h', 'a', 'p', 'p', 'e', 'n', 'i', 'n', 'g'});
        for (int i = 2; i < characterString.length(); i += 3) {
            System.out.print(characterString.charAt(i) + ", ");
        }
    }
}

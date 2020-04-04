package KompjuterIya.Lesson040420;

public class Task3 {
    public static void main(String[] args) {
        String str = "The weather is fine";
        if (str.length() > 5) {
            System.out.println(str.substring(0, 3) + ", " + str.substring(str.length() - 3, str.length()));
        } else for (int c = 0; c < str.length(); c++) {
            System.out.print(str.charAt(0));
        }

    }
}

package KompjuterIya.Lesson040420;

public class Task1_2 {
    public static void main(String[] args) {

        String str = "I'm learning Java";
        System.out.println("Task 1");
        System.out.println(str + ", " + str + ", " + str);
        System.out.println("Number of elements in string: " + str.length());
        System.out.println();
        System.out.println("Task 2");
        System.out.println("First element: " + str.charAt(0));
        System.out.println("Last element: " + str.charAt(str.length() - 1));
        if (str.length() % 2 != 0) {
            System.out.println("Middle element: " + str.charAt((str.length() - 1) / 2));
        }
    }
}

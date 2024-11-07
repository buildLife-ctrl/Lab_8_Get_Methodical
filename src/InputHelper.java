import java.util.Scanner;

public class InputHelper {
    public static String getNonZeroLenString(Scanner scan, String prompt) {
        String input;
        boolean check = false;

        System.out.println(prompt);
        do {
            input = scan.nextLine();
            if (input.length() != 0) {
                check = true;
            } else {
                System.out.println("You have to enter something, try again.");
            }
        } while (!check);

        return input;
    }
}

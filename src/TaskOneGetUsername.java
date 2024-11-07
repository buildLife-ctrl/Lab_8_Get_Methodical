import java.util.Scanner;

public class TaskOneGetUsername {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = InputHelper.getNonZeroLenString(scan, "Enter username:");
        System.out.println("The username you entered is: " + username);
    }
}

import java.util.Scanner;

public class Simple {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("? ");
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            System.out.println("x = " + x);
        }
        else System.out.println("No valid input.");
    }
}
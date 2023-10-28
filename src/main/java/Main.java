import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
       // String name1 = "Alice";
        // String name2 = "Bob";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.print("Hello " + name+ "!");
        } else {
            System.out.print("Your name is not \"Alice\" or \"Bob\"" );
        }

    }
}

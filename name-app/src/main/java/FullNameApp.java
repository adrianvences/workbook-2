import java.util.Arrays;
import java.util.Scanner;

public class FullNameApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while(true) {
            System.out.print("Enter:\n 'a' for FullNameGenerator \n 'b' for FullNameParser\n 'c' to exit \n");
            String input = userInput.nextLine();
            switch (input.toLowerCase()) {
                case "a":
                    String fullName = FullNameApplication.fullNameBuilder();
                    System.out.println(fullName);
                    break;
                case "b":
                    String parsedName = FullNameParser.nameParser();
                    System.out.println(parsedName);
                    break;
                case "c":
                    System.out.println("Good Bye!");
                    userInput.close();
                    break;
                default:
                    System.out.println("Please enter a valid choice.");

            }
            System.out.print("Do you want to continue? Type 'yes' or 'no': ");
            String continueOutput = userInput.nextLine();

            if(continueOutput.equalsIgnoreCase("no")){
                System.out.println("Goodbye");
                break;
            }
        }
    }
}

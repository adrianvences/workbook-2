import java.util.Scanner;

public class FullNameApplication {
    static Scanner inputScanner;
    // this app will prompt the user to enter parts of there name
    // user will always have first and last
    // check if user inputs middle name or suffix
    // add comma before suffix if there is one
    public static String promptMethod(String prompt) {
        System.out.print(prompt);
        return inputScanner.nextLine().trim();
    }

    public static String fullNameBuilder() {

        // scanner
        inputScanner = new Scanner(System.in);


        String firstName = promptMethod("Enter your first name: ");

        String lastName = promptMethod("Enter your last name: ");

        String middleName = promptMethod("Enter your middle name (leave blank if none) : ");

        String suffix = promptMethod("Enter your suffix name leave blank if none) : ");



        // class     // var declaration // new instance of string builder
        StringBuilder fullName = new StringBuilder();

        // start building name //
        //append first name
        fullName.append(firstName);

        //middle name
        if (!middleName.isEmpty()){
            fullName.append(" ").append(middleName);
        }

        //last name
        fullName.append(" ").append(lastName);

        //suffix
        if(!suffix.isEmpty()){
            fullName.append(", ").append(suffix);
        }

        // send back full name
//        String finalName = fullName.toString();
//        return  finalName;
          return  fullName.toString();
    }
}

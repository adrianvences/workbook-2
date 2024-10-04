import java.util.Scanner;

public class FullNameParser {
    // prompt user to enter name in one of two formats "first last" or "first middle last"
    // trim name using trim() for leading or trailing spaces
    // parse name to separate each piece
    //***Please enter your name: Dana L. Wyatt ↵
    //***First name: Dana
    //***Middle name: L.
    //***Last name: Wyatt


    static Scanner inputScanner;
    public static String promptMethod(String prompt){
        System.out.println(prompt);
        return inputScanner.nextLine().trim();
    }

    public static String nameParser(){

        //scanner
        inputScanner = new Scanner(System.in);
        String fullName = promptMethod("Insert full name please ('First Middle Last' or 'First Last'):  ");
        String[] fullNameSplit = fullName.split(" ");

        String firstName = "First Name: " + fullNameSplit[0];
        String middleName = "Middle Name: " + (fullNameSplit.length == 3 ? fullNameSplit[1] : "(none)");
        String lastName =  "Last Name: " + (fullNameSplit.length == 3 ? fullNameSplit[2] : fullNameSplit[1] );

        return firstName + System.lineSeparator() + middleName +  System.lineSeparator() + lastName;
    }



}

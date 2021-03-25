package dowhile.forstatement.switchexamples;

import java.util.Scanner;

/**
 *
 * @author Παναγιώτης Μπέλλιας
 */
public class DoWhileForSwitchExample {
    
    // First we will need for sure the main method
    public static void main(String[] args) {
        
        // This example is about to see how the do ... while, the for statement and the switch
        // structure are used.
        // Let's say that the user wants to see the corresponding letter of its number (english 
//alphabet). First lets say user will use this 3 times

        int i;
        int option; // this variable is used to hold user's input each time
        // We need for statement
        for (i=1; i<=3; i++) {
            //Now we want the scanner object for the user input
            Scanner input = new Scanner(System.in);
            // With do while
            do {
                System.out.println("Give a number"); // How can we check user's input?
                option = input.nextInt();
            } while(option < 1 || option > 5);
            // This way, each time we have only a number between 1 and 5
            // Now we use a switch structure to define the message that must be printed
            switch (option) {
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
                case 5:
                    System.out.println("E");
                    break;
                default:
                    // error handling here
                    System.out.println("Sth went wrong");
            } // This way, we have matched the first 5 numbers with the first 5 letters
            // Let' s run it
            // That's it 
            // For any problem or more material to practice contact me!
            // Don't forget to subscribe, thank you!
            // See you next time
        }
        
    }
    
}

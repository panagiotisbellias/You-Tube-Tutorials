/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifWhile;

import java.util.Scanner;

/**
 *
 * @author Παναγιώτης Μπέλλιας
 */
public class IfWhile {
    
    public static void main(String[] args) {
        /*
            First, we create the main method that we sure need to execute the program
            We 'll see an example of if usage and while loop usage
            We 'll also use a counter and explain its usage too
        */
        
        // The example is about a number that we will have defined and user trys to guess it
        // At the end, we print a message which informs the user how many times he/she guessed it.
        
        // First, we need to take user's number so we have to make a scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you think: ");
        int userNumber = input.nextInt();
        // We used here the print method to tell user what he/she should do
        // And took from him/her the number
        
        // Now we declare our number
        // e.g.
        int systemNumber = 16;
        
        // Let's initialize an integer variable that we will use as a counter to count user's tries
        int counter = 1; // now we are on 1st try
        // We 'll use a while loop that in case user's guess isn't correct the user will be able to
        // retry
        while(systemNumber != userNumber){
            /* The command block below will be executed as long as the number isn't correct */
            // Let's try to make user improve his guess. We will use if statements to check values
            if (userNumber > systemNumber)
                System.out.print("Large number. Pick a slower one: ");
            else // in other case 
                System.out.print("Small number. Pick a larger one: ");
            // We are still inside the while loop so here we will increase the counter to count the try
            counter++;// or counter += 1; or counter = counter + 1;
            // And finally user enters a new number
            userNumber = input.nextInt();
        }
        
        System.out.println("You guessed it!");
        //Finally, print counter's value to inform user about how many tries did he do
        System.out.println("User tried: " + counter);
        
        // Let's run the code!
        // Also you can add a message to tell user he guessed it
        
        // Such code can be anywhere
        // Constructors, methods, etc.
        // Thank you for attending and don't forget to subscribe
        // See you next time! Bye
        
    }
    
}

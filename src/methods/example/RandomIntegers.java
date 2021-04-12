package methods.example;

// We will now use a ready class with static functions to explore their usage
// This class must be imported
import java.security.SecureRandom;

/**
 *
 * @author Panagiotis B Programmer
 */
public class RandomIntegers {

    public static void main(String[] args) {
        //Now we created the main method
        // First let's declare a SecureRandom object
        
        SecureRandom random = new SecureRandom();
        
        // in a for we will find out the usage
        // we will print some random numbers
        for (int counter=1; counter<=20; counter++) {
            int number = 1 + random.nextInt(6); // This returns a number from 0-5 plus 1
            // That means 1-6
            System.out.print(number + " ");
            
            // new line will be created when we have already 5 numbers
            if (counter % 5 == 0) {
                System.out.println();
            } 
            
        }
        
        // Let's see the results
        // Something went wrong, let's see!
        // We'd better add a space after the number
        // To have the wanted results in the output we should check the counter in the if 
        // statement and not the number
        
        // We are ready now!
        
        /*
        Thanks for watching! Don't forget to subscribe 
        Contact me for questions in the comment section and at belliaspanagiotis@gmail.com
        See ya next time!
        Bye!
        
        */
        
    }
    
}

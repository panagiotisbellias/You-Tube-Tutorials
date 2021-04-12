package methods.example;

/**
 *
 * @author Panagiotis B Programmer
 */
public class Addition {

    // Now we will use the functionality we built
    
    public static void main(String[] args) {
        // Let's create an object of our class
        AddValues addValues = new AddValues();

        // Now let's call the methods we created
        // in a first variable we will store the value of the first method
        int x = addValues.addTwoValues(25, 64);
        // in a second we will store the return value of the second one
        int y = addValues.addThreeValues(12, 58, 6);

        //Oops, we don't have a main method. Let's create it
        // Great! Now let's print the return values to see that it is working!
        
        System.out.println(x);
        System.out.println(y);
        
        //Let's run it!
        // It's working, yeah!
    }
    
    
    
}

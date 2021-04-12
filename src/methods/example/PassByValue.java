package methods.example;

class Dog{}

class Cat{}

/**
 *
 * @author Panagiotis B Programmer
 */
public class PassByValue {

    // Now we will learn something really useful
    // Pass by value!
    // Let's create some variables and methods to try and learn
    
    // First we are defining two classes (it's possible in the same file)
    // With these classes we will try to change a variable from
    // pointing to a Dog object to point to a Cat object
    // this is happening with a method
    private static void changeObject(Object o) {
        Cat c = new Cat();
        o = c;
    }
    
    // Defining a method so we can try change an integer's value
    private static void changeInteger(int x) {
        x = 52;
    }
    
    // let's define a main method to try that
    public static void main(String[] args) {
        
        Dog d = new Dog();
        changeObject(d);
        System.out.println(d.getClass());
        // As we saw, no change at all. Why? We'll talk about it later
        // Let's try the same for a primitive Java type, like int
        
        // Let's try it
        int n=10;
        changeInteger(n);
        System.out.println(n);
        // Run it
        
        // This is failed too
        // In Java, we can't change a variable's value without returning it
        // The value must be passed by reference but this is implicit
        // With pass by value we can only read the details of a variable or object
        
        // For questions please: belliaspanagiotis@gmail.com
        // or in the comment section
        
    }
    
}

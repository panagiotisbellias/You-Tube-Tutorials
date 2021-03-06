/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexample;

/*
    In this video, you will see an example of how we create and use classes in a Java application.
    In this class, we will have only the main method from where the execution begins. In another file, we will create 
    a new class to use it from the main method of this class.
*/

/*
    The example uses a Time class which describes the time
    Let's start from the Time class creation.
*/

/**
 *
 * @author YT - P. Bellias
 */
public class Main {
    //First, we need the main method
    public static void main(String[] args) {
        // We can create Time objects using the 'new' keyword
        // calling the constructor with no arguments
        Time t1 = new Time(); // This is a Time object, took a copy from attributes and methods of this class
        // Let's set values using the setters
        t1.setHours(10);
        t1.setMinutes(43);
        // and let's display the values with getters
        System.out.println("Hours: " + t1.getHours() + "\nMinutes: " + t1.getMinutes());
        // Execution time
        
        /* NOW, will use the constructor with arguments and we will see that getters aren't needed */
        Time t2 = new Time(22, 46, 50);
        // Let's see what we have using getters
        // We can use the line 33 again
        System.out.println("\nHours: " + t1.getHours() + "\nMinutes: " + t1.getMinutes());
        // What we have?
        // See? A common mistake, we have to call t2 getters
        System.out.println("\nHours: " + t2.getHours() + "\nMinutes: " + t2.getMinutes());
        // Sometimes, we must build first and run after
        // Now, we will make a method to print hour better
        
        System.out.println(t2);
        Time.showTime(t2);
        t2.displayTime();
    }
}

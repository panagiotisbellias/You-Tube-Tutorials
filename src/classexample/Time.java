/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexample;

/**
 *
 * @author YT - P. Bellias
 */
public class Time {
    // The time in our example is described from hours, minutes and seconds
    // We will declare the attributes, the constructor(s) and getters/setters
    // At the end, we will implement a method too to print something
    private int hours; // The hours as integer number (Remember that the most of the attributes are declared private)
    private int minutes; // The minutes as integer number too.
    private int seconds; // The seconds as integer number too.
    
    //We could declare them also in a single line like this
    //private int hours, minutes, seconds;
    // We commented this line cause we have already declare the attributes
    
    // Let's make a constructor to initialize the fields with their initial values (default values)
    public Time() {
        // The constructor must be public and named as the class's name
        // Give the default values
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    
    // Now, let's make a constructor to initialize all fields with the arguments' values
    public Time(int hours, int minutes, int seconds){
        // We will use the keyword 'this' to refer to class's attributes and pass the arguments' values to them
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    
    // Now, let's see how the getters and setters are made
    // Hour getter
    public int getHours() {
        return hours; // or return this.hours; == here it's the same because we don't have another variable
    }
    
    // Hour setter
    public void setHours(int hours) {
        this.hours = hours; // in setter methods, we use the keyword this for the same purpose as in the constructor
    }
    
    // Minute getter
    public int getMinutes() {
        return minutes; // or this.minutes;
    }
    
    // Minute setter
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    
    // You can do the same for the seconds attribute
    // Let's see how to use this class
    
    // We will write a method to print the contents of the object in a good-looking format
    // First, let's see what we will have if we print an object
    // So, let's begin
    public static void showTime(Time t){
        System.out.println(t.hours+":"+t.minutes+":"+t.seconds);
    }
    
    //We also can have a non-static method in the way getters and setters are used,
    public void displayTime() {
        System.out.println(hours+":"+minutes+":"+seconds);
    }
    
    // The difference with the static method:
    // The static method takes an object as argument because it isn't needed to create an object to call the method
    // but non-static method refers to the object that represents, so an object must be created
    
    // That's all for now, google notes and github link can be found at the description. Practice and
    // DON' T FORGET to subscribe to my channel
    // Until next time, to talk about more interesting stuff, bye there!
}

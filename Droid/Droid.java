/*Droid Java program
 * Created by Jacob Seybert
 * 12/09/2023
 * All rights reserved
 * 
 * Program to create a Droid capable of killing Jedi.
 */


package Droid;

//Droid Class creation
public class Droid {
    String droidName;
    int batteryLevel;
  
    //constructor method.
    public Droid(String name){
      droidName = name;
      batteryLevel = 100;
    }
    //State name of Droid
    public String toString (){
      return "Hello, I'm the droid: " + droidName;
    }
    //Perform tasks obj
    public void performTask(String task){
      System.out.println(droidName + " is performing task: "+ task + ".");
      batteryLevel = batteryLevel - 10;
    }
    //Main 
    public static void main(String[] args){
      Droid Codey = new Droid("Codey");
      System.out.println(Codey);
      Codey.performTask("Swimming");
      System.out.println("New battery level is: "+ Codey.batteryLevel);
      Codey.performTask("Running");
      System.out.println("New battery level is: "+ Codey.batteryLevel);
      Codey.performTask("Cleaning");
      System.out.println("New battery level is: "+ Codey.batteryLevel);
      Codey.performTask("Missing all of his blaster shots");
      System.out.println("New battery level is: "+ Codey.batteryLevel);
      Codey.performTask("Still missing all of his blaster shots");
      System.out.println("New battery level is: "+ Codey.batteryLevel);
      Codey.performTask("Fighting Jedi");
      System.out.println("New battery level is: "+ Codey.batteryLevel);
      Codey.performTask("Cleaning up the blood of it's enemies");
      System.out.println("New battery level is: "+ Codey.batteryLevel);
      Codey.performTask("Pulling out blaster");
      System.out.println("New battery level is: "+ Codey.batteryLevel);
      Codey.performTask("Missing all of his blaster shots");
      System.out.println("New battery level is: "+ Codey.batteryLevel);
      Codey.performTask("Going to sleep forever now..");
      System.out.println("New battery level is: "+ Codey.batteryLevel);
    }
  }
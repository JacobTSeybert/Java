package Loops.DieRoll;

// Importing the Random library
//Code uses a randomNumber Generator
import java.util.Random;

class Craps {
  
  public static void main(String[] args) {
    
    // Creating a random number generator
    Random randomGenerator = new Random();
    
    // Generate a number between 1 and 6
    int dieRoll = randomGenerator.nextInt(12) + 1;

    // Repeat while roll isn't 5
    while (dieRoll != 7){
      dieRoll = randomGenerator.nextInt(12) + 1;
      System.out.println(dieRoll);
    }
    if (dieRoll == 7){
        System.out.println("Winner!");
    }
    
  }
  
}
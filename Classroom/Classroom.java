package Classroom;
/*
 * me losing my sanity
 */
import java.util.Arrays;

public class Classroom {
  
  public static void main(String[] args){
    String[] students = {"Sade", "Alexus", "Sam", "Koma"};
    double[] mathScores = new double[4];
    mathScores[0] = 94.5;
    mathScores[1] = 32.8;
    mathScores[2] = 76.8;
    mathScores[3] = 100;
    System.out.println("The number of students in the class is " + students.length);
    int sum =0;
    int length = mathScores.length;
    for (int i=0; i < mathScores.length; i++){
      sum += mathScores[i];
    }
    double average = sum / length;
    System.out.println("The average test score was: " + average);

    if(average >= 90){
      System.out.println("You guys averaged an A which is excellent!");
    }else if (average >= 80){
      System.out.println("You guys averaged a B which is good!");
    }else if (average >= 70){
      System.out.println("You guys averaged a C which is basically Average and you will never amount to more than the average person in the world, and with 7 billion people on this Earth that means expect life to suck.");
    }else if (average >= 60){
      System.out.println("You guys averaged a D which is basically failing and honestly I am not suprised.");
    }else{
      System.out.println("You guys averaged a failure, and that reflects on me and says I am a failure as a teacher therefore you all got B's");
    }
  }
}
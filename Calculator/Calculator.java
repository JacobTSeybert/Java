package Calculator;
/*
This is a very basic Calculator program developed by Jacob Seybert
on Decmber 09 2022, all rights reserved :).
Used for development of Java programming skills.

Future improvements? = Take user input for ints to start?
*/
public class Calculator {
    int calculator;
  
      public int add(int a, int b){
        int add = a + b;
        return add;
      }
      public int subtract(int a, int b){
        int subtract = a - b;
        return subtract;
      }
      public int multiply(int a, int b){
        int multiply = a * b;
        return multiply;
      }
      public int divide(int a, int b){
        int divide = a / b;
        return divide;
      }
      public double modulo(int a, int b){
        double modulo = a % b;
        return modulo;
      }
      public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.subtract(45,11));
        System.out.println(myCalculator.multiply(11,11));
        System.out.println(myCalculator.divide(121,11));
        System.out.println(myCalculator.modulo(2,1));
      }
  }
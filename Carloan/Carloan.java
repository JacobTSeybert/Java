/*
A basic Car loan calculate, input the desired informtion in the beginning to calcualte your monthly payments on your new whip. (does do light error checking)
*/
public class Carloan {
	public static void main(String[] args) {
    int carLoan = 64000;
    int loanLength = 6;
    int interestRate = 3;
    int downPayment = 0;

    if (loanLength <= 0 || interestRate <=0){
      System.out.println("Error! You must make a valid car loan.");
    }else if (downPayment > carLoan){
      System.out.println("The car can be paid in full!");
    }else{
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = monthlyBalance * interestRate / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println("Your monthly payment would be "+ monthlyPayment+ "!");
    }
	

	}
}
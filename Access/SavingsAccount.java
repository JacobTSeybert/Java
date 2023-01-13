package Access;

public class SavingsAccount{

    public String owner;
    public int balanceDollar;
    public double balanceEuro;
  
    public SavingsAccount(String owner, int balanceDollar){
      // Complete the constructor
      this.owner = owner;
      this.balanceDollar = balanceDollar;
      this.balanceEuro = balanceDollar * .85;
  
    }
  
    public void addMoney(int balanceDollar){
      // Complete this method
      System.out.println("Adding " + balanceDollar + " dollars to the account.");
      this.balanceDollar += balanceDollar;
      System.out.println("The new balance is " + this.balanceDollar + " dollars.");
  
    }
  
    public static void main(String[] args){
      SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);
      zeusSavingsAccount.addMoney(2000);
      // Make a call to addMoney() to test your method
  
    }
  
  }
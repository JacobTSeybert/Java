package Prime;

// Import statement:
import java.util.ArrayList;

class PrimeDirective {
  
  // Add your methods here:
  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89, 7919, 1111111111};
    //below was used to test the code prior to adding an arraylist method
   /*System.out.println(pd.isPrime(6));
    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(0));*/
    System.out.println(pd.onlyPrimes(numbers));

  }  
  public boolean isPrime(int number){
    if (number == 2){
      return true;
    }
    else if (number < 2){
      return false;
    }
    for (int i = 2; i < number; i++){
      if (number % i == 0){
        return false;
      }
    }
    return true;
  }
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int number : numbers){
      if (isPrime(number)) {
        primes.add(number);
      }
    }
    return primes;
  }
}
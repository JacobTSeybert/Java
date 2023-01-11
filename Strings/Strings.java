package Strings;

public class Strings {
  
    public static void main(String[] args) {
      String firstName = "Jacob";
      String lastName = "Seybert";
      //length examples
      System.out.println(firstName.length());
      System.out.println(lastName.length());
      //Concat example
      System.out.println(firstName.concat(" " + lastName));
      //index of example
      System.out.println(firstName.indexOf("J"));
      System.out.println(lastName.indexOf("b"));
      //equals example
      String password = "correcthorsebatterystaple";
      String password2 = "correcthorsebatterystaple";
      System.out.println(password.equals(password2));
      //Char at example
      System.out.println(firstName.charAt(0));
      System.out.println(lastName.charAt(0));
      //Substring example
      System.out.println(lastName.substring(3, 7));
      //toLower example
      System.out.println(lastName.toLowerCase());
      //toUpper example
      System.out.println(firstName.toUpperCase());
    }
}
      
package Strings;

//A program that will check for a protein DNA genome
public class DNA {
    public static void main(String[] args) {
      //  -. .-.   .-. .-.   .
      //    \   \ /   \   \ / 
      //   / \   \   / \   \  
      //  ~   `-~ `-`   `-~ `-
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";
  
      String dnaC1 = dna1;
      int length = dnaC1.length();
      System.out.println("Length of DNA1: " + length);
  
      //Find start codon:
      int start = dnaC1.indexOf("ATG");
      System.out.println("Start: " + start);
      //Find stop codon:
      int stop = dnaC1.indexOf("TGA");
      System.out.println("Stop: " + stop);
      //Find the protein
      if (start != -1 && stop != -1 && (stop - start) % 3 == 0){
        System.out.println("Condition 1 and 2 and 3 are satisfied.");
        String protein = dnaC1.substring(start, stop+3);
        System.out.println("Protein: " + protein);
      }else{
        System.out.println("There is not a protein in this DNA strand." + dnaC1);
      }
      //Second Check
      String dnaC2 = dna2;
      int length2 = dnaC2.length();
      System.out.println("Length of DNA2: " + length2);
  
      //Find start codon:
      int start2 = dnaC2.indexOf("ATG");
      System.out.println("Start: " + start2);
      //Find stop codon:
      int stop2 = dnaC2.indexOf("TGA");
      System.out.println("Stop: " + stop2);
      //Find the protein
      if (start2 != -1 && stop2 != -1 && (stop2 - start2) % 3 == 0){
        System.out.println("Condition 1 and 2 and 3 are satisfied.");
        String protein2 = dnaC2.substring(start2, stop2+3);
        System.out.println("Protein: " + protein2);
      }else{
        System.out.println("There is not a protein in this DNA strand. " + dnaC2);
      }
      //Third Check
      String dnaC3 = dna3;
      int length3 = dnaC3.length();
      System.out.println("Length of DNA3: " + length3);
  
      //Find start codon:
      int start3 = dnaC3.indexOf("ATG");
      System.out.println("Start: " + start3);
      //Find stop codon:
      int stop3 = dnaC3.indexOf("TGA");
      System.out.println("Stop: " + stop3);
      //Find the protein
      if (start3 != -1 && stop3 != -1 && (stop3 - start3) % 3 == 0){
        System.out.println("Condition 1 and 2 and 3 are satisfied.");
        String protein3 = dnaC3.substring(start3, stop3+3);
        System.out.println("Protein: " + protein3);
      }else{
        System.out.println("There is not a protein in this DNA strand." + dnaC3);
      }
    }
  }
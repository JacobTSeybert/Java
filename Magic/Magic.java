package Magic;

public class Magic {
            public static void main(String[] args) {
        int myNumber = 26; //original number picked by me
        int magicNumber;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
    
        System.out.println(stepSix);
    
        magicNumber = myNumber * myNumber;
        magicNumber = magicNumber + myNumber;
        magicNumber = magicNumber / myNumber;
        magicNumber = magicNumber + 17;
        magicNumber = magicNumber - myNumber;
        magicNumber = magicNumber /6;
    
        System.out.println(magicNumber);
    }
}

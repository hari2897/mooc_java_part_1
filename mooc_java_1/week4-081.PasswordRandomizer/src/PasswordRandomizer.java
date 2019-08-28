import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random randomNum;
    private int passLength;
    private String alpha = "abcdefghijklmnopqrstuvwxyz";
   
    //private int i=0;
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passLength=length;
        randomNum = new Random();
        
        
    }

    public String createPassword() {
        // write code that returns a randomized password
         String toAdd="";
        for(int i=0;i<this.passLength;i++)
        {
        char symbol = this.alpha.charAt(this.randomNum.nextInt(26));
        toAdd=toAdd+symbol;
        }
        return toAdd;
    }
}

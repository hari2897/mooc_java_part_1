
import java.util.Random;

public class NightSky {

    private int starCount = 0;
    private int width;
    private int height;
    private double density;

    public NightSky(double density, int width, int height) {

        this.width = width;
        this.height = height;
        this.density = density;

    }

    public NightSky(int width, int height) {

        this.width = width;
        this.height = height;
        this.density = 0.1;

    }

    public NightSky(double density) {

        this.width = 20;
        this.height = 10;
        this.density = density;

    }

    public void printLine() {

        Random starRand = new Random();

        for (int i = 0; i < this.width; i++) { // This specifies the width of the line .
            double randNum = starRand.nextDouble(); // Generate a random number to randomze the number of stars printed

            if (randNum > this.density) { //Just my own criteria for as to when to print star and when to print empty space
                System.out.print(" "); //if the generated random number is greater than entered density , prints whitespace
            } else {
                System.out.print("*");  //otherwise print star
                starCount++; // Counter for number of stars
            }
            

        }
        
    }

    //Print many lines as defined by the height
    public void print() {
        for (int x = 0; x < this.height; x++) { //Iterate as many times as the height.

            printLine(); //This prints one line of random stars
            System.out.println();

        }
    }

    public int starsInLastPrint() {
        int totalStars = starCount;
        starCount=0; // If starCount not set to 0 , the prevois result of starCount also will get added up. Eg: if the prev result was 7 and present num of stars is 3 , the present result will show 10 instead of 3.
        return totalStars; // return number of stars
    }
}

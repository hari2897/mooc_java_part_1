/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hakr
 */
import java.util.ArrayList;

public class Grades {

    private ArrayList<Integer> marks = new ArrayList<Integer>();
    private int totalStars = 0;
    private int failedStar = 0;

    public Grades(ArrayList<Integer> marks) {

        this.marks = marks;
    }

    public String zero() {

        int zero = 0;
        String zeros = "";
        for (int num : this.marks) {

            if (num < 30 && num > -1) {
                zero++;
            }

        }
        for(int i=0; i<zero ; i++){
        
        zeros = zeros + "*";
        
        
        }
        this.totalStars += zero;
        this.failedStar = zero;
        return zeros;
        
        
    }

    public String one() {
        int one = 0;
        String ones = "";
        for (int num : this.marks) {
            if (num <35 && num > 29) {
                one++;
            }
        }
      
        
        for(int i=0; i<one ; i++){
        
        ones = ones + "*";
        
        
        }
        this.totalStars += one;
        return ones;
        
        

    }

    public String two() {

        int two = 0;
        String twos = "";
        for (int num : this.marks) {

            if (num <40 && num > 34) {
                two++;
            }

        }
        
        for(int i=0; i<two ; i++){
        
        twos = twos + "*";
        
        
        }
        this.totalStars += two;
        return twos;
        
    }

    public String three() {

        int three = 0;
        String threes = "";
        for (int num : this.marks) {

            if (num <45 && num>39) {
                three++;
            }

        }
        
        for(int i=0; i<three ; i++){
        
        threes = threes + "*";
        
        
        }
        this.totalStars += three;
        return threes;
        
    }

    public String four() {

        int four = 0;
        String fours = "";
        for (int num : this.marks) {

            if (num<50 && num>44) {
                four++;
            }

        }
        for(int i=0; i<four ; i++){
        
        fours = fours + "*";
        
        
        }
        this.totalStars += four;
        return fours;
        
    }

    public String five() {

        int five = 0;
        String fives = "";
        for (int num : this.marks) {

            if (num < 61 && num >49) {
                five++;
            }

        }
        for(int i=0; i<five ; i++){
        
        fives = fives + "*";
        
        
        }
        this.totalStars += five;
        return fives;
        
    }
    
    public String toString(){
        double percnt = 0;
        if(this.totalStars>0){
         percnt = (100*(this.totalStars - this.failedStar))/this.totalStars;}
        return "Accepance percentage: " + percnt;
    }
    
    

}

//42 62 15 -2 = 50 but 33

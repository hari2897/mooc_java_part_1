/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imhakr
 */
public class BoundedCounter {

    private int counter;
    private int upper;

    public BoundedCounter(int upperLimit) {
    this.counter = 0;
        this.upper = upperLimit;
    }
    
    
    
    public void setValue(int time)
    {
        if (time>=0 && time<=this.upper){
        this.counter=time;
        
        }
    }

    public void next() {

        counter += 1;

        if (this.counter > this.upper) {
            
            this.counter = 0;
            
        }
        

    }
    
    public int getValue()
    {
        return this.counter;
    }
    

    public String toString() {
        if (this.counter < 10) {
            return "0" + this.counter;
        }
        else
            return "" + this.counter;

    } 
    
    

}


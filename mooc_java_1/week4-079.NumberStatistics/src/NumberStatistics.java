
public class NumberStatistics {

private int amountOfNumbers;
private int sum;
//private double average;
//private int number;

public NumberStatistics()
{
    this.amountOfNumbers = 0;
    this.sum=0;
    //this.number=0;
    //this.average=0.0;
}

public void addNumber(int number)
{
    amountOfNumbers+=1;
    //this.number=number;
    this.sum+=number;
}


public int amountOfNumbers()
{
    return this.amountOfNumbers;
}


public int sum() {
        // code here
        
     //   this.sum = sum+this.number;
        return this.sum;
    }

    public double average() {
        
        
        double avg = 0.0;
        if(this.amountOfNumbers>0){
        avg = (double)this.sum / (double)this.amountOfNumbers;
            return avg;
        } else {
            return 0;
        }
        
       //return (double)sum/(double)amountOfNumbers;
        // code here
    }
}
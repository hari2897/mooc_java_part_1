
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment compareThis)                                //make new object "compareThis" of class "Apartemnt" 
    {   
        if(this.squareMeters> compareThis.squareMeters)                         //compare this.sqareMeters and the value of compareThis by compareThis.squareMeters = value entered by user to compare                       
        {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment otherApartment)
    {
        int priceApt = this.pricePerSquareMeter*this.squareMeters;                                 // price = price per square meter x no. squaremeter
        int priceCompApt = otherApartment.pricePerSquareMeter*otherApartment.squareMeters;         // Same , but for the otherApartment 
        
        
        if(priceApt>priceCompApt)                                                                  //To get a positive value , subtract the larger number by smaller number.
        {
        return priceApt-priceCompApt ;                                                             // Returns the price difference between the otherApartment and this apartemnt
        }
        
        return priceCompApt-priceApt;
    }
    
    
    public boolean moreExpensiveThan(Apartment otherApartment)
    {
        int priceApt = this.pricePerSquareMeter*this.squareMeters;                                 // price = price per square meter x no. squaremeter
        int priceCompApt = otherApartment.pricePerSquareMeter*otherApartment.squareMeters;         // Same , but for the otherApartment 
        
        if(priceApt-priceCompApt > 0)                                                              //cannot use priceDifference method as it gives unsigned value, So here have to compare the difference value of the two
        {
            return true;
        }
        return false;
    }
    
    
}



/*

The above code is not the best way to do it , So this is a better solution


public class Apartment {
 
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
 
    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment compared){
        return this.squareMeters>compared.squareMeters;
    }
    
    private int price(){
        return pricePerSquareMeter*squareMeters;
    }
    
    public int priceDifference(Apartment compared) {
        // Math.abs returns the absolute value
        return Math.abs(this.price()-compared.price());
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return this.price()>compared.price();
    }    
}
 

*/

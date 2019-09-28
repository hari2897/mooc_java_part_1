
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {                                            //Add Money to existing Money. 
        int totalEuros = this.euros + added.euros;                              //add both euros
        int totalCents = this.cents + added.cents;                              //add both cents
        return new Money(totalEuros, totalCents);                               //return as new Money
    }

    public boolean less(Money compared) {                                       // True or false if this Money is lesser than compared money
        if (this.euros > compared.euros()) {                                    //if Eg this.euros = 7 , compared.euros = 5 , return false
            return false;
        } else if (this.euros < compared.euros()) {                             // 5<7 , return true
            return true;
        } else if (this.euros == compared.euros() && this.cents > compared.cents()) // if this.euros = 5 , compared.euros = 7 but this.cents = 10 & compare.cents = 0 , return false , as this.Money is larger than compared by 10 cents.
        {
            return false;
        }
        return true;                                                            // if compared cents is larger than this.cents and euros are equal, return true.

    }

    public Money minus(Money decremented) {
        int totalEuros = this.euros - decremented.euros;                        //Subtract only euros , Eg 7 - 5 = 2 euros in case of 7.00 and 5.40
        int totalCents = this.cents - decremented.cents;                        //Subtract only cents , Eg 0 - 40 (00 - 40) = -40
        if (totalEuros < 0) {                                                   //If the the difference in euros is less than 0 , return 0 euros
            return new Money(0, 0);
        }
        if (totalCents < 0) {                                                   // If the diff in cents is negative , ie, 7.00 - 5.40 = 2 euros and -40 cents , Convert it into positive -40 cents = + 60 cents but 1 euro lesser.
            totalCents=100+totalCents;                                          // totalCents = 100 + (-40) = 60 cents
            return new Money(totalEuros -1 , totalCents);                       //So subtract 1 euro 
        }

        return new Money(totalEuros, totalCents);                               //If cents>0 , return totalEuros and totalCents as it is.

    }
}
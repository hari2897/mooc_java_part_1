
public class CashRegister {

    private double cashInRegister;                                              // the amount of cash in the registe
    private int economicalSold;                                                 // the amount of economical lunches sold
    private int gourmetSold;                                                    // the amount of gourmet lunches sold

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {

        // price of the economical lunch is 2.50 euros
        if (cashGiven >= 2.50) // if the given cash is at least the price of the lunch:
        {
            this.cashInRegister += 2.50;                                        //    the price of lunch is added to register
            this.economicalSold++;                                              //    the amount of sold lunch is incremented by one
            return cashGiven - 2.50;                                            //    method returns cashGiven - lunch price 

        }

        return cashGiven;                                                       // if not enough money given, all is returned and nothing else happens

    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        if (cashGiven >= 4.00) {                                                // if the given cash is at least the price of the lunch:
            this.cashInRegister += 4.00;                                        // the price of lunch is added to register
            this.gourmetSold++;                                                 // the amount of sold lunch is incremented by one
            return cashGiven - 4.00;                                            // method returns cashGiven - lunch price 
        }
        return cashGiven;                                                       // if not enough money given, all is returned and nothing else happens
    }

    public boolean payEconomical(LyyraCard card) {

        if (card.balance() >= 2.50) // if the given cash is at least the price of the lunch:
        {
            card.pay(2.50);
            this.economicalSold++;                                              //    the amount of sold lunch is incremented by one
            return true;                                                        //    method returns cashGiven 

        }

        return false;
    }

    public boolean payGourmet(LyyraCard card) {

        if (card.balance() >= 4.00)                                             // if the balance of the card is at least the price of the lunch:
        {   
            card.pay(4.00);
            this.gourmetSold++;                                                 //    the amount of sold lunch is incremented by one
            return true;                                                        //    method returns true 

        }

        return false;                                                           //else returns false
    }
    
    
    
    public void loadMoneyToCard(LyyraCard card , double sum)                    //create a method to load money to lyyracard 
    {
        if(sum>0)
        {
        card.loadMoney(sum);                                                    //load the amount to card
        this.cashInRegister+=sum;                                               //increase the cashregister amount by the same amount loaded in card
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}

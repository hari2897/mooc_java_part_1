
public class Counter {
 
    private int value;
    private boolean check;
 
    public Counter(int value, boolean check) {
        this.value = value;
        this.check = check;
    }
 
    public Counter(int value) {
        this(value, false);                                                        //send it to the func above with false for boolean
    }
 
    public Counter(boolean checkIt) {
        this(0, checkIt);                                                          //send it to the func above with 0 for int and give the boolean value to the counter(int,bool)
    }
 
    public Counter() {
        this(0, false);                                                             //send it to the func above with 0 for int and boolean value as false to the counter(int,bool)
    }
 
    public int value() {
        return this.value;
    }
 
    public void increase() {
        increase(1);                                                                //send the increase amount of 1 to the method increase (int by) instead of this.value++
    }
 
    public void decrease() {
        decrease(1);
    }
 
    public void increase(int by) {
        if (by >= 0) {
            this.value += by;
        }
    }
 
    public void decrease(int by) {
        if (by < 0) {
            return;
        }
 
        this.value -= by;
        
        if (this.check && this.value <0) {                                           // if boolean is true and if the value is negative , make value 0
            this.value = 0;
        }                
 
    }
}
 


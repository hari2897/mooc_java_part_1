
public class Reformatory {

    private int counter = 0;
  

    public int weight(Person person) {
        // return the weight of the person
        int wait = person.getWeight();                                          //wait is a silly name for weight ,just storing the "weight" of the person in int "wait"
        this.counter++;

        return wait;
    }

    public void feed(Person person) {
        //int weightCount = person.getWeight();
        person.setWeight(person.getWeight()+1);                                 // Set the weight of person = Get his current weight +1 
    }

    public int totalWeightsMeasured() {
        return this.counter;
    }

}

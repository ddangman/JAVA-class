public class Reformatory {
    private int counter;
    
    public int weight(Person person) {
        // return the weight of the person
        counter++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        int x = person.getWeight();
        person.setWeight(x+1);
    }
    
    public int totalWeightsMeasured(){
    return counter;
    }

}

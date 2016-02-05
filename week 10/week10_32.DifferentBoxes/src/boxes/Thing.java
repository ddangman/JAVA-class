package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if (weight<0) {
            throw new IllegalArgumentException("weight can NOT be negative");
        }        
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object o) {
        if (!this.getClass().equals(o.getClass())) {
            return false;
        }   
        
        Thing compared = (Thing) o;
        
        if (!this.name.equals(compared.name)) {
            return false;
        }        
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.name == null) {
            return 111;
        }        
        return this.name.hashCode();
    }

}

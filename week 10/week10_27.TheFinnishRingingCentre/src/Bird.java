
public class Bird{

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals (Object other) {
        if (other == null) {
            return false;
        } if (this.getClass() != other.getClass()) {      
            return false;
        }
        
        Bird compared = (Bird) other;
        
        if (this.latinName == null || !this.latinName.equals(compared.latinName) || this.ringingYear!=compared.ringingYear) {
            return false;
        }        
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.latinName == null || this.name == null) {
            return 111;
    }
    
        return this.latinName.hashCode();
    }
    
}




public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }
    
    @Override
    public int hashCode() {
        if (this.regCode == null || this.country == null) {
            return 111;
        }        
        return this.regCode.hashCode();
    }
    
    @Override
    public boolean equals (Object object) {
        if (object.getClass() != this.getClass()) {
            return false;
        }        
        
        RegistrationPlate rp = (RegistrationPlate) object;
        
        if (rp.country == null || rp.regCode == null
                || !rp.country.equals(this.country) || !rp.regCode.equals(this.regCode)) {
            return false;
        }        
        
        return true;
    }
    

}
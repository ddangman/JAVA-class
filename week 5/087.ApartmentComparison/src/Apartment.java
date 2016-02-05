
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int apartmentPrice;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.apartmentPrice = squareMeters * pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment) {
        int difference = this.apartmentPrice - otherApartment.apartmentPrice;
        return Math.abs(difference);
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        if (this.apartmentPrice > otherApartment.apartmentPrice) {
            return true;
        }
        return false;
    }

}

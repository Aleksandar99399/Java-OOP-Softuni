package src.WorkingWithAbstractionLab.HotelReservation.domain;

public class Reservation {
    private double pricePerDay;
    private int numberOfDay;
    private Season season;
    private DiscountType discountType;

    public Reservation(
            double pricePerDay,
            int numberOfDay,
            Season season,
            DiscountType discountType){
        this.pricePerDay=pricePerDay;
        this.numberOfDay=numberOfDay;
        this.season=season;
        this.discountType=discountType;

    }

    @Override
    public String toString() {
        return "Reservation{" +
                "pricePerDay=" + pricePerDay +
                ", numberOfDay=" + numberOfDay +
                ", season=" + season +
                ", discountType=" + discountType +
                '}';
    }

    public double calculatePrice() {
        double basePrice=pricePerDay*numberOfDay;
        basePrice=season.priceMultiplied(basePrice);
        basePrice=discountType.discountFor(basePrice);
        return basePrice;

    }
}

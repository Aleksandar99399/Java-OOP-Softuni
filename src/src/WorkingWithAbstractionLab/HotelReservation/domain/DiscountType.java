package src.WorkingWithAbstractionLab.HotelReservation.domain;

public enum DiscountType {
    VIP(0.2),
    SecondVisit(0.1),
    None(0.0);

    private double discounts;


    DiscountType(double discounts){

        this.discounts = discounts;
    }

    public double discountFor(double amount){
        double discount=amount*this.discounts;
        return amount-discount;

    }
}

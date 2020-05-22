package src.WorkingWithAbstractionLab.HotelReservation.domain;

public enum  Season {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    private int prizeMultiplier;

    Season(int prizeMultiplier){

        this.prizeMultiplier = prizeMultiplier;
    }

    public double priceMultiplied(double price) {
        return price*this.prizeMultiplier;
    }
}

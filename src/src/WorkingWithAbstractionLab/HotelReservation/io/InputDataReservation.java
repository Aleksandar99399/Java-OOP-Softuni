package src.WorkingWithAbstractionLab.HotelReservation.io;

import src.WorkingWithAbstractionLab.HotelReservation.domain.DiscountType;
import src.WorkingWithAbstractionLab.HotelReservation.domain.Reservation;
import src.WorkingWithAbstractionLab.HotelReservation.domain.Season;

public class InputDataReservation {

    public Reservation parseFromLine(String line){
        String[]split=line.split("\\s+");
        double pricePerDay=Double.parseDouble(split[0]);
        int numberOfDays=Integer.parseInt(split[1]);
        Season season=Season.valueOf(split[2]);
        DiscountType discountType=DiscountType.valueOf(split[3]);

        return new Reservation(pricePerDay,numberOfDays,season,discountType);
    }
}

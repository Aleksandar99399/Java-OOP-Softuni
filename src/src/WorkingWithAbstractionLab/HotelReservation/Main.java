package src.WorkingWithAbstractionLab.HotelReservation;

import src.WorkingWithAbstractionLab.HotelReservation.domain.Reservation;
import src.WorkingWithAbstractionLab.HotelReservation.io.InputDataReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line=scanner.nextLine();

        InputDataReservation parser=new InputDataReservation();

        Reservation reservation=parser.parseFromLine(line);


        System.out.printf("%.2f",reservation.calculatePrice());

    }

}

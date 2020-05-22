package src.PolymorphismExercises.Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(in));

        Input input=new Input();

        Vehicles car=input.parseVehi(rd);
        Vehicles truck=input.parseVehi(rd);
        Vehicles bus=input.parseVehi(rd);

        Map<String,Vehicles>vehiclesMap=new HashMap<String, Vehicles>();

        int n=Integer.parseInt(rd.readLine());

        for (int i = 0; i < n; i++) {
            String[] tokens=rd.readLine().split("\\s+");

            if (tokens[0].equals("Drive")){
                double distance = Double.parseDouble(tokens[2]);
                if (tokens[1].equals("Car")){
                    System.out.println(car.drive(distance));

                }else if (tokens[1].equals("Truck")){
                    System.out.println(truck.drive(distance));
                }else {
                    System.out.println(bus.drive(distance));
                }
            }else if (tokens[0].equals("Refuel")){
                double refuel=Double.parseDouble(tokens[2]);
                if (tokens[1].equals("Car")){
                    car.refuel(refuel);
                }else if (tokens[1].equals("Truck")){
                    refuel*=0.95;
                    truck.refuel(refuel);
                }else {
                    bus.refuel(refuel);
                }
            }else {
                double distance=Double.parseDouble(tokens[2]);
                System.out.println(bus.drive(distance));
            }
        }

        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());
    }
}
